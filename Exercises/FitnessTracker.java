import java.time.*;
public class FitnessTracker
{
    String activity;
    int minutes;
    LocalDate date;
    public FitnessTracker()
    {
        this("legging it", 1, LocalDate.of(2017,5,28));
    }
    public FitnessTracker(String a, int m, LocalDate d)
    {
        activity = a;
        minutes = m;
        date = d;
    }
    public String getActivity()
    {
        return activity;
    }
    public int getMinutes()
    {
        return minutes;
    }
    public LocalDate getDate()
    {
        return date;
    }
}