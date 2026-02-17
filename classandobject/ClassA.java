package classandobject;

class vehicle{
    double price;
    String model;
    int regno;

    void toDrive(){
        System.out.println("Vehicle is Driving");
    }

}

public class ClassA {
    public static void main(String[] args) {

        vehicle v1 = new vehicle();

        v1.price = 12.5;
        v1.model = "Hyundai";
        v1.regno = 12345;
        v1.toDrive();

        System.out.println(v1.price);
        System.out.println(v1.model);
        System.out.println(v1.regno);
        
        
    }
    
}
