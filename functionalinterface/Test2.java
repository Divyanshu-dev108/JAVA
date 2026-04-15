package functionalinterface;

@FunctionalInterface
interface Sum{
    int add(int a, int b);
}

public class Test2 {
    public static void main(String[] args) {

        // Anonymous Class implementation 
        // Sum obj = new Sum() {
        //     public int add(int a, int b){
        //         System.out.println("Inside Add");
        //         return a + b;
        //     }
        // };


        //Lambda Function 

        Sum obj = (int a, int b) -> {
            System.out.println("Inside Add");
            return a + b;
        };

        int result = obj.add(2, 5);
        System.out.println(result);
        
    }
    
}
