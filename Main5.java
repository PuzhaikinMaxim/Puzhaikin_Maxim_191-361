//7.139
import java.util.Scanner;
public class Main5 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int N = sc.nextInt();
        int a;
        int mem = 0;
        a = sc.nextInt();
        mem = a;
        count++;
        for(int i = 0; i < N - 1; ++i)
        {
            a = sc.nextInt();
            if (mem < a)
                count++;
            mem = a;
        }
        System.out.println(count);
    }
}
