package bsu.comp152;

import javax.imageio.IIOException;
import java.io.*;
import java.util.Scanner;

public class StoryReadandWrite {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String name, location;
        int age;
        String fileInfo = " ";
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Do you want to Read or Write to a file? (R - read or W - write): ");
        String answer = Keyboard.nextLine();
        if (answer.equals("R") || answer.equals("r")){
            File RWfile = new File("RWfile");
            Scanner fileReader = new Scanner(RWfile);
            while (fileReader.hasNext()){
                fileInfo = fileReader.nextLine() + "\n";
            }
            System.out.println(fileInfo);
        }
        if (answer.equals("W") || answer.equals("w")){
            FileWriter RWfile = new FileWriter("RWfile");
            PrintWriter fileWriter = new PrintWriter("RWfile");

            System.out.println("Name of Character: ");
            name = Keyboard.nextLine();

            System.out.println("Name of Location: ");
            location = Keyboard.nextLine();

            System.out.println("Your age: ");
            age = Keyboard.nextInt();

            Keyboard.nextLine();

            fileWriter.printf("%s went to %s at the age %d and came back", name, location, age);
            fileWriter.close();
        }
    }
}
