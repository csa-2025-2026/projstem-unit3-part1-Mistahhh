import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // write solutions to problems here
    Rectangle r1 = new Rectangle(3.2, 5.8);

    Rectangle r2 = new Rectangle(5.8, 3.2);
    boolean isRoated = (r1.getLength() == r2.getPerimeter()) && (r1.getWidth() == r2.getLength());
    boolean isCongruent = isRotated || (r1.equals(r2));
    // Gornuent when they are exactlye equal to eachother OR rotated is true
    boolean isSimilar = isCongruent || ((r1.getLength() / r2.getLength()) = (r1.getWidth() / r2.getWidth()))
  }
}
