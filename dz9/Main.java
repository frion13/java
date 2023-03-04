import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static String getValue() {
        System.out.println(
                "1-добавить задачу\n2-удалить задачу\n3-читать список задач\n4-записать список задач");
        System.out.print("Введите цифру: ");
        return sc.next();
    }

    public static void main(String[] args) {
        int currentTask = 0;
        while (true) {
            if (PlanList.getPurpose().size() > 0) {
                Plan.print(PlanList.getPurposeById(0));
            }
            switch (getValue()) {
                case ("1"):
                    AddPlan.purposeAdd();
                    currentTask = 0;
                    break;
                case ("2"):
                    DeletePlan.purposeDelete();
                    currentTask = 0;
                    break;
            
                case ("3"):
                    ReadingService.getChoice();
                    break;
                case ("4"):
                    WriteService.getChoice();
                    break;
              
                default:
                    System.out.println("Неверный ввод");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
            }
        }
    }
}