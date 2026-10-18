import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in)
        );

        Store s = new Store();

        System.out.println(
            "Enter addItem <name>, sellItem <name>, " +
            "showItems, creator <name>, or exit:"
        );

        String input;

        while ((input = reader.readLine()) != null
                && !input.equals("exit")) {

            if (input.equals("showItems")) {
                System.out.println(s.showItems());

            } else if (input.startsWith("addItem ")) {
                String itemName = input.substring(8).trim();
                System.out.println(s.addItem(itemName));

            } else if (input.startsWith("sellItem ")) {
                String itemName = input.substring(9).trim();

                if (s.sellItem(itemName)) {
                    System.out.println(itemName + " sold successfully. Profit is now " + s.getProfitAmount());
                } else {
                    System.out.println(itemName + " is not available.");
                }

            } else if (input.startsWith("creator ")) {
                String itemName = input.substring(8).trim();
                s.creator(itemName);

            } else {
                System.out.println("Unknown command.");
            }
            System.out.println("Enter another command or exit:");
        }
    }
}