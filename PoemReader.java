/**
 * Class:PoemReader.java
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:5.12.3
 * @written on:11/04/2024
 * Course:ITEC 2150-01
 * This class is use the class poem to read poems
 * */
package Ch5Hw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PoemReader {

    public static void main(String[] args) {
        ArrayList<Poem> poems = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("src/Ch5Hw/poem2.txt"))) {
            String name;
            String poet;

            // Read each pair of lines to create Poem objects
            while ((name = reader.readLine()) != null && (poet = reader.readLine()) != null) {
                Poem poem = new Poem();
                poem.setName(name);
                poem.setPoet(poet);
                poems.add(poem);
            }

            // Print each poem's information to the console
            for (Poem poem : poems) {
                System.out.println("Poem Name: " + poem.getName());
                System.out.println("Poet: " + poem.getPoet());
                System.out.println(); // Print a blank line between each poem
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}

