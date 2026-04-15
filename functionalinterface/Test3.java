package functionalinterface;

interface Greater {
    int findGreater(int a, int b);
}

public class Test3 {
    public static void main(String[] args) {


        // Anonymous class function 
        // Greater obj = new Greater() {
        //     public int findGreater(int a, int b) {
        //         if (a > b)
        //             return a;
        //         else
        //             return b;
        //     }
        // };

        Greater obj = (int a, int b) -> {
            System.out.println("Inside Greater");
            return (a > b) ? a : b;
        };

        int result = obj.findGreater(10, 20);
        System.out.println(result);
    }
}
