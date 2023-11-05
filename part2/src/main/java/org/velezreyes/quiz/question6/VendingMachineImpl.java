package org.velezreyes.quiz.question6;

import java.util.HashMap;
import java.util.Map;

public class VendingMachineImpl implements VendingMachine {
	private Map<String, Drink> drinks;
    int countCoins;
    
	private static VendingMachine instance;
	
	public VendingMachineImpl() {
		this.countCoins = 0;
        Drink scottCola = new DrinkImpl("ScottCola", 75, true);
        Drink karenTea = new DrinkImpl("KarenTea", 100, false);

        this.drinks = new HashMap<>();
        this.drinks.put("ScottCola", scottCola);
        this.drinks.put("KarenTea", karenTea);
	}
	
	public static VendingMachine getInstance() {
	  if (instance == null) {
	      instance = new VendingMachineImpl();
	    }
	    return instance;
	  }

	@Override
	public void insertQuarter() {
		 this.countCoins +=25;
	}
	


	@Override
	public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
		DrinkImpl drink = (DrinkImpl) drinks.get(name);
	    if (drink == null) {
	        throw new UnknownDrinkException();
	    }
	    if (this.countCoins < drink.getPrice()) {
	        throw new NotEnoughMoneyException();
	    }
	
	    this.countCoins = 0;
	
	    return drink;
	}
	  
}
