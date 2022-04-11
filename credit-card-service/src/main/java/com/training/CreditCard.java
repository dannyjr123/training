package com.training;
/*
 * 1) Create a Maven Project credit-card-service 
2) Create a Class CreditCard with properties like cardNumber,cardHolderName,amountDue
3) Create a class CreditCardService with two methods 
  public boolean addCard(CreditCard card)  public CreditCard[] getCards()
4)  The Add Card method should store the card details in an Array 
5) getCard Method  will return the Array 
6) Test the Code From the Main Method

*/
public class CreditCard {
	private long cardNumber;
	private String cardHolderName;
	private double amoutDue;
	
	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "CreditCard [cardNumber=" + cardNumber + ", cardHolderName=" + cardHolderName + ", amoutDue=" + amoutDue
				+ "]";
	}

	public CreditCard(long cardNumber, String cardHolderName, double amoutDue) {
		super();
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
		this.amoutDue = amoutDue;
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public double getAmoutDue() {
		return amoutDue;
	}

	public void setAmoutDue(double amoutDue) {
		this.amoutDue = amoutDue;
	}		
}
