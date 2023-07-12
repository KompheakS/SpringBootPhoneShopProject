package com.kompheak.java.phoneShop.util;

import java.util.List;
import java.util.stream.Collectors;

public class GeneralUtils {

    public static List<Integer> getEvenNumber(List<Integer> numbers){
        return numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
    }

}
