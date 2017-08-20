public class TestBloodData
{
    public static void main(String[] args)
    {
        BloodData testGet = new BloodData();
        BloodData testSet = new BloodData();
        System.out.println("Your blood type is " + testGet.getBlood_type() + ", and your RH Factor is " + testGet.getRh_factor());
        System.out.println("Your blood type is " + testSet.setBlood_type() + ", and your RH Factor is " + testSet.setRh_factor());


    }
}
