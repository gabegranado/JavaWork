import java.util.Scanner;
import java.lang.Math;

public class Pig {
    private int quarter;
    private int dime;
    private int nickel;
    private int penny;
    private double total;

    public int getQuarter(){return quarter;}
    public int getDime(){return dime;}
    public int getNickel(){return nickel;}
    public int getPenny(){return penny;}
    public double getTotal() {return total;}

    public void addCoins(int howManyQuarter,int howManyDime,int howManyNickel, int howManyPenny){
        quarter += howManyQuarter;
        total += howManyQuarter*.25;
        dime += howManyDime;
        total += howManyDime*.10;
        nickel += howManyNickel;
        total += howManyNickel*.05;
        penny += howManyPenny;
        total += howManyPenny*.01;
        //total = Math.round(total);
    }
    public void withdraw(int howManyQuarter,int howManyDime,int howManyNickel, int howManyPenny){
        quarter -= howManyQuarter;
        total -= howManyQuarter*.25;
        dime -= howManyDime;
        total -= howManyDime*.10;
        nickel -= howManyNickel;
        total -= howManyNickel*.05;
        penny -= howManyPenny;
        total -= howManyPenny*.01;
        //total = Math.round(total);
    }
    public void printState(){
        System.out.println("You started off with 10 of all coins");
        System.out.println("Quarters:" +quarter);
        System.out.println("Dimes:"+dime);
        System.out.println("Nickles:"+nickel);
        System.out.println("Pennys:" +penny);
        System.out.println("Total:"+total);
    }
    public static int getInt() {

        while(true) {

            Scanner scanner = new Scanner(System.in);
            if(scanner.hasNextInt()) {
                int userInput = scanner.nextInt();
                return userInput;
            }
        }


    }
public void ask(){
    while (true) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("would you like to Add coins put 1 or Withdraw coins put 2");
       int answer = scanner.nextInt();
        if(answer == 1) {
            System.out.println("Please put the amount of quarters you want to add then the number of dimes then nickles the pennys");
            addCoins(getInt(), Pig.getInt(), Pig.getInt(), Pig.getInt());
            printState();
        }
        else if (answer == 2){
            System.out.println("Please put the amount of quarters you want to withdraw then the number of dimes then nickles the pennys");
            withdraw(getInt(),getInt(),getInt(),getInt());
            printState();

        }
    }
}


    public Pig(){
        quarter = 0;
        dime=0;
        nickel=0;
        penny=0;
    }
    public Pig(int quarter,int dime,int nickel,int penny){
        this.quarter = quarter;
        total+= quarter*.25;
        this.dime=dime;
        total+= dime*.10;
        this.nickel=nickel;
        total+= nickel*.05;
        this.penny=penny;
        total+= penny*.01;
    }
}
