/*
* This program lets you either put in a roman numeral and it will give you the number value
* or put a number and it will give you the roman numeral
* Gabe Granado
* 11/25/18
* version 1
* */

import java.util.ArrayList;//for making an array list

public class RomanNumerals {

    //this method takes a number and give the roman numeral equivilant
    public static String numbersToRomanNumerals(int num){
        //this will be the string that gives us the roman numeral
        String romanNueralNumber="";
        //theses ints gives use how many of them their are for example how many ones their are so if the number is 3 their
        //are 3 ones
        //it works by taking the remander of the previouse number
        int thousandPlace= num/1000;
        int thousandPlaceRemainder =num%1000;
        int fiveHundredPlace=thousandPlaceRemainder/500;
        int fiveHundredPlaceRemainder=thousandPlaceRemainder%500;
        int hundredPlace=fiveHundredPlaceRemainder/100;
        int hundredPlaceRemainder=fiveHundredPlaceRemainder%100;
        int fiftythPlace=hundredPlaceRemainder/50;
        int fiftythPlaceRemainder=hundredPlaceRemainder%50;
        int tenthPlace=fiftythPlaceRemainder/10;
        int tenthPlaceRemainder=fiftythPlaceRemainder%10;
        int fithPlace=tenthPlaceRemainder/5;
        int fithPlaceRemainder=tenthPlaceRemainder%5;
        //these fors add the corisponding letter to how many of the number their are
        //for example if their are 3 ones then the roman numerals add I three times so III
        for (int i=0;i<thousandPlace;i++){romanNueralNumber=romanNueralNumber+"M";}
        for (int i=0;i<fiveHundredPlace;i++){romanNueralNumber=romanNueralNumber+"D";}
        for (int i=0;i<hundredPlace;i++){romanNueralNumber=romanNueralNumber+"C";}
        for (int i=0;i<fiftythPlace;i++){romanNueralNumber=romanNueralNumber+"L";}
        for (int i=0;i<tenthPlace;i++){romanNueralNumber=romanNueralNumber+"X";}
        for (int i=0;i<fithPlace;i++){romanNueralNumber=romanNueralNumber+"V";}
        for (int i=0;i<fithPlaceRemainder;i++){romanNueralNumber=romanNueralNumber+"I";}
        //these if check to see if their are number that are too long and can be shorten with a shorter version of it
        if (romanNueralNumber.contains("LXXXX")){
            romanNueralNumber=romanNueralNumber.replace("LXXXX","XC");
        }
        if(romanNueralNumber.contains("VIIII")){
            romanNueralNumber=romanNueralNumber.replace("VIIII","IX");
        }
        if(romanNueralNumber.contains("XXXX")){
            romanNueralNumber=romanNueralNumber.replace("XXXX","XL");
        }
        if(romanNueralNumber.contains("DCCCC")){
            romanNueralNumber=romanNueralNumber.replace("DCCCC","CM");
        }
        System.out.println(romanNueralNumber);
        return romanNueralNumber;//returns the string
    }

    //this takes a romannumeral and gives back the number
    public static int romanNumeralstoNumber (String number){
        char character;
        number=number.toUpperCase();
        int romanNumeralNumber=0;
        //these if's check to see if their is any short hand going on and if their is it will add it to the number
        if (number.contains("CM")){
            romanNumeralNumber=romanNumeralNumber+900;
            number=number.replace("CM","");}

        if (number.contains("XC")){
            romanNumeralNumber=romanNumeralNumber+90;
            number=number.replace("XC",""); }


        if (number.contains("IX")){
            romanNumeralNumber=romanNumeralNumber+9;
            number=number.replace("IX","");}

        if (number.contains("XL")){
            romanNumeralNumber=romanNumeralNumber+40;
            number=number.replace("XL","");}
        ArrayList<Character> letter = new ArrayList<>();
        //this for takes the whole string and but each charcter in an arraylist
        for(int i=0; i<number.length();i++) {
            character = number.charAt(i);
            letter.add(character);
        }
        //this for loop checks all the characters at every index and if the character is a certain character
        //it will add the number to the romannumerealnumbers for example if the arraylist contain
        //['I','I','I'] the romannumeralnumbers will be 3
        for (Character c:letter){
            if(c=='I'){romanNumeralNumber=romanNumeralNumber+1;}
            if(c=='V'){romanNumeralNumber=romanNumeralNumber+5;}
            if(c=='X'){romanNumeralNumber=romanNumeralNumber+10;}
            if(c=='L'){romanNumeralNumber=romanNumeralNumber+50; }
            if(c=='C'){romanNumeralNumber=romanNumeralNumber+100;}
            if(c=='D'){romanNumeralNumber=romanNumeralNumber+500;}
            if(c=='M'){romanNumeralNumber=romanNumeralNumber+1000;}

        }
        System.out.println(romanNumeralNumber);
        return romanNumeralNumber;//returns the number
    }
}