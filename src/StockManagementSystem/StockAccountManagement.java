package StockManagementSystem;/*
Stock management program that calculates the number of stocks and share price
returns the value
 */
import java.util.Scanner;


public class StockAccountManagement {
    public static void main(String[] args) {
        System.out.println("Welcome to Stock Management Program");
        Scanner sc = new Scanner(System.in);

        StocksSystem objStocksManage = new StocksSystem();
        System.out.println("Enter how many stocks to wanted to add it: ");
        int contacts = sc.nextInt();
        int n = 0;
        while(n < contacts) {
            n++;
            System.out.println("Create New Stock");

            /*
             * Calling createStocks method
             */
            objStocksManage.createStocks();

            /*
             * Calling displayContacts method
             */
            objStocksManage.displayStocks();
        }
        /*
         *Calling calculateStocks method
         */
        objStocksManage.calculateStocks();

    }

}
