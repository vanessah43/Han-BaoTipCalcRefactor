import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        //initializing the imported objects
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");

        /* print statements */
        //greeting
        System.out.println("Thank you for eating with us! Calculate your tip here.");

        //takes party input
        System.out.println("How many people are dining today?");
        int party = scan.nextInt();

        //takes tip percent input as an integer
        System.out.println("What tip percentage would you like to leave? (0-100)");
        int percent = scan.nextInt();

        //takes food costs, ends with -1
        System.out.println("Enter the cost of each item in dollars and cents, e.g. 9.27; to end, type -1");
        double bill = 0.0;
        double price = scan.nextDouble();
       // ? boolean keepGoing = true;
        while (price > 0) {
            bill += price;
            price = scan.nextDouble();
        }

        //end statement for user
        System.out.println("Done! Your receipt is printing...");

        // initializing tipCalc object using vars
        TipCalculator tipCalc = new TipCalculator(party, percent);

        //setting total bill
        tipCalc.setTotalBillBeforeTip(bill);

        //printing the receipt
        System.out.println("----------------------------------------------------------");
        System.out.println("Total bill before tip: " + formatter.format(tipCalc.getTotalBillBeforeTip()));
        System.out.println("Tip percentage: " + tipCalc.getTipPercentage());
        System.out.println("Total tip: " + formatter.format(tipCalc.tipAmount()));
        System.out.println("Total bill with tip: " + formatter.format(tipCalc.totalBill()));
        System.out.println("Party: " + party);
        System.out.println("Per person cost before tip: " + formatter.format(tipCalc.perPersonCostBeforeTip()));
        System.out.println("Tip per person: " + formatter.format(tipCalc.perPersonTipAmount()));
        System.out.println("Total cost per person: " + formatter.format(tipCalc.perPersonTotalCost()));
    }
}