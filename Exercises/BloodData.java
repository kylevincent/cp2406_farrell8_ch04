import javax.swing.*;

public class BloodData {
    String blood_type;
    Character rh_factor;

    public BloodData() {
        blood_type = "O";
        rh_factor = '+';
    }

    public BloodData(String blood_type, Character rh_factor) {
    }

    public String getBlood_type() {
        return blood_type;
    }

    public String setBlood_type() {
        blood_type = JOptionPane.showInputDialog(null, "Enter your blood type: (O, A, B, or AB");
        return blood_type;
    }

    public Character getRh_factor() {
        return rh_factor;
    }

    public Character setRh_factor() {
        String testString;
        testString = JOptionPane.showInputDialog(null, "enter your RH please: (+ or -)");
        rh_factor = testString.charAt(0);
        return rh_factor;
    }
}
