package circularlinkedlist.taskscheduler;

public class TaskList{
    private Task head;
    private  Task tail;
    public  void addAtFront( int taskid,String Taskname,int priotiy,String duedate){
        Task newtask=new Task(taskid,Taskname, priotiy, duedate);
        if(head==null){
            head=newtask;
            tail=newtask;
            return;
        }
        newtask.next=head;
        head=newtask;
        tail.next=head;

    }
    public void addLast(int taskid,String Taskname,int priotiy,String duedate){
        Task newtask=new Task(taskid,Taskname, priotiy, duedate);
        if(head==null){
            head=newtask;
            tail=head;
            return;
        }
        tail.next=newtask;
        tail=newtask;
        newtask.next=head;

    }
    public  void addSpecific(int taskid,String Taskname,int priotiy,String duedate,int position){
        Task newtask=new Task(taskid,Taskname, priotiy, duedate);
        Task temp=head;
        Task prev=null;
        if(position==1){
            addAtFront(taskid,Taskname,priotiy,duedate);
        }
        while (temp!=null && position!=1){
            prev=temp;
            temp=temp.next;
            position--;


        }

        prev.next=newtask;
        newtask.next=temp;



    }
    public void removeTaskById(int id){
        if(head==null)return;
        Task temp=head;

        if(temp.TaskID==id){
//           case1 head node
            tail.next=tail.next.next;
            head=head.next;
            return;

        }
        temp=temp.next;
        Task prev=null;
        while(temp.TaskID!=id && temp!=head){
            prev=temp;
            temp=temp.next;
        }

//        middle node
        prev.next=prev.next.next;



    }
    public  void searchByPriotity(int priority){
        Task temp=head;
        if(temp.priority==priority){
            System.out.println("Present");
            return;
        }
        temp=temp.next;
        while(temp.priority!=priority && temp!=head ){
            temp=temp.next;


        }
        if(temp==head){
            System.out.println("Not present");
            return;
        }

    }
    public  void print(){
        Task temp=head;
        System.out.println("TaskID: "+ temp.TaskID+" TaskName: "+ temp.TaskName+"dueDate: "+ temp.DueDate+"  Priority: "+ temp.priority);
        temp=temp.next;
        while(temp!=head){
            System.out.println("TaskID: "+ temp.TaskID+" TaskName: "+ temp.TaskName+"dueDate: "+ temp.DueDate+"  Priority: "+ temp.priority);
            temp=temp.next;

        }
    }


}
