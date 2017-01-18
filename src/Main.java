import java.util.Scanner;

/**
 * Created by Rakshith on 1/18/2017.
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();


    public static void main(String[] args){

        boolean quit = false;
        int choice = 0;
        printInstruction();
        while (!quit){

            System.out.println("Enter Your Choice: ");
            choice= scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstruction();
                    break;
                case 1:
                    groceryList.groceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }

        }
    }


    public static void printInstruction(){
        System.out.println("0. Instructions  1. List Items 2. Add Items 3. Modify Items 4. Remove Items 5. Search Items 6. Quit");
    }

    public static void addItem(){
        System.out.println("Enter the Item");
        groceryList.groceryItemAdd(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.println("Enter position to Modify: ");
        int position = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter The Item:");
        String item = scanner.next();
        groceryList.modifyGroceryList(position -1,item);
    }

    public static void removeItem(){
        System.out.println("Enter position to Remove: ");
        int position = scanner.nextInt();
        groceryList.removeGroceryItem(position);
    }

    public static void searchItem(){
        System.out.println("Enter the item to Search ");
        String item = scanner.next();
        groceryList.findGroceryItem(item);
    }
}
