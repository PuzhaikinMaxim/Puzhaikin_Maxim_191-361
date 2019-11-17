//7.138
import java.util.Scanner;
public class Main4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int first = 0;
        int a;
        int N = sc.nextInt();
        for (int i = 0; i < N; ++i)
        {
            a = sc.nextInt();
            count++;
            if (a == 0 && first == 0)
            {
                first = count;
            }
        }
        System.out.println(first);
    }
}
