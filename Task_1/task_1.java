package Task_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class task_1 {

    public static void printStud(List<Student> studlist){
        System.out.println(studlist);
    }

    public static void main(String[] args) {
        Student st1 = new Student(1, "Vasya", "Sergiyovich", "2000", "Vinn", "12322", "facs", (byte) 2, "VL-21");
        Student st2 = new Student(2, "Petsya", "olegovich", "2003", "Vinn", "124422", "facs", (byte) 3, "VL-11");
        Student st3 = new Student(3, "Rusl", "Andri", "2010", "Vinn", "12344444422", "fivt", (byte) 2, "OC-21");
        Student st4 = new Student(4, "Anya", "Andriyvna", "2010", "Vinn", "123444434422", "fivt", (byte) 4, "OC-21");
        Student st5 = new Student(5, "Serg", "Vyachesl", "2002", "Vinn", "123544422", "facs", (byte) 2, "OC-21");
        Student st6 = new Student(6, "Vika", "Dmitr", "2014", "Vinn", "1234442422", "fivt", (byte) 4, "OC-21");

        ArrayList<Student> a1 = new ArrayList<>();
        a1.add(st1);
        a1.add(st2);
        a1.add(st3);
        a1.add(st4);
        a1.add(st5);
        a1.add(st6);

        // 1 вариант через итератор вывод студентов заданного факультета
        String faculty = "facs";
        System.out.println("Список студентов факультета "+faculty);
        Iterator<Student> iterator = a1.iterator();
        while(iterator.hasNext()){
            Student stud = iterator.next();
            if (stud.getFaculty() == faculty){
                System.out.println(stud);
            }
        }

        System.out.println();
        System.out.println();

       // 2 вариант через цикл и обращение к гетеру, сравнивая через еквалс
        String faculty1 = "fivt";
        System.out.println("Список студентов факультета "+faculty1);
            for(Student st:a1){
                if(st.getFaculty().equals(faculty1)){
                    System.out.println(st.toString());
                }
            }
        System.out.println();
        System.out.println();

        String group = "OC-21";
        System.out.println("Список студентов группы "+group);
        for(Student st:a1){
            if(st.getGroup().equals(group)){
                System.out.println(st.toString());
            }
        }
        System.out.println();


        String year = "2003";
        System.out.println("Список студентов, которые родились после " + year + " года. Т.е. которые младше");
        for(Student st:a1){
            if(Integer.parseInt(st.getDataBirthday())>Integer.parseInt(year)){
                System.out.println(st.toString());
            }
        }
        System.out.println();

        int kurs = 3;
        System.out.println("Список студентов всех факультетов, определенного курса "+kurs);
        for(Student st:a1){
            if(Integer.parseInt(st.getKurs()) == kurs){
                System.out.println(st.toString());}
        }

    }
}
