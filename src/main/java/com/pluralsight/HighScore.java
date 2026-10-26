package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HighScore {
    public static void main(String[] args) {

        //User inputted String input
        String input = ("Home:Visitor|21:9");

        String[] inputParts = input.split(Pattern.quote("|"));
       //  inputParts[0] = ("Home:Visitor");  //inputParts[1] = ("21:9");

        String[] teams = inputParts[0].split(Pattern.quote(":"));
        // split teams[0] = ("Home")   teams[1] = ("Visitor")

        String[] scores = inputParts[1].split(Pattern.quote(":"));
        // split scores[0] = ("21")   teams[1] = ("9")


        int homeScore = Integer.parseInt(scores[0]);
        int visitorScore = Integer.parseInt(scores[1]);

        String winningTeam;


        //Attempt doing w/ max value

        if(homeScore > visitorScore) {
            winningTeam = "Winning Team: " + teams[0];


        }
        else {
            winningTeam = "Winning Team: " + teams[1];
        }

        System.out.println(winningTeam);
        /* Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the home score: ");
        String homeScore = myScanner.nextLine();


        Prompt the user for a game score and the user will input a score in the following format:
Home:Visitor|21:9
Based on the user input, you should determine which team had the higher score and
display the name of the winning team.
Hint: You will have to split the user input multiple times
- one split will be on the pipe ( | )
- one split will be on the colon ( : )*/


    }
}
