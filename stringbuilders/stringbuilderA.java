package stringbuilders;

public class stringbuilderA {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");
        System.out.println(sb);

        sb.append("Hi");
        System.out.println(sb);

        System.out.println(sb.length());

        System.out.println(sb.substring(2));
        System.out.println(sb.substring(2,6));

        System.out.println(sb.charAt(2));

        // very widely used

        System.out.println(sb.toString());

        System.out.println(sb.deleteCharAt(1));

        System.out.println(sb.replace(0, 3, "GOOD"));

        System.out.println(sb.reverse());






        
        
    }
    
}
