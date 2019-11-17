//7.135
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        float sum = 0;
        float c;
        for (int i = 0; i < a; ++i)
        {
            c = sc.nextFloat();
            sum = sum + c;
        }
        sum = sum/a;
        System.out.println(sum);
    }
}
