package task;

public class Product {
    
    int id;
    int quantity;
    String name;
    String producer;
    String unit;
    String shelf;
    // two type constructor in here; one of empty constructor which has no parameter, other of parameterized constructor
    Product() {
        
    }
    
    Product(int id, String name, String producer, String unit) {
        this.id = id;
        this.name = name;
        this.producer = producer;
        this.unit = unit;
    }
}