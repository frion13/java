import java.util.Comparator;

public class TermComparator implements Comparator<Plan> {

    @Override
    public int compare(Plan o1, Plan o2) {
        return o1.getDeadline().compareTo(o2.getDeadline());
    }
    
}