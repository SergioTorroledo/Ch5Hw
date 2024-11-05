/**
 * Class:PoemWriter.java
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:5.12.2
 * @written on:11/04/2024
 * Course:ITEC 2150-01
 * This class is use the class poem to write a poem give the values a name for the poem and the poet
 * */
package Ch5Hw;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PoemWriter {

    public static void main(String[] args) {
        // Create Poem objects and set their attributes
        Poem poem1 = new Poem();
        poem1.setName("The Road Not Taken");
        poem1.setPoet("Robert Frost");

        Poem poem2 = new Poem();
        poem2.setName("Ode to a Nightingale");
        poem2.setPoet("John Keats");

        Poem poem3 = new Poem();
        poem3.setName("Still I Rise");
        poem3.setPoet("Maya Angelou");

        //  Open poems.txt for writing
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/Ch5Hw/poems.txt"))) {
            //  Write information for each poem
            writePoemToFile(poem1, writer);
            writePoemToFile(poem2, writer);
            writePoemToFile(poem3, writer);

            System.out.println("Poems written to poems.txt successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    // Helper method to write a single Poem object to the file
    private static void writePoemToFile(Poem poem, BufferedWriter writer) throws IOException {
        writer.write(poem.getName());
        writer.newLine();
        writer.write(poem.getPoet());
        writer.newLine();
    }
}

