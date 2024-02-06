package org.example;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class NullCheckListOfStrings {
        public static void main(String[] args) {
            List<String> names = Arrays.asList("John", "Jane", "Jim", null, "Jill");
            names.stream()
                    .map(name -> Optional.ofNullable(name))
                    .flatMap(Optional::stream)
                    .map(name -> name.toUpperCase())
                    .forEach(System.out::println);
        }
    }
