import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCSV {
    public WriteCSV(File file) {

        try (FileWriter fr = new FileWriter(file, false);) {
            StringBuilder strBuilder = new StringBuilder();
            for (Plan task : PlanList.getPurpose()) {
                strBuilder.append(task.getAddDate());
                strBuilder.append(";");
                strBuilder.append(task.getAddTime());
                strBuilder.append(";");
                strBuilder.append(task.getDeadline());
                strBuilder.append(";");
                strBuilder.append(task.getAuthor());
                strBuilder.append(";");
                strBuilder.append(task.getDescription());
                strBuilder.append(";");
                strBuilder.append(task.getPurposePriority());
                strBuilder.append("\n");
            }
            fr.append(strBuilder.toString());
        } catch (IOException e) {
            System.out.printf("Ошибка записи! %s", e);
        }
    }
}