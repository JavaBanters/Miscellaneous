package interview.question1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Sorting {

    public static void main(String[] args){


        String str1 = "John K Smith 56";//["John","K","Smith","56"]
        String str2 = "Sam T wallace 40";
        String str3 = "Kelly P Bradford 23";
        String str4 = "Eric G Link 33";
        String str5 ="Chris N Macon 34";
        String str6 ="Sam T Wallace 35";
        String str7 ="John P Smith 40";
        String str8 = "Chris K Macon 24";
        List<String> list = List.of(str1,str2,str3,str4,str5,str6,str7,str8);

        List<Person> persons = new ArrayList<>();

        for(String s: list) {
            String [] details = s.split(" ");
            String fName = details[0];
            String mName = details[1];
            String lName = details[2];
            int age = Integer.parseInt(details[3]);

            Person person = new Person(fName,lName,mName,age);
            persons.add(person);
        }

        // Functions for getting first and last names from an Employee
        Function<Person, String> byFirstName = Person::getFirstName;
        Function<Person, String> byLastName = Person::getLastName;
        Function<Person, String> byMiddleName = Person::getMiddleName;
        Function<Person, Integer> byAge = Person::getAge;

        Comparator<Person> lastThenFirstThenMiddleThenAge =
                Comparator.comparing(byLastName)
                        .thenComparing(byFirstName)
                        .thenComparing(byMiddleName)
                        .thenComparing(byAge);

        persons.stream().sorted(lastThenFirstThenMiddleThenAge)
                .forEach(System.out::println);
    }



}
