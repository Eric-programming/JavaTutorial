package SOLID.OpenClosed;

/**
 * Any new features should be implemented by adding another new element
 * (classes, methods, or attributes) instead of change the current element.
 */
public class OpenClosed_Bad_Example {
    public static void main(String[] args) {

    }
}

// Bad Example
class Product_Delivery_Bad_Example {
    String name;
    int price;

    public Product_Delivery_Bad_Example(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int calculate_delivery(String type) {
        // We are breaking the Open Closed Princple because we want to add another type,
        // we should not change anything that is inside of this code
        switch (type) {
            case "Large":
                return price + 5;
            default:
                return price + 10;
        }
    }

}