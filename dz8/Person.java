import java.util.ArrayList;


public class Person implements PersonInterface {
    private String name;
    private String surname;
    private String birthDate;
    private ArrayList<Nodes> child = new ArrayList<Nodes>();


    public Person(String name, String surname, String birthDate, String deathDate) {
        this(name, surname, birthDate);
    }

    public Person(String name, String surname, String birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public Person(String name, String surname, String birthDate, String deathDate, ArrayList<Nodes> child) {
        this(name, surname, birthDate, deathDate);
        this.child = child;
    }

    @Override
    public String toString() {
        return "| " + name + " " + surname + " | " + birthDate + " |";
    }

    @Override
    public void showInfo(){
        System.out.println(toString());
    }

    @Override
    public void printRelatives(int st) {
        ArrayList<Nodes> newList = this.getChild();
        System.out.println(this.getName() + " " + this.getSurname() + ", " + this.getBirthDate());
        System.out.println("дети: ");
        for (int i = 0; i < newList.size(); i++) {
            if (newList.get(i).getPers2() != this && newList.get(i).getNode2() == st) {
                System.out.println("Имя: " + newList.get(i).getPers2().name + " " + newList.get(i).getPers2().surname + ", ");
                System.out.println("Дата рождения: " + newList.get(i).getPers2().birthDate + ". ");
            }
        }
    }

    public void addRelatives(Person children, int st1, int st2) {
        this.child.add(new Nodes(this, children, 1, 2));
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getBirthDate() {
        return birthDate;
    }


    public ArrayList<Nodes> getChild() {
        return child;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }


    public void setChild(ArrayList<Nodes> child) {
        this.child = child;
    }
}

