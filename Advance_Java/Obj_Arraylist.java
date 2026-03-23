package Advance_Java;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {

    private String name;
    private int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student s) {
        return this.age - s.age;   // sort by age
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }

    public static void main(String[] args) {

        Student s = new Student("Jeba",25);
        Student s1 = new Student("Raj",35);
        Student s2 = new Student("Kishore",20);

        ArrayList<Student> arr = new ArrayList<>();
        arr.add(s);
        arr.add(s1);
        arr.add(s2);

        Collections.sort(arr);   // sorting using compareTo()

        System.out.println(arr);


    }
}