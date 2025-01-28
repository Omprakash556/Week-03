package circularlinkedlist.taskscheduler;

class Task{
    int TaskID;
    String TaskName;
    int priority;
    String DueDate;
    Task next;

    Task(int taskid,String Taskname,int priotiy,String duedate){
        this.DueDate=duedate;
        this.TaskID=taskid;
        this.next=null;
        this.TaskName=Taskname;
        this.priority=priotiy;
    }

}
