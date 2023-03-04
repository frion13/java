import java.io.File;
import java.util.Scanner;

public class WriteService {
    public static String path = "/Users/tatiana/Desktop/dz8/data/list";
    static Scanner sc = new Scanner(System.in);

    public static void getChoice() {

        while (true) {
            System.out.println("Записать в формате: 1-XML, 2-CSV, 3-JSON");
            switch (sc.next()) {
                case ("1") -> {
                    writeAsXML();
                    break;
                }
                case ("2") -> {
                    writeAsCSV();
                    break;
                }
                case ("3") -> {
                    writeAsJSON();
                    break;
                }
                default -> System.out.println("Ошибка записи");
            }
        }
    }

    public static void writeAsXML() {
        
        WriteXML purp = new WriteXML(new File(path + ".xml"));
    }

    public static void writeAsCSV() {
        
        WriteCSV purp = new WriteCSV(new File(path + ".csv"));
    }

    public static void writeAsJSON() {
        
        WriteJSON purp = new WriteJSON(new File(path + ".json"));
    }
    
}