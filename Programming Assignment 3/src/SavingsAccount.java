public class SavingsAccount {
    private static double annualInterestRate;
    private static double savingsBalance;
    public static void main (String[] args){

    }
    public static double calculateMonthlyInterest(){
        double monthlyInterest;
        double interest;
        interest = (savingsBalance * annualInterestRate) / 12;
        monthlyInterest = savingsBalance + interest;
        return monthlyInterest;
    }

    public static void modifyInterestRate(double i, double s){
        annualInterestRate = i;
        savingsBalance = s;
    }





    /*public void saver2() {
        savingsBalance = 3000.00;
        modifyInterestRate(0.04);
        calculateMonthlyInterest();
        savingsBalance = calculateMonthlyInterest();
        System.out.println("This months interest:$ " + savingsBalance);
        modifyInterestRate(0.05);
        calculateMonthlyInterest();
        savingsBalance = calculateMonthlyInterest();
        System.out.println("Next months interest:$ " + savingsBalance);
    }*/


}
