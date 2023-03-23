package org.example;

import java.util.stream.IntStream;

public class FizzBuzz {
    
    public String fizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }
    
    public String fizzBuzzAvecRefacto(int number){
        String result="";
        if (number % 3 == 0) {
            result+="Fizz";
        }
        if (number % 5 == 0) {
            result+="Buzz";
        }
       return result.isEmpty() ? String.valueOf(number) : result;
    }
    
    public static String mapToMessage(Integer i) {
        if (i % 15 == 0) {
            return "FizzBuzz";
        }
        if (i % 3 == 0) {
            return "Fizz";
        }
        if (i % 5 == 0) {
            return "Buzz";
        }
        return i.toString();
    }
    
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100)
                .mapToObj(FizzBuzz::mapToMessage)
                .forEach(System.out::println);
    }


}
