import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Family tree = new Family();

        // Значения можно собирать в массиве
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Федор", "Иванов", "03.03.1930", "03.03.2010"));
        persons.add(new Person("Мария", "Иванова", "02.02.1962"));
        persons.add(new Person("Иван", "Иванов", "01.01.1961"));

        // Перебирая массив работаем со значениями
        for (Person person : persons) {
            person.showInfo();
            tree.treePerson.add(person);
        }

        // добавляем связи в цикле
        for (int i =1; i <= 2; i++)
        {
            persons.get(0).addRelatives(persons.get(i), 1, 2);  
        }

        persons.get(0).printRelatives(2);

        tree.showTree(persons.get(0), "");
    }
}