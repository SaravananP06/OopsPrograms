package StockManagementSystem;

public class Stocks {
    private String stockName;
    private int numberOfStocks ;
    private int sharePrice;


    /*
    getter setter
     */
    public String getStockName(){
        return stockName;
    }

    public void setStockName(String newStockName){
        this.stockName = newStockName;
    }
    public int getNumberOfStocks(){
        return numberOfStocks;
    }

    public void setNumberOfStocks(int newNumberOfStocks){
        this.numberOfStocks = newNumberOfStocks;
    }
    public int getSharePrice(){
        return sharePrice;
    }

    public void  setSharePrice(int newSharePrice){
        this.sharePrice = newSharePrice;
    }





}
