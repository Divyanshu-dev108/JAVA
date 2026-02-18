package strings;

// inbuilt function of String class.

public class StringC {

    public static void main(String[] args) {
        String s1 = "Hello World";
        System.out.println(s1+" HI"); // hello world HI

        System.out.println(s1.charAt(2));  // l
        System.out.println(s1.isEmpty()); // false

        System.out.println(s1.startsWith("He")); // true
        System.out.println(s1.endsWith("ad")); // false

        System.out.println(s1.substring(2)); // llo world
        System.out.println(s1.substring(2, 7)); // llo w

        System.out.println(s1.length()); // 11

        System.out.println(s1.contains("llo")); // true

        System.out.println(s1.replace("o", "a")); // hella

        System.out.println(s1.toLowerCase()); // hello world
        System.out.println(s1.toUpperCase()); // HELLO WORLD

        String[] arr = s1.split(" ");
        for(int i = 0; i < arr.length; i++){
            System.err.println(arr[i]);

        }
    }
    
}
