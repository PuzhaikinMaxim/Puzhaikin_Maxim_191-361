//7.136
import java.util.Scanner;
public class Main7 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = 0;
        int mem;
        int max = 0;
        int a = sc.nextInt();
        mem = a;
        for(int i = 0; i < N - 1; ++i)
        {
            a = sc.nextInt();
            if (mem == a)
                k++;
            else
                k = 0;
            if (k > max)
                max = k;
            mem = a;
        }
        if (max > 0)
        System.out.println(max + 1);
        else
            System.out.println(0);
    }
}
