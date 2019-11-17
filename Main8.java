//7.143
import java.util.Scanner;
public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a;
        int k = 0;
        int j = 0;
        int counter = 0;
        for (int i = 0; i < N; ++i)
        {
            a = sc.nextInt();
            if (a == 0 && k == 0)
                j = 1;
            if (a == 1 && j == 1)
                k++;
            if (a == 0 && k == 1)
                k = 0;
            if (a == 0 && k > 1) {
                counter++;
                k = 0;
            }
        }
        System.out.println(counter);
    }
}
