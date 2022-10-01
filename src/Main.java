import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Tom", "Polly fon Loper", 34));
        persons.add(new Person("Ron", "Kollins", 33));
        persons.add(new Person("Kelly", "Out my godness fun", 22));
        persons.add(new Person("Set", "Out you godness fun guh", 89));
        persons.add(new Person("Eg", "My godness fun", 21));
        System.out.println(persons);
        Comparator<Person> comparator;
        comparator = (Person o1, Person o2) -> {
            if (o1.getWordsSurname() < 3 || o2.getWordsSurname() < 3) {
                if (o1.getWordsSurname() < o2.getWordsSurname()) {
                    return 1;
                } else if (o1.getWordsSurname() > o2.getWordsSurname()) {
                    return -1;
                }
            }
            return Integer.compare(o2.getAge(), o1.getAge());
        };
        Collections.sort(persons, comparator);
        System.out.println(persons);
    }
}