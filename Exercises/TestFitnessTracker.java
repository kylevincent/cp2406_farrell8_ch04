import java.text.ParseException;

/**
 * Created by jc431075 on 18/08/17.
 */
public class TestFitnessTracker
{
    public static void main(String[]args) throws ParseException {
        FitnessTracker newAct = new FitnessTracker();

        System.out.println(newAct.getActivity() + " "+ newAct.getMinutes()+ " minuites on "+ newAct.getDate());
    }
}
