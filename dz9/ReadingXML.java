import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadingXML {
    public List<Plan> tasks = new ArrayList<>();

    public ReadingXML(File fName) {
        try (Scanner reading = new Scanner(new BufferedReader(new FileReader(fName)))) {
            StringBuilder stringBuilder = new StringBuilder();
            while (reading.hasNext()) {
                stringBuilder.append(reading.nextLine());
            }
            String str = stringBuilder.toString();
            str = str.replace("\n", "");
            int startIndex = 0;
            while (startIndex < str.length()) {
                int index1 = str.indexOf("<", startIndex);
                int index2 = str.indexOf(">", index1);
                String temporary = new String();
                if (index1 < 0) {
                    index2 = str.length();
                    temporary = "endOfFile";
                } else {
                    temporary = str.substring(index1, index2 + 1);
                }

                



                if (temporary.equals("<задача>")) {

                    
                    LocalDate createData = LocalDate.now();
                    LocalDate deadLine = LocalDate.now();
                    LocalTime createTime = LocalTime.now();
                    String author = new String();
                    String description = new String();
                    String priority = new String();
                    boolean purposeNotEnded = true;


                    while (purposeNotEnded) {
                        int tagIndexStart = str.indexOf("<", index2 + 1);
                        int tagIndexStop = str.indexOf(">", tagIndexStart);
                        String tag = str.substring(tagIndexStart, tagIndexStop + 1);
                        int nextTag = str.indexOf("<", tagIndexStop);
                        String tagValue = str.substring(tagIndexStop + 1, nextTag);
                        switch (tag) {
                            case ("<Дата создания>") -> {
                                createData = LocalDate.parse(tagValue);
                                index2 = nextTag + tag.length();
                            }
                            case ("<Время создания>") -> {
                                createTime = LocalTime.parse(tagValue);
                                index2 = nextTag + tag.length();
                            }
                            case ("<Дедлайн>") -> {
                                deadLine = LocalDate.parse(tagValue);
                                index2 = nextTag + tag.length();
                            }
                            case ("<Автор>") -> {
                                author = tagValue;
                                index2 = nextTag + tag.length();
                            }
                            case ("<Описание>") -> {
                                description = tagValue;
                                index2 = nextTag + tag.length();
                            }
                            case ("<Приоритет>") -> {
                                priority = tagValue;
                                index2 = nextTag + tag.length();
                            }
                            case ("</задача>") -> {
                                purposeNotEnded = false;
                                index2 = tagIndexStop;
                            }
                        }

                    }

                    
                    PlanPriority purposePriority = PlanPriority.valueOf(priority);
                    tasks.add(new Plan(createData, createTime, deadLine, author, description, purposePriority));
                }
                startIndex = index2;
            }
            PlanList.addAll(tasks);

        } catch (Exception e) {
            System.out.println("Ошибка чтения задач");
            System.out.println(e);
        }
    }

}