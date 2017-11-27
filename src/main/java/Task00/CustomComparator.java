package Task00;

import Task00.Person;
import com.google.common.collect.ComparisonChain;

import java.util.Comparator;

public class CustomComparator implements Comparator<Person> {
    public int compare(Person p1, Person p2){
        return ComparisonChain.start().compare(p1.getName(),p2.getName()).result();
    }
}
