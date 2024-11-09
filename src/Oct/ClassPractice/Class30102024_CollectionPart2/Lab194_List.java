package Oct.ClassPractice.Class30102024_CollectionPart2;

import java.util.ArrayList;
import java.util.List;

public class Lab194_List {
    public static void main(String[] args) {
Student s1 = new Student("Anu",1);
Student s2 = new Student("Manoj",2);
Student s3 = new Student("Shree",3);

        List<Student> myStudent = new ArrayList<>();
        myStudent.add(s1);
        myStudent.add(s2);
        myStudent.add(s3);
        System.out.println(myStudent);
    }
}

class Student{
    private String name;
    private int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }
}