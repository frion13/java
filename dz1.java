import java.util.Scanner;
public class dz1 {
    static int triangl (int a) {
        if (a == 1)
            return 1;
        else
            return a + triangl(a-1);
    }
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите  число:");
        int num = iScanner.nextInt();
        int answer = triangl(num);
        System.out.printf("Число равно %d", answer);
        iScanner.close();
    }
    
