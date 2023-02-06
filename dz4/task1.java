import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;



public class task1 {

    public static void main(String[] args) {
        Random random = new Random();
        LinkedList<Integer> list = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер списка => ");
        Integer n = scan.nextInt();
        for (int i = 0; i <n; i++){
            int num = random.nextInt(-50, 50);
            list.add(num);
        }
        System.out.printf("Исходный список %s ", list);
        System.out.println(); 
        LinkedList<Integer> reverselist = new LinkedList<>();           
        for(int i=list.size()-1; i>=0; i--){
            reverselist.add(list.get(i));
        }
        System.out.printf("'Перевернутый' список %s", reverselist);
        scan.close();
    }
}