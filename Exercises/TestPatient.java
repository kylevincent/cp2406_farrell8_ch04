/**
 * Created by jc431075 on 22/08/17.
 */
public class TestPatient
{
    public static void main(String[]args)
    {
        Patient pat1 = new Patient();
        System.out.println("ID NUM: "+ pat1.ID_Number + "\nAge: "+ pat1.age + "\nBlood Type: " + pat1.patientData.blood_type + "\nFN: " + pat1.patientData.rh_factor);
        Patient pat2 = new Patient(246, 28, "A", '+');
        System.out.println("ID NUM: "+ pat2.ID_Number + "\nAge: "+ pat2.age + "\nBlood Type: " + pat2.patientData.blood_type + "\nFN: " + pat2.patientData.rh_factor);
    }
}

