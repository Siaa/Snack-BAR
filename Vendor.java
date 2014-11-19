/**
 * This is Sia's code :) 
 */

/**
 * This class implements a vendor that sells one kind
 * of items. A vendor carries out sales transactions.
 */
public class Vendor
{
  // Fields: // there are three fields- the price, stock and deposit 
   private int price; 
   private int stock;
   private int deposit;
   private int change;
  
  /**
   * Constructs a Vendor
   * @param price the price of a single item in cents (int)
   * @param stock number of items to place in stock (int)
   */
  public Vendor (int aPrice, int aStock) //constructs a vendor that has an specific price and stock 
  {
    if (aPrice>=0&&aStock>=0){
    	price=aPrice;
    	stock=aStock;
    }
  }

  /**
   * Sets the quantity of items in stock.
   * @param qty number of items to place in stock (int)
   */
  public void setStock(int qty) //sets the quantity needed 
  {
    if (qty>=0){
    	stock=qty;
    }
  }

  /**
   * Returns the number of items currently in stock.
   * @return number of items currently in stock (int)
   */
  public int getStock () //the getter 
  {
    return stock;
  }

  /**
   * Adds a specified amount (in cents) to the
   * deposited amount.
   * @param number of cents to add to the deposit (int)
   */
  public void addMoney(int cents) //adds the inputed money to the deposit 
  {
	 this.deposit += cents;  
  }

  /**
   * Returns the currently deposited amount (in cents).
   * @return number of cents in the current deposit (int)
   */
  public int getDeposit() //getter of deposit 
  {
    return (int) deposit;
  }

  /**
   * Implements a sale.  If there are items in stock and
   * the deposited amount is greater than or equal to
   * the single item price, then adjusts the stock
   * and calculates and sets change and returns true;
   * otherwise refunds the whole deposit (moves it into
   * change) and returns false.
   * @return true for a successful sale, false otherwise (boolean)
   */
  public boolean makeSale() // makes a sale
  {
    if (stock>= 0 && this.deposit >= this.price){
    	change= deposit - price; //calculates and sets change 
    	deposit = 0; //resents the deposit after change
    	stock --; //adjusts the stock
    	return true;
    } else {
    	change = deposit;
    	deposit = 0; //resets the deposit after change
    	return false;
    }
  }

  /**
   * Returns and zeroes out the amount of change (from
   * the last sale or refund).
   * @return number of cents in the current change (int)
   */
  public int getChange() //getter for change 
  {
    return change;
  }
}
