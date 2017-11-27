package Task00;

import java.util.ArrayList;
import java.util.List;

//Brak kontroli wpisywanych danych i sortowania

public class Main {
    public static void main(String args[]){
        //System.out.println("Hello World!");
        PersonGenerator personGenerator = new PersonGenerator();
        List<Person> people = personGenerator.generateListOfPeople(20);
        for(Person tmp : people){
            System.out.println(tmp.toString());
        }
    }
}
