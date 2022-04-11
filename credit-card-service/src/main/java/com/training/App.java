package com.training;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
/*
 * 1) Create a Maven Project credit-card-service 
2) Create a Class CreditCard with properties like cardNumber,cardHolderName,amountDue
3) Create a class CreditCardService with two methods 
  public boolean addCard(CreditCard card)  public CreditCard[] getCards()
4) The Add Card method should store the card details in an Array 
5) getCard Method  will return the Array 
6) Test the Code From the Main Method
*/
public class App 
{
    public static void main( String[] args ){   	
    	
    	CreditCardService cardService=new CreditCardService();
    	CreditCard card=new CreditCard(1234242L,"Dhanush",3000);

    	CreditCard card2=new CreditCard(1246442L,"harish",7600);
    	CreditCard card1=new CreditCard(12464642L,"ramesh",6000);
    	cardService.addCard(card);
    	cardService.addCard(card1);
    	cardService.addCard(card2);
    	double total=0;
    	
    	for(CreditCard value:cardService.getCards()){    		
    		System.out.println(value); //value
    		total+=value.getAmoutDue();    		
    	} 
    	
    	System.out.println(total);
    }
}
