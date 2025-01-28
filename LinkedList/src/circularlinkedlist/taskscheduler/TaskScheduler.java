package circularlinkedlist.taskscheduler;


public class TaskScheduler {
    public static void main(String[] args) {
                TaskList circular=new TaskList();
                circular.addAtFront(1,"cpu",5,"21-06-2009");
                circular.addAtFront(2,"Gpu",5,"21-06-2009");
                 circular.addAtFront(3,"Lpu",5,"21-06-2009");
                circular.addLast(78,"Lpu",5,"21-06-2009");
                circular.addLast(90,"Lpu",5,"21-06-2009");
                circular.addSpecific(567,"Fur",45,"21033",3);
                circular.removeTaskById(567);
                circular.removeTaskById(90);
               circular.removeTaskById(1);
               circular.searchByPriotity(6);
                circular.print();


    }
}
