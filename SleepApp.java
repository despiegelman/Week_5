import java.util.*;
public class SleepApp {
    public static void main (String[]args){
        int yearBday;
        int monthBday;
        int dayBday;
        int yearNow;
        int monthNow;
        int dayNow;
        int alive;
        int slept;
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your Birthday: ");
        System.out.print("Year: ");
        yearBday = input.nextInt();
        System.out.print("Month: ");
        monthBday = input.nextInt();
        System.out.print("Day: ");
        dayBday = input.nextInt();
        System.out.println("Enter today's date: ");
        System.out.print("Year: ");
        yearNow = input.nextInt();
        System.out.print("Month: ");
        monthNow = input.nextInt();
        System.out.print("Day: ");
        dayNow = input.nextInt();
        input.close();
        alive = (yearNow-yearBday)*365 + (monthNow-monthBday)*30 + (dayNow-dayBday);
        slept = alive * 8;
        System.out.println("You have been alive for " + alive + " days");
        System.out.println("You have slept for " + slept + " hours");
    }
}
