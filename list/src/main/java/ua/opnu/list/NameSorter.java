package ua.opnu.list;

import java.util.Comparator;

public class NameSorter implements Comparator {

    private boolean order;

    public NameSorter(boolean order) {
        this.order = order;
    }

    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof ua.opnu.list.Student && o2 instanceof ua.opnu.list.Student) {
            ua.opnu.list.Student s1 = (ua.opnu.list.Student) o1;
            ua.opnu.list.Student s2 = (ua.opnu.list.Student) o2;

            if (order) {
                return s1.getName().compareTo(s2.getName());
            } else {
                return s2.getName().compareTo(s1.getName());
            }

        }
        return 0;
    }
}
