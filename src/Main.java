import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Person> per30;
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person(10, "Петя"));
        persons.add(new Person(15, "Лена"));
        persons.add(new Person(17, "Маша"));
        persons.add(new Person(50, "Витя"));
        persons.add(new Person(35, "Женя"));
        persons.add(new Person(21, "Олег"));
        persons.add(new Person(18, "Нина"));
        persons.add(new Person(48, "Рома"));

        persons.stream().forEach((person) -> System.out.println(person.getName() + ", " + person.getAge() + " лет"));
        System.out.println("Возраст");
        List ages = persons.stream().map((person -> person.getAge())).collect(Collectors.toList());
        ages.stream().forEach(age -> System.out.print(age + " "));
        System.out.println();
        System.out.println("Имена");
        List names = persons.stream().map((person -> person.getName())).collect(Collectors.toList());
        names.stream().forEach(name -> System.out.print(name + " "));
        System.out.println();
        System.out.println("Страше 30ти:");
        per30 = persons.stream().filter((person -> person.getAge() > 30)).collect(Collectors.toList());
        per30.stream().forEach(p -> System.out.println(p.getName()));
    }
}
