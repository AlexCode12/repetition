import javax.swing.*;

public class metoder2 {

    public static void visaTab(int tal) {
        String tabell = "";
        for (int i=1; i<=10; i++) {
            tabell = tabell + i + "  " + tal*i + "\n";
        }
        JOptionPane.showMessageDialog(null, tabell);

    }
    public static void main (String[] arg) {
        while (true) {
            String s = JOptionPane.showInputDialog("Skriv ett tal");
            if (s == null)
                break;
            int n = Integer.parseInt(s);
            visaTab(n);
            System.exit(0);
        }
    }
}