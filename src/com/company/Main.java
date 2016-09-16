package com.company;

import java.util.*;
//the * gives you all of the stuff for that genre ".util"
public class Main {

    public static void main(String[] args) {
	    //this is NOT tested on the AP exam, but its UBER  important
        //necessary for Mr. P projects

        //STEP 1 - Access Scanner class
        Scanner kb = new Scanner(System.in);
        //STEP 2 - ask the user a question
        System.out.println("Enter your favorite integer");
        //STEP 3 - record the user input
        int i = kb.nextInt();
        System.out.println("Your number was " + i);

        //now with doubles
        //there is no need to repeat step 1
        System.out.println("Enter your favorite double");
        double d = kb.nextDouble();
        System.out.println("Your number was " + d);

        //a really screwy thing with java real quick... you cant hav "nextDouble" and 'nextLine" right after it

        //now with strings
        System.out.println("Enter your favorite color");
        String color = kb.next();
        System.out.println("Your color was " + color);
    }
}
