package StockManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StocksSystem {
    ArrayList<Stocks> stocksDetails = new ArrayList<>();

    /*
    Method for creating new stocks
     */
    public void createStocks(){
        Scanner sc = new Scanner(System.in);
        Stocks objStocks = new Stocks();

        System.out.println("Enter the Stock name: ");
        objStocks.setStockName(sc.nextLine());

        System.out.println("Enter no.of stocks: ");
        objStocks.setNumberOfStocks(sc.nextInt());

        System.out.println("Enter price of Share Price: ");
        objStocks.setSharePrice(sc.nextInt());

        stocksDetails.add(objStocks);

    }

    /*
    Method for calculating stock value
     */
    public void calculateStocks(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the stock name you want to find: ");
        String findStockName = sc.nextLine().toUpperCase();

        for (int i = 0; i<stocksDetails.size();i++){
            if (findStockName.equals(stocksDetails.get(i).getStockName().toUpperCase())){
                /*
                logic to calculate total value
                 */
                int valueOfStock = stocksDetails.get(i).getNumberOfStocks() * stocksDetails.get(i).getSharePrice();
                System.out.println("Stock name: "+stocksDetails.get(i).getStockName());
                System.out.println("Number of stocks: "+stocksDetails.get(i).getNumberOfStocks());
                System.out.println("Share price: "+stocksDetails.get(i).getSharePrice());
                System.out.println("Value of the stock: "+valueOfStock);
                break;
            }

        }

    }

    /*
    method to display the stocks
     */
    public void displayStocks(){
        for (int i = 0; i < stocksDetails.size(); i++){
            System.out.println("Stock Name: "+ stocksDetails.get(i).getStockName());
            System.out.println("Number of stocks: "+ stocksDetails.get(i).getNumberOfStocks());
            System.out.println("Share Price: "+ stocksDetails.get(i).getSharePrice());

        }

    }
}
