package List;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Mai {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

      List<Integer> filteredMappedList =  list.stream().filter(k->k>2).map(x->x*2).collect(Collectors.toList());
        filteredMappedList.forEach(System.out::println);



    }
}
