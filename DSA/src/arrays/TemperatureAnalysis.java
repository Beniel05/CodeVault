package arrays;

import java.util.Scanner;

public class TemperatureAnalysis {

    // Overall Time Complexity: O(n)
    // Overall Space Complexity: O(n)
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the total number of days: ");
    int days = sc.nextInt();

    // Time: O(1) | Space: O(1)
    if (days <= 0) {
        System.out.println("Number of days must be greater than 0");
        return;
    }

    // Space Complexity: O(n). Where, n = number of days
    int[] arr = new int[days]; // Setting the size of the array by user's input

    // Reading temperatures for each day
    // Time Complexity: O(n)
    for (int thatDay = 0; thatDay < arr.length; thatDay++) {
        System.out.print("Day " + (thatDay + 1) + "'s high temp: ");
        arr[thatDay] = sc.nextInt();
    }

    // temperatureSum - later used to find the average temperature
    // Time: O(n) | Space: O(1)
    double temperatureSum = 0;
    for (int eachDay : arr) {
        temperatureSum += eachDay;
    }

     // Average temperature
     // Time: O(1) | Space: O(1)
     double averageTemperature = temperatureSum/arr.length;
     System.out.println("Average = " + averageTemperature);

     // How many days are above average temperature
     // Time: O(n) | Space: O(1)
     int aboveAvgCount = 0;
     for (int i = 0; i < arr.length; i++) {
         if (arr[i] > averageTemperature){
             System.out.println("Day: " + (i+1) + " has recorded above average temperature.");
             aboveAvgCount++;
         }
     }

     System.out.println("Total: " + aboveAvgCount + " day(s) is above average");

     sc.close();
     }
}
