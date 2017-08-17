// This class uses a FixDebugBox class to instantiate two Box objects
public class DebugFour3
{
   public static void main(String args[])
   {
      int width = 12, length = 10, height = 8;
      DebugBox box1 = new DebugBox();
      DebugBox box2 = new DebugBox(width, length, height);
      System.out.println("The dimensions of the first box are");
      DebugBox.showData(width, length, height);
      System.out.print("  The volume of the first box is ");
      box1 = showVolume();
      System.out.println("The dimensions of the second box are");
      box2 = showData();
      System.out.print("  The volume of the second box is ");
      box2.showVolume();
   }
   public static void showVolume(DebugBox aBox)
   {
      double vol = aBox.getVolume();
      System.out.println(vol);
   }

