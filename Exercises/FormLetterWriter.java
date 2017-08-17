import javax.swing.*;

public class FormLetterWriter
{
    public static void main(String[]args)
    {
        String FullName = getName();
        String WordsInName[] = FullName.split(" ");
        String firstNameOrNot = JOptionPane.showInputDialog("First name basis yes/no?");
        String correctChoice = "Yes";
        if (firstNameOrNot.toLowerCase().indexOf(correctChoice.toLowerCase()) != -1)
        {
            String firstWord = WordsInName[0];
            String lastWord = WordsInName[WordsInName.length - 1];
            displaySaluation(firstWord, lastWord);
        }
        else
        {
            String lastWord = WordsInName[WordsInName.length - 1];
            displaySaluation(lastWord);
        }
    }

    private static void displaySaluation(String lastName)
    {
        String theDoodsLastName = lastName;
        JOptionPane.showMessageDialog(null,"Dear Mr. or Ms." + theDoodsLastName + ". Thank you for your recent order");
    }

    private static void displaySaluation(String firstName, String lastName)
    {
        String theDoodsFirst = firstName;
        String theDoodsLast = lastName;
        JOptionPane.showMessageDialog(null,"Dear " + theDoodsFirst + theDoodsLast +". Thank you for your recent order");
    }

    public static String getName ()
    {
        String DoodsName = JOptionPane.showInputDialog("Please enter your full name:");
        return DoodsName;
    }

}
