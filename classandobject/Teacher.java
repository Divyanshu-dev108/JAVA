package classandobject;

public class Teacher {
    int uid;
    String name;
    String teaches;
    int salary;

    public static void main(String[] args) {
        Teacher t1 = new Teacher();

        t1.uid = 12;
        t1.name = "Aman";
        t1.teaches = "JAVA";
        t1.salary = 100000;

        System.out.println(t1.uid);
        System.out.println(t1.name);
        System.out.println(t1.teaches);
        System.out.println(t1.salary);
    }
    
}
