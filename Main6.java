import java.util.Scanner;
public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int min;
        int sec;
        int a;
        int k = 0;
        a = sc.nextInt();
        min = a;
        sec = a;
        for (int i = 0; i < N - 1; ++i)
        {
            if (i != 0)
            {
                if (k > min && sec >= k)
                    sec = k;
            }
            a = sc.nextInt();
            if (a < min)
                min = a;
            k = a;
        }
        System.out.println(sec);
    }
}
