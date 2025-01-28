package circularlinkedlist.roundrobinschedulingalgorithm;

public class RoundRobinSchedulerList {
    Process head = null;

    // Add a process at the end of the circular linked list
    void addProcess(int id, int burstTime, int priority) {
        Process newProcess = new Process(id, burstTime, priority);
        if (head == null) {
            head = newProcess;
            newProcess.next = head;
        } else {
            Process temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newProcess;
            newProcess.next = head;
        }
    }

    // Remove a process by Process ID
    void removeProcess(int id) {
        if (head == null) return;

        Process temp = head;
        Process prev = null;
        do {
            if (temp.id == id) {
                if (prev != null) {
                    prev.next = temp.next;
                } else {
                    // If head needs to be removed
                    if (temp.next == head) {
                        head = null;
                    } else {
                        prev = head;
                        while (prev.next != head) prev = prev.next;
                        head = temp.next;
                        prev.next = head;
                    }
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    // Simulate the round-robin scheduling with a fixed time quantum
    void roundRobinScheduling(int timeQuantum) {
        if (head == null) return;

        Process temp = head;
        int totalWaitingTime = 0;
        int totalTurnaroundTime = 0;

        // Calculate the total number of processes
        int totalProcesses = 0;
        Process check = head;
        do {
            totalProcesses++;
            check = check.next;
        } while (check != head);

        int initialCount = totalProcesses; // Store original count for averages

        // Simulate round-robin scheduling
        while (totalProcesses > 0) {
            if (temp.burstTime > timeQuantum) {
                temp.burstTime -= timeQuantum;
                totalWaitingTime += timeQuantum * (totalProcesses - 1);
            } else {
                totalWaitingTime += temp.burstTime * (totalProcesses - 1);
                totalTurnaroundTime += temp.burstTime;
                removeProcess(temp.id);
                totalProcesses--;
                temp = head; // Reset to the head after removal
                continue;
            }

            System.out.println("Process ID: " + temp.id + " Burst Time Left: " + temp.burstTime);
            temp = temp.next;
        }

        // Calculate averages only if there were processes
        if (initialCount > 0) {
            System.out.println("Average Waiting Time: " + (double) totalWaitingTime / initialCount);
            System.out.println("Average Turnaround Time: " + (double) totalTurnaroundTime / initialCount);
        }
    }

    // Display the process list
    void displayList() {
        if (head == null) return;

        Process temp = head;
        do {
            System.out.println("Process ID: " + temp.id + " Burst Time: " + temp.burstTime);
            temp = temp.next;
        } while (temp != head);
    }
}

