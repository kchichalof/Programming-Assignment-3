import java.util.Scanner;
public class Application {
    public static void main (String[] args) {
        Scanner scnr = new Scanner(System.in);
        int input;
        System.out.println("Hello, please select an option\n" +
                "1 - Calculate the monthly interest rate\n" +
                "2 - Calculate next month's interest rate");
        input = scnr.nextInt();
        switch(input){
            case 1: monthlyInterest(); break;
            case 2: nextMonth(); break;
        }


    }
    public static void monthlyInterest(){
        SavingsAccount saver = new SavingsAccount();
        double interest;
        double rate;
        double savings;
        Scanner scnr = new Scanner(System.in);

        System.out.println("Please enter the Annual Interest rate: ");
        rate = scnr.nextDouble();
        System.out.println("Please enter the Savings balance: ");
        savings = scnr.nextDouble();
        saver.modifyInterestRate(rate, savings );
            interest = (saver.calculateMonthlyInterest() - savings);
            System.out.println("Month 1: " + saver.calculateMonthlyInterest());
            System.out.println("Month 2: " + (saver.calculateMonthlyInterest() + interest));
            System.out.println("Month 3: " + (saver.calculateMonthlyInterest() + (interest*2)));
            System.out.println("Month 4: " + (saver.calculateMonthlyInterest() + (interest*3)));
            System.out.println("Month 5: " + (saver.calculateMonthlyInterest() + (interest*4)));
            System.out.println("Month 6: " + (saver.calculateMonthlyInterest() + (interest*5)));
            System.out.println("Month 7: " + (saver.calculateMonthlyInterest() + (interest*6)));
            System.out.println("Month 8: " + (saver.calculateMonthlyInterest() + (interest*7)));
            System.out.println("Month 9: " + (saver.calculateMonthlyInterest() + (interest*8)));
            System.out.println("Month 10: " + (saver.calculateMonthlyInterest() + (interest*9)));
            System.out.println("Month 11: " + (saver.calculateMonthlyInterest() + (interest*10)));
            System.out.println("Month 12: " + (saver.calculateMonthlyInterest() + (interest*11)));
        }// ends monthlyInterest()
    public static void nextMonth(){
        SavingsAccount saver = new SavingsAccount();
        double rate;
        double savings;
        double interest;
        Scanner scnr = new Scanner(System.in);

        System.out.println("Please enter the Annual Interest rate: ");
        rate = scnr.nextDouble();
        System.out.println("Please enter the Savings balance: ");
        savings = scnr.nextDouble();
        saver.modifyInterestRate(rate, savings );
        interest = saver.calculateMonthlyInterest();
        System.out.println("Next month's interest is: " + interest);
    }
    }

