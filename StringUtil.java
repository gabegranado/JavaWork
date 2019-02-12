/*
* this program takes a car lican plate
* and then gives the rental tag id
*
* Gabe Granado
* 11/13/18*/


import java.util.Scanner;

public class StringUtil {

    //this method fines the rental car id
public static String licenPlate(String licenPlate,String make,String model){
    int aciiadd=0;//this will be used to find the acii value added together
    String licenPlateNumToString="";//this will be used to get the numbers in a string varible
    int licenPlateNumToInt=0;//this will make the licenplate number to an int
    char[] licenPlateToChar = licenPlate.toCharArray();//this will take each character in a string and seperate it in a for loop
    for (char output: licenPlateToChar) {
        //the for loop will run until their is no character left
        int aciiValue = Character.getNumericValue(output);//this gets the numerical value of the letters or the numbers
        if (output>64) {//all letter will be over 64
            aciiValue=aciiValue+55;//if you add 55 it is the exact acii value
            aciiadd = aciiadd + aciiValue;//this makes it so you find the sum of all the acii values
        }

        else if (aciiValue<10& aciiValue >-1){//if its less than ten then its a number value but a space is -1 so it has to greater than -1
            licenPlateNumToString =licenPlateNumToString+aciiValue;//this takes the num and adds the character
            licenPlateNumToInt= Integer.parseInt(licenPlateNumToString);
            //this makes the numbers an int instead of a string
        }
    }
    aciiadd =aciiadd+licenPlateNumToInt;//this adds the numbers in the licen plate plus the acii values
    int aciiRemander= (aciiadd%26) +65;//find the remander of the acii add then add 65 bcause a starts at 65 and if you add it to that you will find the fourth letter with that value
    licenPlateToChar = Character.toChars(aciiRemander);//this will make the number to a character
    //these are just print statements
    System.out.println("MAKE = "+make);
    System.out.println("MODEL = "+ model);
    System.out.print(licenPlateToChar);
    System.out.println(aciiadd);
    return licenPlate;
}
}
