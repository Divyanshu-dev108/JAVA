package inputoutput;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test4 {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("file2.txt");
            String text = "Hello";

            for(int i = 0; i < text.length(); i++){
                fos.write(text.charAt(i));
            }

            fos.close();
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
