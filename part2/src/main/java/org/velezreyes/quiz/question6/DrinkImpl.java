package org.velezreyes.quiz.question6;

public class DrinkImpl implements Drink {
    private double price;
    private String name;
    public boolean isFizzy;

    public DrinkImpl(String name, double price, boolean isFizzy){
        this.name = name;
        this.price = price;
        this.isFizzy = isFizzy;
    }

    public double getPrice(){
        return this.price;
    }
    @Override
    public String getName() {
        return  this.name;
    }

    @Override
    public boolean isFizzy() {
        return this.isFizzy;
    }
}

