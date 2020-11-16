package OOP;

/**
 * We can use encapsulation to change the access modifier to protect the fields
 * of a class
 */
public class s4_Encapsulation {
    static class Product {
        private int price;

        // Getter methods
        public int getPrice() {
            return price;
        }

        // Setter methods
        public void setPrice(int price) {
            if (0 < price && price < 100) {
                this.price = price;
            } else {
                System.out.println("Sorry, " + price + " is outside of the range");
            }
        }

    }

    public static void main(String[] args) {
        Product product = new Product();
        product.setPrice(-1);
        product.setPrice(2);
        System.out.println(product.getPrice());
    }
}
