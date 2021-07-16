import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! Please write the name of a group");
        String groupName = sc.nextLine();
        System.out.println("And an ID for it");
        int id = sc.nextInt();
        System.out.println("Enter the ID of its parent group or hit \"Enter\" to create a root-level group " +
                "or type \"Continue\" to create an item");
        Group group = new Group(id, groupName);

        if (sc.nextLine().equals(" ")) {

            while (!sc.nextLine().equals("Continue")) {

            }
        } else if (!sc.nextLine().equals(" ")) {
            while (!sc.nextLine().equals("Exit")) {
                System.out.println("Enter the name of the item");
                String itemName = sc.nextLine();
                System.out.println("ID for it");
                int itemId = sc.nextInt();
                System.out.println("The price currency");
                String currency = sc.nextLine();
                System.out.println("And the amount");
                int price = sc.nextInt();
                Item item = new Item(itemId, price, currency, itemName);
                group.getComponents().add(item);
                System.out.println("Success! You've created an item called " + itemName + "." +
                        "\n Hit \"Enter\" if you want to make a new one or type \"Exit\"");
                String later = sc.nextLine();
            }
        }
        System.out.println("The hierarchy");

        System.exit(0);

    }
}
