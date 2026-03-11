package objectclass;

public class ObjClassC {

    int roll;
    String name;

    ObjClassC(int roll, String name){
        this.roll = roll;
        this.name = name;
    }

    public String toString() {
        return "Student roll is " + roll + ", name is " + name;
    }

    public boolean equals(ObjClassC c){
        return this.roll == c.roll && this.name == c.name;
    }

    public static void main(String[] args) {
        ObjClassC obj = new ObjClassC(10, "Aman");
        System.out.println(obj.toString());

        ObjClassC obj2 = new ObjClassC(10, "Aman");
        System.out.println(obj.equals(obj2));
    }

    
    
}
