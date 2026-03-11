package instanceOf;


class x1{

}
public class Test1 extends  x1{
    public static void main(String[] args) {
        String s1 = "Hello";
        System.out.println(s1 instanceof String);
        

        Test1 obj = new Test1();
        System.out.println(obj instanceof Test1);
        System.out.println(obj instanceof x1);
        System.out.println(obj instanceof Object);
    }
}
