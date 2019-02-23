import java.util.Scanner;

public class tarifa {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int x = sn.nextInt();
        int n = sn.nextInt();
        int val = x;
        for (int i=0 ; i<n ; i++) {
            val = val + (x-sn.nextInt());
        }
        System.out.println(val);

    }
}
