package Tests;

public class InvestmentCalculator {
    public static void main(String[] args){
        double amount = 1000;
        double rate = 10;
        int years = 5;
        System.out.println("Years      FutureValue");

        for (int i = 1; i <= years; i++){
            amount += amount * (rate / 100);
            
            System.out.printf("%-8d %.2f%n", i, amount);
        }
    }
}
