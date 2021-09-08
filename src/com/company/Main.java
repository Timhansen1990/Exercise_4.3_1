package com.company;

public class Main {
     public static void PrintAmerican (String day, int date, String month, int year )
    {
        System.out.print("American format: ");
        System.out.printf("%s, %s, %d, %d", day, month,date,year);
        System.out.print("\n");
    }
    public static void PrintEurope (String day, String month, int date, int year )
    {
        System.out.print("Europe Format: ");
        System.out.printf("%s, %d, %s, %d", day, date,month,year);
    }
    public static void main(String[] args) {
	// write your code here
        PrintAmerican("wednesday", 8, "september", 2021);
        PrintEurope("wednesday", "September", 8, 2021);

    }

}
