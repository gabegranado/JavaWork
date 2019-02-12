public class IRS {
    //instance veriable
    private int status;
    private String marriedOrSingle;
    private double income;
    private String output;


    public IRS(int status, double income){
        this.status=status;
        this.income=income;
    }
    //this checks the status if its 1 then single if it is 2 then married
    public String status (){
        if(status ==1){
            marriedOrSingle="single";
        }
        else {
            marriedOrSingle="married";
        }
        return marriedOrSingle;
    }
    //this actually calculate the amount of taxs they will have to pay
    public double fedTax(){
        double fedTax;
        double taxNumber;
        double minSal;
        double taxPercent;
        //this is for if their sing
        if(status ==1){
            //these ifs check what range the are then their make the varibles above what it shows below
            if (income>= 0 & income<= 27049){
                taxNumber=0;
                taxPercent=.15;
                minSal=0;
            }
            else if (income>= 27050 & income<= 65549){
                taxNumber=4057.50;
                taxPercent=.275;
                minSal=27050;
            }
            else if (income>= 65550 & income<= 136749){
                taxNumber=14645;
                taxPercent=.305;
                minSal=65550;
            }
            else if (income>= 136750 & income<= 297349){
                taxNumber=36361;
                taxPercent=.355;
                minSal=136750;
            }
            else if(income<0){
                taxNumber=9;
                taxPercent=0;
                minSal=0;
            }
            else{
                taxNumber=93374;
                taxPercent=.391;
                minSal = 297350;
            }



        }
        //this does the exact same thing as above but if they are married and the numbers are diffrent also
        else {
            if(income>=0 & income<= 45199){
                taxNumber=0;
                taxPercent=.15;
                minSal=0;

            }
            else if(income>=45200 & income<= 109249){
                taxNumber=6780;
                taxPercent=.275;
                minSal=45200;

            }
            else if(income>=109250 & income<= 166499){
                taxNumber=24393.75;
                taxPercent=.305;
                minSal=109250;
            }
            else if(income>= 166500 & income<= 297349){
                taxNumber=41855;
                taxPercent=.355;
                minSal=166500;

            }
            else if(income<0){
                taxNumber=0;
                taxPercent=0;
                minSal=0;

            }
            else{
                taxNumber=88306;
                taxPercent=.391;
                minSal=297350;
            }


        }

        //this is the actuall equation that calculates the fedearal tax
        fedTax= taxNumber+(taxPercent*(income-minSal));
        return fedTax;

    }

    public String output(){
        //this is the output that will be printed
        System.out.println("Marital Status = "+status());
        System.out.println("Taxable Income = "+ income);
        System.out.println("Your Federal Tax - " + fedTax());


        return output ;
    }

}
