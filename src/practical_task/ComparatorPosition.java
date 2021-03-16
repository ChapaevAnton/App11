package practical_task;

import java.util.Comparator;

public class ComparatorPosition {

    // TODO: Создайте компараторы упорядочивающие список
    //  сотрудников по ФИО (name), если ФИО совпадает
    //  - примените дополнительную сортировку по ОПЫТУ РАБОТЫ (workExperience)

    public static class name implements Comparator<Employees> {

        @Override
        public int compare(Employees o1, Employees o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public static class workExperience implements Comparator<Employees> {

        @Override
        public int compare(Employees o1, Employees o2) {
            return o1.getWorkExperience() - o2.getWorkExperience();
        }
    }
}
