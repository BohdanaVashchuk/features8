package Task1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    static Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>(List.of(1, 3, 6, 5));
        List<Integer> number1 = new ArrayList<>(List.of(2, 3, 9, 5));
        List<List<Integer>> listOfLists = new ArrayList<>(List.of(number, number1));
        List<Integer> listOfInts = listOfLists.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());
        LOGGER.info("Flat numbers" + listOfInts);
        LOGGER.info("Sorted numbers" + listOfInts.stream().sorted().collect(Collectors.toList()));
        listOfInts.add(null);
        List<Integer> withoutNull = listOfInts.stream().map(el -> Optional.ofNullable(el).orElse(55)).collect(Collectors.toList());
        LOGGER.info("Null is changed to 55 number" + withoutNull);
        FunctionalInterface n = (Integer x) -> x * 2;
        List<Integer> task3 = withoutNull.stream().map(n::method1).collect(Collectors.toList());
        LOGGER.info(task3);
    }


}
