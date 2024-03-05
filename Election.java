import java.util.*;
import java.text.NumberFormat;
class Election {
    public static void main(String[] args) {
        int NewYork_Awbrey;
        int NewYork_Martinez;
        int NewJersey_Awbrey;
        int NewJersey_Martinez;
        int Connecticut_Awbrey;
        int Connecticut_Martinez;
        double AwbreyTotal;
        double MartinezTotal;
        double AwbreyPercentage;
        double MartinezPercentage;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many votes Awbrey collected in New York: ");
        NewYork_Awbrey = input.nextInt();
        System.out.print("Enter how many votes Martinez collected in New York: ");
        NewYork_Martinez = input.nextInt();
        System.out.print("Enter how many votes Awbrey collected in New Jersey: ");
        NewJersey_Awbrey = input.nextInt();
        System.out.print("Enter how many votes Martinez collected in New Jersey: ");
        NewJersey_Martinez = input.nextInt();
        System.out.print("Enter how many votes Awbrey collected in Connecticut: ");
        Connecticut_Awbrey = input.nextInt();
        System.out.print("Enter how many votes Martinez collected in Connecticut: ");
        Connecticut_Martinez = input.nextInt();
        input.close();
        AwbreyTotal = NewYork_Awbrey + NewJersey_Awbrey + Connecticut_Awbrey;
        MartinezTotal = NewYork_Martinez + NewJersey_Martinez + Connecticut_Martinez;
        AwbreyPercentage = AwbreyTotal / (AwbreyTotal + MartinezTotal);
        MartinezPercentage = MartinezTotal / (AwbreyTotal + MartinezTotal);
        NumberFormat percent = NumberFormat.getPercentInstance();
        System.out.println("Canidate \t Votes \t Percentage");
        System.out.println("Awbrey \t\t" + (AwbreyTotal) + "\t" + (percent.format(AwbreyPercentage)));
        System.out.println("Martinez \t" + (MartinezTotal) + "\t" + (percent.format(MartinezPercentage)));
    }
}




