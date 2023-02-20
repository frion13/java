public class Main {
    public static void main(String[] args) {

        Family tree = new Family();
        Person pers1 = new Person("Федор", "Иванов", "03.03.1930", "03.03.2010");
        Person pers2 = new Person("Мария", "Иванова", "02.02.1962");
        Person pers3 = new Person("Иван", "Иванов", "01.01.1961");

        pers1.showInfo();
        pers2.showInfo();
        pers3.showInfo();

        tree.treePerson.add(pers1);
        tree.treePerson.add(pers2);
        tree.treePerson.add(pers3);

        pers1.addRelatives(pers2, 1, 2);
        pers1.addRelatives(pers3, 1, 2);

        pers1.printRelatives(2);

        tree.showTree(pers1, "");
    }
}