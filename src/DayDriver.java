import javax.swing.*;

public class DayDriver {
    public static void main (String [] args){
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number between 0-6 for today"));
        Day day=new Day(n%7);

    System.out.println("Today is " + day.getDay());
    System.out.println("Tomorrow is "  + day.nextDay());
    System.out.println("Yesterday is " + day.previousDay());

    int x =Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number for future day"));
    System.out.println( day.getDay()+ " After " + x + " day is "+ day.futureDay(x));

    int y =Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number for pass day"));
    System.out.println( day.getDay()+ " before " + y + " day is "+ day.passDay(y));
    System.out.println(day.toString());
}
}
