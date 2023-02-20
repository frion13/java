public class Nodes {
    private Person pers1;
    private Person pers2;
    private int node1;
    private int node2;


    public Nodes(Person pers1, Person pers2, int n1, int n2) {
        this.pers1 = pers1;
        this.pers2 = pers2;
        this.node1 = n1;
        this.node2 = n2;
    }

    public Person getPers1() {
        return pers1;
    }

    public Person getPers2() {
        return pers2;
    }

    public void setPers1(Person pers1) {
        this.pers1 = pers1;
    }

    public void setPers2(Person pers2) {
        this.pers2 = pers2;
    }

    public int getNode1() {
        return node1;
    }

    public int getNode2() {
        return node2;
    }

    public void setNode1(int node1) {
        this.node1 = node1;
    }

    public void setNode2(int node2) {
        this.node2 = node2;
    }
}
