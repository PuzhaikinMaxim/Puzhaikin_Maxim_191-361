//7.144
import java.util.Scanner;
public class Main9 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a;
        int k = 1;
        int counter = 0;
        for (int i = 0; i < N; ++i)
        {
            a = sc.nextInt();
            if (a == k)
                k++;
            else
                k = 1;
            if (k == 7) {
                counter++;
                k = 1;
            }
        }
        System.out.println(counter);
    }
}
