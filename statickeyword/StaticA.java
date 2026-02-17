// Static variable are for class 

// Static variable are shared among object.

// Static Variable are made inside the Method Area.





package statickeyword;


public class StaticA {

    int id;
    static String college;

    public static void main(String[] args) {

        StaticA obj1 = new StaticA();
        obj1.id  = 2;
        obj1.college = "ABC";
        StaticA obj2 = new StaticA();
        obj2.id  = 4;
        obj2.college = "BLA BLA BLA";


        System.out.println(obj1.id+" "+obj1.college);
        System.out.println(obj2.id+" "+obj2.college);
    }
    
}
