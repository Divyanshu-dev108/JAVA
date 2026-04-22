
// Generic allows us to work with any data types.
// Generic are useful for code reusability and type safety

package generics;


class Box<T> {
    T data;
    void setData(T data){
        this.data = data;
    }
    T getData(){
        return data;
    }
}

public class Test1 {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.setData(100);
        System.out.println(intBox.getData());

        Box<String> strBox = new Box<>();
        strBox.setData("Hello");
        System.out.println(strBox.getData());
    }
    
}
