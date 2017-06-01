package main;

import java.util.ArrayList;
import java.util.Scanner;

import service.TableDataService;

public class Main
{
    static String date = "  Sunday=1, Monday=2, Tueday=3, Wendsday=4, Thrusday=5, Friday=6, Saturday=7";
    static String month = " January=2, February=3, March=4, April=5,May=6, June=7, July=1, August=2, September=3, October=4, November=5, December=1";
    static String year = "  Rat=1, Ox=2, Tiger=3, Rabbit=4,Dragon=5, Snake=6, Horse=7, Goat=1, Monkey=2, Rooster=3, Dog=4, Pig=5";

    public static void main(String[] args)
    {
        Scanner inputVal = new Scanner(System.in);
        System.out.println("Enter number of date: " + "\n" + date);
        int dateNo = inputVal.nextInt();
        System.out.println("Enter number of month: " + "\n" + month);
        int monthNo = inputVal.nextInt();
        System.out.println("Enter number of yaer: " + "\n" + year);
        int yearNo = inputVal.nextInt();
        TableDataService createDataService = new TableDataService();
        ArrayList<int[]> number = createDataService.getTableResult(dateNo, monthNo, yearNo);
        for(int i = 0; i < number.size(); i++)
        {
            System.out.print("Row " + (i+1) + ":   ");
            for(int j = 0; j < number.get(i).length; j++)
            {
                // expand blank space
                if(i != 3 && j > 2)
                {
                    System.out.print(" ");
                }
                System.out.print("   " + number.get(i)[j] + "  ");
            }
            System.out.println();
            System.out.println("*************************************************************");
        }

    }
}
