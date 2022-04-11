package com.training;
/*
 * 1) Create a Maven Project credit-card-service 
2) Create a Class CreditCard with properties like cardNumber,cardHolderName,amountDue
3) Create a class CreditCardService with two methods 
  public boolean addCard(CreditCard card)  public CreditCard[] getCards()
4) The Add Card method should store the card details in an Array 
5) getCard Method  will return the Array 
6) Test the Code From the Main Method
*/

public class CreditCardService{	
	private CreditCard[] cards;
	private static int count=0;
	
	public CreditCardService() {
		super();
		// TODO Auto-generated constructor stub
		cards=new CreditCard[3];
	}
	
	public boolean addCard(CreditCard card) {
		cards[count]=card;
		boolean result=true;
		
		if(cards.equals(null)) {
			result=false;
		}
		++count;
		return result;	
	}
	
	

	public CreditCard[] getCards() {	
		return this.cards;
	}
}
