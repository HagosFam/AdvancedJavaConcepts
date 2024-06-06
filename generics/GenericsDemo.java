package generics;

public class GenericsDemo<T> {
    private T item; // so it doesn't tell the data type

    public T getName() {
        return item;
    }

    public void setName(T name) {
        this.item = name;
    }

    public static void main(String[] args) {
        GenericsDemo<String> genericsDemoStr = new GenericsDemo<>();
        genericsDemoStr.setName("King");
        System.out.println(genericsDemoStr.getName());


        GenericsDemo<Integer> genericsDemoInt = new GenericsDemo<>();
        genericsDemoInt.setName(4);
        System.out.println();


        //  Example lists work based on Generics


    }
}
