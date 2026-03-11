package objectclass;

public class ObjClassB {
    public static void main(String[] args) {

        ObjClassB obj1 = new ObjClassB();
        System.out.println(obj1.toString());
        
        ObjClassB obj2 = new ObjClassB();
        System.out.println(obj1.equals(obj2));

        int x1 = obj1.hashCode();
        System.out.println(x1);

        String s = "Java";
        System.out.println(s.hashCode());
        
        String s1 = "Hello";
        System.out.println(s1.getClass());

        Class<?> cl1 = obj1.getClass();
        System.out.println(cl1);
    }
    
}