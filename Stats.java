/**
 * Class:Stats.java
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:5.12.1
 * @written on:11/04/2024
 * Course:ITEC 2150-01
 * This class read the file Book1.csv that contain numbers from 0 to 10 and then write the values from lowest , highest ,average and total number to the stats.txt
 * */
package Ch5Hw;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Stats {
    public static void main(String[] args) {
        try {
            // Open the CSV file
            File file = new File("src/Ch5Hw/Book1.csv"); // Ensure the file path is correct
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter(","); // Set delimiter to comma for CSV format

            int sum = 0;
            int count = 0;
            int lowest = Integer.MAX_VALUE;
            int highest = Integer.MIN_VALUE;

            //  Process each number in the CSV file
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) { // Make sure the next token is an integer
                    int number = scanner.nextInt();

                    sum += number;
                    count++;

                    // Update lowest and highest values
                    if (number < lowest) {
                        lowest = number;
                    }
                    if (number > highest) {
                        highest = number;
                    }
                } else {
                    // Skip any non-integer tokens, just in case
                    scanner.next();
                }
            }
            scanner.close();

            // Calculate average
            double average = (count > 0) ? (double) sum / count : 0; // Avoid division by zero

            //  Write results to stats.txt
            FileWriter writer = new FileWriter("src/Ch5Hw/stats.txt");
            writer.write("The sum of the numbers is: " + sum + "\n");
            writer.write("The lowest number is: " + lowest + "\n");
            writer.write("The highest number is: " + highest + "\n");
            writer.write("The average of the numbers is: " + average + "\n");
            writer.close();

            System.out.println("Statistics written to stats.txt successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred while reading or writing files.");
            e.printStackTrace();
        }
    }
}
