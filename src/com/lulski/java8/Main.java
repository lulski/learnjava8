package com.lulski.java8;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

    /*
        Arrays.asList("a1", "a2", "a3")
                .stream()
                .findFirst()
                .ifPresent(System.out::println);

        int[] numbers = {12, 123, 2, 4, 11, 88, 42, 42};

        IntStream.of(numbers)
                .distinct()
                .sorted()
                .limit(3)
                .forEach(System.out::println);
        }
    */

        //prior java 8
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("inside runnable 1");
            }
        };

        new Thread(runnable).start();


//        java 8 lambda
        // () -> {};

        Runnable runnableLambda = () -> {
            System.out.println("hello from lambda");
        };

        new Thread(runnableLambda).start();
    }

    public static void streamAMap(){
        Map<String, String> input = new HashMap<String,String>();

        input.put("book1","dune");
        input.put("book2", "1984");
        input.put("book3","jurassic park");
        input.put("book1","the matrix");

//        Stream<Object> objectStream = input.values()
//                .stream()
//                .map(System.out::println);

    }


}
