package assignmentone;

import java.util.Scanner;

/**
 *
 * @author Richard Noteboom
 */
public class AssignmentOne 
{
    public static void main(String[] args) 
    {
        comparison();  // function call for comparison
        forLoop();     // function call for interest 
        whileSwitch(); // function call for weather
    }
    public static void comparison()
    {
        Scanner sc = new Scanner(System.in);
        
        int a, b;
        
        System.out.println("Enter first integer:");
        a = sc.nextInt();
        System.out.println("Enter second integer:");
        b = sc.nextInt();
        
        if(a == b)
            System.out.println(a + " = " + b);
        else if(a != b)
            System.out.println(a + " != " + b);
        if(a < b)
            System.out.println(a + " < " + b);
        else if(a > b)
            System.out.println(a + " > " + b);
        if(a <= b)
            System.out.println(a + " <= " + b);
        else if(a >= b)
            System.out.println(a + " >= " + b);
    }
    
    public static void forLoop()
    {
        double amount = 0, principle, rate, time, ci, t = 1;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter initial principle");
        principle = sc.nextDouble();
        System.out.println("Enter interest rate");
        rate = sc.nextDouble();
        System.out.println("Enter investment years");
        time = sc.nextDouble();
        
        rate = 1 + rate / 100;
        
        for(int i = 0; i < time; i++)
            t = t * rate;
        amount = principle * t;
        System.out.println(amount);
        ci = amount - principle;
        System.out.println(ci);
    }
    
    public static void whileSwitch()
    {
        int day = 0, rain = 0;
        
        while(day < 7)
        {
            switch (day)
            {
                case 0:
                    System.out.println("Sunday we got 1 inch of rain");
                    rain++;
                    break;
                case 1:
                    System.out.println("Monday we got 2 inch of rain");
                    rain = rain + 2;
                    break;
                case 2:
                    System.out.println("Tuesday we got 3 inch of rain");
                    rain = rain + 3;
                    break;
                case 3:
                    System.out.println("Wednesday we got 4 inch of rain");
                    rain = rain + 4;
                    break;
                case 4:
                    System.out.println("Thursday we got 5 inch of rain");
                    rain = rain + 5;
                    break;
                case 5:
                    System.out.println("Friday we got 6 inch of rain");
                    rain = rain + 6;
                    break;
                case 6:
                    System.out.println("Saturday we got 7 inch of rain");
                    rain = rain + 7;
                    break;
                default:
                    System.out.println("Invalid day");
                    break;
            }
            day++;
        }
        System.out.println("We got " + rain + " inches of rain this week!");
    }
    
}
