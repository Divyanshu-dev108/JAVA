package inheritance;

class vehicle{
    // parent class
    int wheels = 4;

    public void display(){
        System.out.println("Welcome to the Showroom of Honda ");
    }
}

class Honda extends vehicle{
    // child class : extend is used to inherit the parent class.
    int model = 123;

}

public class inheritanceA {
    public static void main(String[] args) {
        Honda obj = new Honda();

        System.out.println(obj.wheels);
        obj.display();
        System.out.println(obj.model);

        
    }
}
