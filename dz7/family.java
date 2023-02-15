import java.util.LinkedHashSet;
import java.util.Set;

public class family {
    public static Set<family> familySet = new LinkedHashSet<family>();
    private final String name;
    private final String surname;
    private final String sex;
    private family mother;
    private family father;
    private family child;
    private family sister;
    private family brother;
    private family granfather;
    private family granmother;
    private family uncle;
    private family aunt;
    private family nephew;
    private family niece;
    private family sp;

    public family(String surname, String name, String sex) {
        this.surname = surname;
        this.name = name;
        this.sex = sex;
        familySet.add(this);
    }

    public String getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }

    public family getFather() {
        return father;
    }

    public family getMother() {
        return mother;
    }

    public family getChild() {
        return child;
    }

    public family getBrother() {
        return brother;
    }

    public family getSister() {
        return sister;
    }
    public family getGranfather() {
        return granfather;
    }
    public family getGranmother() {
        return granmother;
    }
    public family getUncle() {
        return uncle;
    }

    public family getAunt() {
        return aunt;
    }

    public family getNephew() {
        return nephew;
    }

    public family getNiece() {
        return niece;
    }

    public family getSp() {
        return sp;
    }

    public void setFather(family family) {
        this.father = family;
    }

    public void setMother(family family) {
        this.mother = family;
    }

    public void setChild(family family) {
        this.child = family;
    }

    public void setBrother(family family) {
        this.brother = family;
    }

    public void setSister(family family) {
        this.sister = family;
    }

    public void setGranfather(family family) {
        this.granfather = family;
    }
    public void setGranmother(family family) {
        this.granmother = family;
    }
    public void setUncle(family family) {
        this.uncle = family;
    }

    public void setAunt(family family) {
        this.aunt = family;
    }

    public void setNephew(family family) {
        this.nephew = family;
    }

    public void setNiece(family family) {
        this.niece = family;
    }

    public void setSp(family family) {
        this.sp = family;
    }





    public String getInfo(){
        return String.format("Имя: %s, Фамилия: %s пол: %s", name, surname, sex);
    }
}