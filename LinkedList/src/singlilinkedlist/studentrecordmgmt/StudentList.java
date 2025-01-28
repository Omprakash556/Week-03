package singlilinkedlist.studentrecordmgmt;

// Create a student class Node
public class StudentList {
    Student head;
    public StudentList(){
        head = null;
    }

    // add first on node
    public void addFirst(int rollNum, String name, int age, String grade){
        Student newNode = new Student(rollNum, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    // add last on node
    public void addLast(int rollNum, String name, int age, String grade){
        Student newNode = new Student(rollNum, name, age, grade);
        if (head == null){
            head = newNode;
        }else {
            Student current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // add specific position on node
    public void addPosition(int rollNum, String name, int age, String grade, int position){
        if (position == 1){
            addFirst(rollNum, name, age, grade);
            return;
        }
        Student newNode = new Student(rollNum, name, age, grade);
        Student current = head;
        int track = 1;
        while (current != null && track < position-1){
            current = current.next;
            track++;
        }
        newNode.next = current.next;
        current.next = newNode;
    }


    // delete node with the help of roll number
    public void deleteNode(int rollNum){
        if (head == null){
            System.out.println("Linked list is empty");
            return;
        }
        if(head.rollNum == rollNum){
            head = head.next;
            return;
        }

        Student current = head;
        while (current.next != null && current.next.rollNum != rollNum){
            current = current.next;
        }
        if (current == null){
            System.out.println("This roll number is not present");
        }else {
            current.next = current.next.next;
        }
    }


    // search students data with the help of roll number
    public void search(int rollNum){
        Student current = head;
        while (current != null){
            if(current.rollNum == rollNum){
                System.out.println("Roll Number: "+current.rollNum+", Name: "+current.name+", Age: "+current.age+", Grade: "+current.grade);
                return;
            }
            current = current.next;
        }
        System.out.println("Roll Number "+current.rollNum+"is not found.");
    }

    // Display all results
    public void displayResults(){
        if (head == null){
            System.out.println("No any data here.");
            return;
        }
        Student current = head;
        while (current != null){
            System.out.println("Roll Number: "+current.rollNum+", Name: "+current.name+", Age: "+current.age+", Grade: "+current.grade);
            current = current.next;
        }
    }

    // Update grade using roll number and newGrade
    public void upgradeGrade(int rollNum, String newGrade){
        Student current = head;
        while (current != null){
            if (current.rollNum == rollNum){
                current.grade = newGrade;
                System.out.println("Update grade for roll number "+current.rollNum +" is "+current.grade);
                return;
            }
            current = current.next;
        }
        System.out.println("Roll Number "+current.rollNum+"is not valid.");
    }
}


