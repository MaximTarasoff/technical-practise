package lesson_two.hw.taskThree;

public class Item {
    private String name;
    private double price;
    private int quantity;

    void sell(int amount){
        if(quantity >= amount){
            quantity -= amount;
        }
    }
    void restock(int amount){
        quantity += amount;
    }
    void getInfo(){
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}
