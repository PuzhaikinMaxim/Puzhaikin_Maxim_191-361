//7.142
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a;
        int mem1;
        int mem2;
        int counter_min = 0;
        int counter_max = 0;
        int N = sc.nextInt();
        a = sc.nextInt();
        mem1 = a;
        mem2 = a;
        counter_max++;
        counter_min++;
        for (int i = 0; i < N - 1; ++i)
        {
            a = sc.nextInt();
            if (a > mem1) {
                mem1 = a;
                counter_max++;
            }
            else
                counter_max = 0;
            if (a < mem1 || a < mem2)
            {
                mem2 = a;
                counter_min++;
            }
            else counter_min = 0;
        }
        if (counter_max > counter_min)
        System.out.println(counter_max);
        else
        System.out.println(counter_min);
    }
}
