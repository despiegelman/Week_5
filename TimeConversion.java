import java.util.*;
public class TimeConversion {
    public static void main (String[]args){
        int timeMinutes;
        int minutes;
        int minutesOnes;
        int minutesTens;
        int hours;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time in minutes: ");
        timeMinutes = input.nextInt();
        input.close();
        minutes = timeMinutes % 60;
        minutesOnes = minutes % 10;
        minutesTens = (minutes - minutesOnes)/10;
        hours = (timeMinutes-minutes)/60;
        System.out.println("The time is: " + hours + ":" + minutesTens + minutesOnes);
        /**if (minutes < 10){
            System.out.println("The time is: " + hours + ":0" + minutes);
        }
        else{
            System.out.println("The time is: " + hours + ":" + minutes);
        } */
    }
}
