//7.133
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        /*int lenght = sc.nextInt();
        int max = -1000000000;
        int count = 0;
        int a;
        for(int i = 0; i < lenght; ++i)
        {
            a = sc.nextInt();
            if (a > max)
            {
                count = 0;
                max = a;
                count++;
            }
            else if (a == max)
            {
                count++;
            }
        }
        System.out.println(count);*/
        int lenght = sc.nextInt();
        int max;
        int count = 0;
        int a;
        a = sc.nextInt();
        max = a;
        count++;
        for(int i = 0; i < lenght - 1; ++i)
        {
            a = sc.nextInt();
            if (a > max)
            {
                count = 0;
                max = a;
                count++;
            }
            else if (a == max)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
