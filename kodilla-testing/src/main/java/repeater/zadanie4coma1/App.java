package repeater.zadanie4coma1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<String> companies = new ArrayList<>();
        companies.add("DELL");
        companies.add("APPLE");
        companies.add("SAMSUNG");
        companies.add("SONY");
        companies.add("ALCATEL");

        Iterator<String> iterator = companies.iterator();



        for (String zmienna:companies) {

            String newString = iterator.next();
            System.out.print(newString);
            if(iterator.hasNext()) {
                System.out.print(", ");
            }
        }


    }

}
