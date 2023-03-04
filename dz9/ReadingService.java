import java.io.File;
import java.util.Scanner;

public class ReadingService {
    static Scanner sc = new Scanner(System.in);
    public static String path = "/Users/tatiana/Desktop/dz8/data/list";

    public static void getChoice() {
      System.out.println("imp");

        boolean repeatInput = true;
        while (repeatInput) {
            System.out.println("Из какого файла прочитать: 1-XML, 2-CSV, 3-JSON");
            switch (sc.next()) {
                case ("1") -> {
                    ReadingXML();
                    repeatInput = false;
                }
                case ("2") -> {
                    ReadingCSV();
                    repeatInput = false;
                }
                case ("3") -> {
                    ReadingJSON();
                    repeatInput = false;
                }
                default -> System.out.println("Ошибка чтения");
            }
        }
    }

    public static void ReadingXML() {
        
        ReadingXML imp = new ReadingXML(new File(path + ".xml"));
        
        int iterator = 1;
        for (Plan task : imp.tasks) {
          System.out.println( "-------");
          System.out.println("Задача");
          System.out.println(iterator);
          System.out.println("Дата создания:");
          System.out.println(task.getAddDate());
          System.out.println("Время создания:");
          System.out.println(task.getAddTime());
          System.out.println("Дедлайн:");
          System.out.println(task.getDeadline());
          System.out.println("Автор:");
          System.out.println(task.getAuthor());
          System.out.println("Описание:");
          System.out.println(task.getDescription());
          System.out.println("Приоритет:");
          System.out.println(task.getPurposePriority());
          iterator++;
      }

        
    }

    public static void ReadingCSV() {
        
        ReadingCSV imp = new ReadingCSV(new File(path + ".csv"));

    }

    public static void ReadingJSON() {
        
        ReadingJSON imp = new ReadingJSON(new File(path + ".json"));

     
    }
}