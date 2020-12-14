package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
       // Processor processor = new Processor();
        //ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        //Executor codeToExecute = () -> System.out.println("This is an example text");

        //processor.execute(executeSaySomething);
        //processor.execute(codeToExecute);

        //ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        //expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        //expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        //expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        //expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        //MathChecker mathChecker = new MathChecker();

        //mathChecker.checker(15, 10, (a, b) -> a + b);

        //Tablica tablica = new Tablica();
        //tablica.sprawdzWynik(100, 100, (a, b) -> a / b);

        //System.out.println("Calculating expressions with method references");

       // expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
       // expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addATOB);
       // expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
       // expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);

        //Zadanie 7.1
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String text1 = poemBeautifier.beautify("This text is great ", (text -> "ABC - " + text + "ABC"));
        System.out.println(text1);

        String text2 = poemBeautifier.beautify("This text is great ", (text -> text.toUpperCase()));
        System.out.println(text2);

        String text3 = poemBeautifier.beautify("This text is great ", (text -> text.replace(" ", "#")));
        System.out.println(text3);

        String text4 = poemBeautifier.beautify(" This text is great ", (text -> text.repeat(3)));
        System.out.println(text4);

        //String text5 = poemBeautifier.beautify("This text is great - ", (text -> text.concat(String.valueOf(text.hashCode()))));
        //System.out.println(text5);
    }
}
