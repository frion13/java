import java.util.Comparator;

public class PriorityCompe implements Comparator<Plan> {

    @Override
    public int compare(Plan o1, Plan o2) {
        return o1.getPurposePriority().compareTo(o2.getPurposePriority());
    }
    
}