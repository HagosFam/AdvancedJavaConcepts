package generics;

import javax.print.attribute.standard.PrinterURI;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;

public class KeyValueGenerics<K,V> {
    private K key;
    private V value;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public static void main(String[] args) {
        List<KeyValueGenerics> list = new ArrayList<>();

        KeyValueGenerics keyValueGenerics = new KeyValueGenerics();
        keyValueGenerics.setKey(1);
        keyValueGenerics.setValue(10);

        List<KeyValueGenerics<Double, Double>> doubleList = new ArrayList<>();
        KeyValueGenerics keyValueGenericsDouble = new KeyValueGenerics();
        keyValueGenerics.setKey(1.00);
        keyValueGenerics.setValue(100.00);

        list.add(keyValueGenerics);



    }
}
