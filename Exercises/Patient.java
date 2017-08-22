public class Patient
{
    Integer ID_Number, age;
    BloodData patientData = new BloodData();
    public Patient()
    {
        ID_Number = 21;
        age = 84;
        patientData.blood_type = "O";
        patientData.rh_factor = '+';
    }
    public Patient(Integer ID_Number, Integer age, String blood_type, Character rh_factor)
    {
        this.ID_Number = ID_Number;
        this.age = age;
        patientData = new BloodData(blood_type, rh_factor);
    }

    public Integer getID_Number()
    {
        return ID_Number;
    }

    public Integer getAge()
    {
        return age;
    }

    public BloodData getBloodData()
    {
        return patientData;
    }

    public void setBloodData(BloodData b)
    {
        patientData = b;
    }


}
