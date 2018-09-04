package com.rathish.java.lambda;

import java.util.function.Function;
import java.util.function.Predicate;

public class CustomLambda {

}

@FunctionalInterface
interface FunctionalCalculator<T>{
    T add(T arg1, T arg2);
}


class CustomLambdaTest{
    public static void main(String[] args) {
        FunctionalCalculator<Integer> cal = (n1, n2) -> n1 + n2;

        System.out.println(cal.add(10, 12));

        FunctionalCalculator<String> appender  = (s1 , s2) -> s1 + " " + s2;
        System.out.println(appender.add("Rathish", "Nair"));
    }
}

@FunctionalInterface
interface StringProcessor{
    String process(String str);

    // functional interfaces can have default non-abstract methods
    default public String trim(String str){
        return str.trim();
    }
}


// Test default method implementation
class SreingProcessorImpl implements StringProcessor{

    @Override
    public String process(String str) {
        return null;
    }

    @Override
    public String trim(String str) {
        return null;
    }
}

class StringProcessorTest{

    public static String processString(StringProcessor processor, String str){
        return processor.process(str);
    }

    public static void main(String[] args) {
        StringProcessor uppercaseprocessor = (str) -> str.toUpperCase();
        StringProcessor lowercaseProcessor  = (str) -> str.toLowerCase();

        String inputString = "    ThiS iS A StRINg tO TesT LaMbda   ";
        System.out.println("Original String <" + inputString + ">");

        System.out.println("\nFI Lambda...");
        System.out.println("To uppercase <" + uppercaseprocessor.process(inputString) + ">");
        System.out.println("To lowercase <" + lowercaseProcessor.process(inputString) + ">");

        System.out.println("\nTesting trim() non-abstract method...");
        System.out.println("Before trim <" + inputString + ">");
        System.out.println("After trim  <" + lowercaseProcessor.trim(inputString) + ">");


        System.out.println("\nFI lambda as method parameter...");
        System.out.println("To uppercase <" + processString(uppercaseprocessor, inputString) + ">");
        System.out.println("To lowercase <" + processString(lowercaseProcessor,inputString) + ">");
    }
}

class BuiltInInterfacesTest{
    public static void main(String[] args) {
        Predicate<String> predicate = (String::isEmpty);
        Function<String, String> reverse = (String::toUpperCase);

        System.out.println(reverse.apply("test"));

        //predicate.
    }
}