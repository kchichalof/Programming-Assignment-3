import java.util.*;
public class Estimates {
    double budget;
    double estimatedLaborCost;
    public void budgetSet(){
        Scanner budgetScanner = new Scanner(System.in);
        System.out.println("Budget: ");
        budget = budgetScanner.nextDouble();
    }

    private double budgetGet(){
        return budget;
    }

    private void estimatedLaborSet(){
        Scanner estimatedLabor = new Scanner(System.in);
        System.out.println("Estimated Labor Cost: ");
        estimatedLaborCost = estimatedLabor.nextDouble();
    }

    private double estimatedLaborGet(){
        return estimatedLaborCost;
    }

}
