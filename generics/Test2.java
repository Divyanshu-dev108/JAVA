package generics;

class Pair<K, V> {
    K var1;
    V var2;

    Pair(K var1, V var2){
        this.var1 = var1;
        this.var2 = var2;
    }

    void display(){
    System.out.println("Value 1: "+ var1);
    System.out.println("Value 2: "+ var2);
    }
}
public class Test2 {

    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(1, "java");
        p1.display();
        Pair<String, Double> p2 = new Pair<>("Price", 99.99);
        p2.display();
    }
    
}
