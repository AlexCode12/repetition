import javax.swing.*;
import java.util.Calendar;

public class metoder3 {

    public static String klockan () {
        String s = Calendar.getInstance().getTime().toString();
        int i = s.indexOf(':');
        return s.substring(i-2, i+6);
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Klockan är " + klockan());
        JOptionPane.showMessageDialog(null, "THAT MEANS IT'S ALEX TIME");

    }
}
