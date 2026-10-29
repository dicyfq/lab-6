package ua.opnu.list;

import java.util.Comparator;

public class SurnameSorter implements Comparator {
    private boolean isAscending;

    public SurnameSorter(boolean isAscending) {
        this.isAscending = isAscending;
    }

    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Student && o2 instanceof Student) {
            Student s1 = (Student) o1;
            Student s2 = (Student) o2;

            int result = s1.getLastName().compareTo(s2.getLastName());
            return isAscending ? result : -result;
        }
        return 0;
    }
}