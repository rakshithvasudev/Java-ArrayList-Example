import java.util.ArrayList;

public class GroceryList {

    int[] myNumbers;
    ArrayList<String> groceryList = new ArrayList<>();

    public void groceryItemAdd(String item){
        groceryList.add(item);
    }

    public void groceryList(){
        System.out.println("You have " + groceryList.size()+ " items" );

        for (String groceryItem: groceryList) {
            System.out.println(groceryItem);
        }
    }

    public void modifyGroceryList(int position, String newItem){
        groceryList.set(position,newItem);
        System.out.println("Grocery Item" +(position+1)+ "has been modified");
    }

    public void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);
        System.out.println("Item" +theItem + "Removed");
    }

    public String findGroceryItem(String item){
        int position = groceryList.indexOf(item);
        if(position>=0){
            return groceryList.get(position);
        }

        return null;
    }
}
