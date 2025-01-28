package circularlinkedlist.roundrobinschedulingalgorithm;

class Process {
    int id;
    int burstTime;
    int priority;
    Process next;

    Process(int id, int burstTime, int priority) {
        this.id = id;
        this.burstTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}
