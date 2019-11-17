//7.145
import java.util.Scanner;
public class Main10 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a;
        int k = 1;
        int count = 0;
        int j = 1;
        for (int i = 0; i < N; ++i)
        {
            a = sc.nextInt();
            if(a == j)
                k++;
            else {
                k = 1;
                j = 1;
            }
            if (k % 2 == 0)
                j = 2;
            else
                j = 1;
            if (k == 7) {
                count++;
                k = 1;
            }
        }
        System.out.println(count);
    }
}
