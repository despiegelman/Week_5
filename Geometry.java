/**Name: Delia Spiegelman
 * Date: 3/13/24
 * Application name: Geometry
 */
import java.util.*;
import java.text.NumberFormat;
public class Geometry {
    public static void main (String[]args) {
        int m;
        int n;
        int sideOne;
        int sideTwo;
        int hypotenuse;
        double cost;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        m = input.nextInt();
        System.out.print("Enter a positive integer that is less than the one before: ");
        n = input.nextInt();
        input.close();
        sideOne = m * m - n * n;
        sideTwo = 2 * m * n;
        hypotenuse = m * m + n * n;
        cost = 2.412 * sideOne + 3.767 * sideTwo + 15.76 * hypotenuse;
        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println("The pythagorean triple based on your inputs is: " + sideOne + "," + sideTwo + "," + hypotenuse);
        System.out.println("The price of this pythagorean triple is " + (money.format(cost)));
    }
}