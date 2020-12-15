package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        Forum forum = new Forum();

        Map<Integer, ForumUser> theResultMapOfForumUser = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getBirthDay().getYear() < 2000)
                .filter(forumUser -> forumUser.getAmountPublicPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getIdentifier, forumUser -> forumUser));

        System.out.println("# Elements: " + theResultMapOfForumUser.size());
        theResultMapOfForumUser.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}

//            Map<String, Book> theResultMapOfBooks = bookDirectory.getList().stream()
//                    .filter(book -> book.getYearOfPublication() > 2005)
//                    .collect(Collectors.toMap(Book::getSignature, book -> book));
//
//            System.out.println("# Elements: " + theResultMapOfBooks.size());
//            theResultMapOfBooks.entrySet().stream()
//                    .map(entry -> entry.getKey() + ": " + entry.getValue())
//                    .forEach(System.out::println);


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
        /*
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String text1 = poemBeautifier.beautify("This text is great ", (text -> "ABC - " + text + "ABC"));
        System.out.println(text1);

        String text2 = poemBeautifier.beautify("This text is great ", (text -> text.toUpperCase()));
        System.out.println(text2);

        String text3 = poemBeautifier.beautify("This text is great ", (text -> text.replace(" ", "#")));
        System.out.println(text3);

        String text4 = poemBeautifier.beautify(" This text is great ", (text -> text.repeat(3)));
        System.out.println(text4);

        String text5 = poemBeautifier.beautify("This text is great - ", (text -> text.concat(String.valueOf(text.hashCode()))));
        System.out.println(text5);
        */

        //System.out.println("Using Stream to generate even numbers from 1 to 20 ");
       // NumbersGenerator.generateEven(20);

//        People.getList().stream()
//                .map(s -> s.toUpperCase())
//                .filter(s -> s.length() > 11)
//                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
//                .filter(s -> s.substring(0, 1).equals("T"))
//                .forEach(System.out::println);

            //BookDirectory bookDirectory = new BookDirectory();

            //List<Book> theResultListOfBooks = bookDirectory.getList().stream()
            //bookDirectory.getList().stream()
                  //  .filter(book -> book.getYearOfPublication() > 2008)
                  //  .collect(Collectors.toList());

            //System.out.println("# Elements: " + theResultListOfBooks.size());
            //theResultListOfBooks.stream()
                   // .forEach(System.out::println);

//            Map<String, Book> theResultMapOfBooks = bookDirectory.getList().stream()
//                    .filter(book -> book.getYearOfPublication() > 2005)
//                    .collect(Collectors.toMap(Book::getSignature, book -> book));
//
//            System.out.println("# Elements: " + theResultMapOfBooks.size());
//            theResultMapOfBooks.entrySet().stream()
//                    .map(entry -> entry.getKey() + ": " + entry.getValue())
//                    .forEach(System.out::println);

//            String theResultStringOfBooks = bookDirectory.getList().stream()
//                    .filter(book -> book.getYearOfPublication() > 2005)
//                    .map(Book::toString)
//                    .collect(Collectors.joining(" ,\n", "<<",">>"));
//            System.out.println(theResultStringOfBooks);

