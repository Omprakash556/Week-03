package singlilinkedlist.studentrecordmgmt;

// create student class for holding information
public class Student{
    int rollNum;
    String name;
    int age;
    String  grade;
    Student next;

    // create parametrised constructor
    public Student(int rollNum, String name, int age, String  grade){
        this.rollNum = rollNum;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}
