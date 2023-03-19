package com.driver;

public class Pizza {

    private int baseprice;
    private int toppingPrice;
    private int cheesePrice;
    private int paperBagPrice;
    private int totalPrice;
    private Boolean isVeg;
    private String bill;
    boolean isCheeseAdded;
    boolean isToppingAdded;
    boolean isPaperBagAdded;
    boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        if(isVeg)
        {
            baseprice = 300;
            toppingPrice = 70;
        }
        else {
            baseprice = 400;
            toppingPrice = 120;
        }
        isCheeseAdded = false;
        isToppingAdded = false;
        isPaperBagAdded = false;
        isBillGenerated =false;
        cheesePrice = 80;
        paperBagPrice = 20;

        totalPrice = baseprice;
        bill = "Base Price Of The Pizza: "+baseprice+"\n";


    }

    public int getPrice(){

        return totalPrice;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded==false)
        {
            totalPrice += cheesePrice;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingAdded==false)
        {
            totalPrice+=toppingPrice;
            isToppingAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isPaperBagAdded==false)
        {
            totalPrice+=paperBagPrice;
            isPaperBagAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated==false)
        {
            if(isCheeseAdded==true)
            {
                bill = bill+"Extra Cheese Added: "+cheesePrice+"\n";
            }
            if(isToppingAdded==true)
            {
                bill = bill + "Extra Toppings Added: "+toppingPrice+"\n";
            }
            if(isPaperBagAdded==true)
            {
                bill+= "Paperbag Added: "+paperBagPrice+"\n";
            }
            bill += "Total Price: "+totalPrice+"\n";
            isBillGenerated = true;
        }

        return this.bill;
    }
}
