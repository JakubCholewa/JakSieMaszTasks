package Task00;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Task00.Person;

public class PersonGenerator {
    String[] randomNames = {"Kyle", "James", "Jon", "William", "Patrick", "Martin", "Zoe", "Harry", "Marcus", "Walter"};
    String[] randomSurnames = {"Brezinsky", "Apolskis", "Newman", "Freeman", "White", "Adams", "Bane", "Baker", "Smith", "Jones", "Taylor"};
    String[] randomEmails = {"s1211422@mvrht.net", "gmie23@gjem.net", "jio43m2@gmail.com", "qwer234@yahoo.com",
                            "mhkl23ml@dotnet.com", "rabs3223@gm2.net"};

    public Person generatePerson(){
        Random randomGenerator  = new Random();
        int random = randomGenerator.nextInt(randomNames.length);
        String name = randomNames[random];
        random = randomGenerator.nextInt(randomSurnames.length);
        String surname = randomSurnames[random];
        random = randomGenerator.nextInt(randomEmails.length);
        String email = randomEmails[random];

        return new Person(name, surname, email);

    }


    public List<Person> generateListOfPeople(int number){
        List<Person> randomPeople = new ArrayList<>();
        for(int i=0;i<number;i++){
            randomPeople.add(this.generatePerson());
        }

        //Collections.sort(randomPeople, new CustomComparator());

        return randomPeople;
    }



}
