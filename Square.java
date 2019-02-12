/*
this program has you put a number and it will tell you if its
a magic square a magic square is a number that is a perfect
square and a number in which a sequence of number starting a
one onward add together equals the number

Gabe Granado 11/13/2018
* */
public class Square {
    //this is the method that finds out if its a perfect square
    public static boolean perfectSquare(int num){
        int i =1;
        int square=1;
        //this for statment makes it so that square will
        //be equal to i times itself and if it is perect the the number divided
        //square is equal to one it is a perfect square
        for (;square<num;i++){
            square=i*i;
        }
        i=i-1;
        //this is the if that checks if its a perfect square
        if(num/square == 1){
            return true;
        }
        //if its not then its not one and is false
        else {
            return false;
        }


    }

    //this checks to see if the number is equal to the addition of number
    //starting with one and so on
    public static boolean sumOfSeq(int x) {
        int num=1;
        int i=0;

        //this makes it so it will start with one then add that number to the
        //previouse numbers so first one then three then 6 and so on
        //and i is the counter to so what number your one
        for (;num<=x;i++){
            num=num+i;
            //this adds the previous numbers to the next number
        }
        //since the for loop runs one extra time you have to minus one
        num=num-1;
        //check to see if the addition of sequence is equal to the x varible
        if (num==x) {
            return true;
        }
        //if not its false
        else{
            System.out.println(false);
            return false;
        }
    }

    //thisi takes the previouse methods and gets the answer of either true or false
    //if it they are both true then its a magic square
    //if it one or both are false then it is not a magic square
    public static void magicSquares(int n){
        if(perfectSquare(n)==true& sumOfSeq(n)==true){
            System.out.println("num "+ n+" is a magic square");

        }
        else{
            System.out.println("num "+n+" is not a magic square");
        }

    }

}
