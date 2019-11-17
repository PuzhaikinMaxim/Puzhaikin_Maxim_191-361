import java.util.Scanner;
public class Main3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int first = 0;
        int last = 0;
        int count = 0;
        int a;
        int k1,k2;
        int N = sc.nextInt();
        a = sc.nextInt();
        int max = a;
        count++;
        first = count;
        for (int i = 0; i < N - 1; ++i)
        {
            a = sc.nextInt();
            k2 = a;
            count++;
            if (a > max)
            {
                max = a;
                first = count;
            }
            k1 = k2;
        }
        System.out.println(first);
        System.out.println(last);
    }
}
