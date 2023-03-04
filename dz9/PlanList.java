import java.util.ArrayList;
import java.util.List;

public class PlanList {
    private final static List<Plan> purpose = new ArrayList<>();

    public static List<Plan> getPurpose() {
        return purpose;
    }

    public static void add(Plan purposes) {
        purpose.add(purposes);
    }

    public static void addAll(List<Plan> purposes) {
        purposes.addAll(purposes);
    }

    public static int getPurposeById(int id) {
        int i = 0;
        boolean notFound = true;
        while (notFound && i < purpose.size()) {
            if (purpose.get(i).getId() == id) {
                notFound = false;
            } else {
                i++;
            }
        }
        if (notFound) {
            i = -1;
        }
        return i;
    }

    public static void removeById(int id) {
        if (getPurposeById(id) > -1) {
            int index = getPurposeById(id);
            purpose.remove(index);
        }
    }

    public static void newTerm() {
        purpose.sort(new TermComparator());
    }

    public static void newPriority() {
        purpose.sort(new PriorityCompe());
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Plan element : purpose) {
            str.append(element + "\n");
        }
        return str.toString();

    }
}