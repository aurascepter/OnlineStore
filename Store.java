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
  ItemForSale Frankenstein = new ItemForSale("Frankenstein", "Mary Shelley", "1826", 6.0);
  ItemForSale GreatGatsby = new ItemForSale("The Great Gatsby", "Scott Fitzgerald", "1925", 9.0);
  ItemForSale StarWars = new ItemForSale("Star Wars", "George Lucas", "1977", 13.00);
  ItemForSale Jumanji = new ItemForSale("Jumanji", "Chris Van Allsburg", "1981", 15.00);
  ItemForSale Obsession = new ItemForSale("Obsession", "Curry Barker", "2026", 25.00);

  double profitAmount;
  ArrayList<String> items;

  public Store() {
    profitAmount = 0;
    items = new ArrayList<String>();
  }

  public ArrayList<String> showItems() {

    return items;

  }

  public String addItem(String item) {
    
    if (item.equals("Frankenstein") || item.equals("The Great Gatsby") 
    || item.equals("Star Wars") || item.equals("Jumanji") || item.equals("Obsession"))
   items.add(item);
    return item;

  }

  public void sellItem(String itemName, double profit) {
    
    if (itemName.equals("Frankenstein") || itemName.equals("The Great Gatsby") || itemName.equals("Star Wars") 
      || itemName.equals("Jumanji") || itemName.equals("Obsession")) {
    for (int i = 0; i < items.size(); i++) {
      if (items.get(i).equals(itemName)) {

         items.remove(i);

         if (itemName.equals("Frankenstein")) {
          profitAmount += Frankenstein.priceOfItem;
         }
         else if (itemName.equals("The Great Gatsby")) {
          profitAmount += GreatGatsby.priceOfItem;
         }
         else if (itemName.equals("Star Wars")) {
          profitAmount += StarWars.priceOfItem;
         }
         else if (itemName.equals("Jumanji")) {
          profitAmount += Jumanji.priceOfItem;

         }
         else if (itemName.equals("Obsession")) {
          profitAmount += Obsession.priceOfItem;

         }


         return;
      }
    }
   
  }
  }

  public void creator(String itemName) {

    if (itemName.equals("Frankenstein")) {
      System.out.println(Frankenstein.creatorName);
    }

    
  }

}
