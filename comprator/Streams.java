package comprator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Streams {
    private BigDecimal money;
    private String customer;

    public Streams(BigDecimal money, String customer) {
        this.money = money;
        this.customer = customer;
    }


    @Override
    public String toString() {
        return "Streams{" +
                "money=" + money +
                ", customer='" + customer + '\'' +
                '}';
    }

    public static void main(String[] args) {
        // create a stream of strings from arraylist

        List<String> stringList = new ArrayList<>();

        Stream<String> stringStream = stringList.stream();

        Streams streams = new Streams(new BigDecimal("123.45"),"Hagos Abraha");

        /*
        * public Streams returnClass() {
        *
        * return new new Streams(new BigDecimal("123.45"),"Hagos Abraha") // most people use double, double has pricision issues.
        *
        *
        *
        *
        *         *
        *
        *
        *
        *
        * */



    }
}
