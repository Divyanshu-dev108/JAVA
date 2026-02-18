package constructor;


class teacher{
    int uid;
    String name;

    // Parameterized Constructor - A constructor which sccept parameter
    teacher(int a, String b){
        uid = a;
        name = b;
    }
}
public class constructorB{
    public static void main(String[] args) {
        teacher t1 = new teacher(2, "Aman");

    }

}
