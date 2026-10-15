import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
   //Your tests go here! I expect you to make sure various parts of your program work. 

     public static void main(String[] args)
     {
      Scanner myObj = new Scanner(System.in);
      String itemName = myObj.nextLine();
        Store s = new Store();
        Book b = new Book();
        System.out.println(b instanceof ItemForSale);

      if (itemName.equals("showItems")) {

         s.showItems();

      }
      else if (itemName.equals("addItem")) {

         s.addItem(itemName);

      }

        
     }
}
