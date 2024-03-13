/**Name: Delia Spiegelman
 * Date: 3/13/24
 * Application name: Building
 */
import java.util.*;
import java.text.NumberFormat;
public class Building {
    public static void main (String[]args) {
        int numberPoles;
        double concrete;
        int concreteIntegerYards;
        double price;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of poles you need: ");
        numberPoles = input.nextInt();
        input.close();
        concrete = 9 * 5 * Math.PI * numberPoles;
        concreteIntegerYards = (int)(concrete) / 27;
        price = concrete / 27 * 12.98;
        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println("You need about " + (concreteIntegerYards) + " cubic yards of concrete which will cost " +  (money.format(price)));
    }
}
