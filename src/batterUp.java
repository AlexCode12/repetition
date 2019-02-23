import java.util.Scanner;

public class batterUp {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int bat, s = n;
        double bats =0 ;
        for (int i=0; i<s; i++) {
            bat = sn.nextInt();
            if (bat == -1) {
                n--;
            } else {
                bats +=bat;
            }
        }
        System.out.println(bats/n);
    }
}
