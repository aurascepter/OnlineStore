/*Implement the following functionality into the store:

  instance variables: 
    profit: how much money the store has made
    items:  instance variable (could be an array or LinkedList or ArrayList of one of the other classes)

  methods:
    showItems: displays all items available for sale
    addItem: adds an item for sale
    sellItem(itemName): removes the item from the store and adds its price to profit
    creator(itemName): displays who created the item in question

    You will need to include the following information to be stored in the inheritance heiarchy using the other classes:
      name of thing being sold
      price for things that are on sale
      names of creators of movies and books
      date of birth of book authors
      date that things are placed on sale
      duration of movies
      publisher of books

    Where these variables are stored and how to name them is up to you!
*/

 import java.util.ArrayList;
public class Store
{
  double profitAmount;
  ArrayList<String> items;

  public Store() {
    profitAmount = 0;
    items = new ArrayList<String>();
  }

  public void showItems() {

    System.out.print(items);


  }

  public void addItem(String item) {
      
    items.add(item);


  }

  public void sellItem(String itemName) {
    


  }

  public void creator(String itemName) {



    
  }

}
