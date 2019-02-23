import javax.swing.*;

public class metoder4 {
    public static String blankaBort(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) != ' ')
                r = r + s.charAt(i);
        return r;
    }

    public static void main(String[] arg) {
        while (true) {
            String s = JOptionPane.showInputDialog("Skriv in en mening");
            if (s == null)
                break;
            JOptionPane.showMessageDialog(null, blankaBort(s));
            System.exit(0);
        }
    }
}
