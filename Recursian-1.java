/*
* This is a program that gives you any fibanacci number when given teh index of the fibancci sequence for example the tenth place
* of the fibanacci is 55 so in fib output if you put ten it would give you 55 back
*
* The first method is just some fun i had trying to have a faster calclulation of the fibanacci numbers
*
* the second method is the actual recursion that goes in to makeing the fibancci in the recursion way
*
* the thrid method solve multiplication recursavley
*
* and the lasts of the methods are the outputs
*
* Gabe Granado
* 12/6/2018
* version 1
* */

public class Recursian {

//thsi one was just something i made that gave the fibancci sequence faster than if it was recursivly
    public static void recFib(int n){
        n=n+2;//it uses arrays instead of doing it reacursivly
        double goldenRatio;
        double x[]= new double[n];
        double fibVar=1;
        for (int i =2 ; i< n ; i+=1){
            x[i]=i;
            double num1 =fibVar + x[i-2];
            fibVar=num1;
            x[i]=fibVar;
            //this shows the golden ratio which is used in art and life
            //  goldenRatio=fibVar/x[i-1];
            //int iPosition=i-1;
            // System.out.println("At position "+iPosition +" The fibonachi number is " + fibVar);
            //   System.out.println("The golden ratio "+ goldenRatio);
        }
        System.out.println(fibVar);
    }
//this actually does the fib thing recursevly by running through each iteration so it takes a while
    public double betterFib(double n){
        double num;
        if (n<=0){//this just here in case some one puts a zero
            return 0;
        }
        if(n==1){//base case
            return 1;

        }
        else{
            //the actuall recuersion
            num = betterFib(n-1)+betterFib(n-2);
            //System.out.println(num);
            return num;
        }

    }

    //multiplication recursively
    int multiplication(int m,int n){
        if(m==0|| n==0){//if some one put a zero it will out put a zero
            return 0;
        }
        else{//the actuall recersion
            return m + multiplication(m, n - 1);
        }
    }
//the output method for recursion for fibancci
    public String outputRecursian(int num){
        String out=" ";
        System.out.println("you number is " + betterFib(num));
        return out;
    }
    //the output for multipication recursivly
    public String outputMult(int m,int n ){
        String out="";
        System.out.println("The product is "+ multiplication(m,n));
        return out;
    }



}



