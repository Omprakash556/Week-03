package singlilinkedlist.studentrecordmgmt;



// Main method
public class StudentManagement {
    public static void main(String[] args) {
        // Create object of studentList class
        StudentList studentList = new StudentList();

        // Call method add first
        studentList.addFirst(101, "Om Prakaah", 23, "A");
        studentList.addFirst(100, "Prahlad Rathod", 24,"B");

        // Call method add last
        studentList.addLast(105,"Deepansh Khare", 22,"A");
        studentList.addLast(106, "Furquan Maszid",25,"C");

        // Call method add at specific position
        studentList.addPosition(103,"Anubhav Singh",26,"C",3);
        studentList.addPosition(104,"Kuldeep Sharma",24,"B",4);
        studentList.displayResults();
        System.out.println();

        // Call search method
        System.out.println("Search for roll Number 104: ");
        studentList.search(104);
        System.out.println();

        // Call upgrade method for grade
        studentList.upgradeGrade(105,"A+");
        System.out.println();

        // Call delete method
        System.out.println("After deleting roll num 106: ");
        studentList.deleteNode(106);
        studentList.displayResults();
        System.out.println();

    }
}
