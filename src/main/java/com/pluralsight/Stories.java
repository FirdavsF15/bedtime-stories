package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Stories {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of a story: ");
        String storyName = scanner.nextLine();

        try{
            FileReader fileReader = new FileReader(storyName);
            BufferedReader bufReader = new BufferedReader(fileReader);

            String input;
            int counter= 1;
            while((input = bufReader.readLine()) != null){
                System.out.println(counter+ ". " + input);
                counter++;
            }

            bufReader.close();
        }catch(Exception e){
            System.out.println("Oops file not found");
        }







    }
}
