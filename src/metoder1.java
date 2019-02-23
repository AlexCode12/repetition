import javax.swing.*;

public class metoder1 {

    public static double pris (double exkl, double procent) {
        return exkl + exkl*procent/100;
    }

    public static void main(String[] args) {
        while (true) {
            String s = JOptionPane.showInputDialog("Vad kostar varan vanligtvis?");
            if (s == null)
                break;
            double x = Double.parseDouble(s);
            JOptionPane.showMessageDialog(null, "Nytt pris är " + pris(x, -15));
            System.exit(0);
        }
    }
}
