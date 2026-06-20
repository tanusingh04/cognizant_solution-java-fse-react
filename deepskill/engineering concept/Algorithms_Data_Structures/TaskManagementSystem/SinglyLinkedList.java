package TaskManagementSystem;

public class SinglyLinkedList {
    private Node head;

    private static class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    public SinglyLinkedList() {
        this.head = null;
    }

    // Add a task to the end of the list
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Task added successfully: " + task.getTaskName());
    }

    // Search a task by ID
    public Task searchTask(String taskId) {
        Node temp = head;
        while (temp != null) {
            if (temp.task.getTaskId().equals(taskId)) {
                return temp.task;
            }
            temp = temp.next;
        }
        return null;
    }

    // Traverse and display all tasks
    public void traverseTasks() {
        if (head == null) {
            System.out.println("No tasks in the list.");
            return;
        }
        System.out.println("\n--- Task List ---");
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.task);
            temp = temp.next;
        }
    }

    // Delete a task by ID
    public boolean deleteTask(String taskId) {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return false;
        }

        // If the head itself needs to be deleted
        if (head.task.getTaskId().equals(taskId)) {
            String removedName = head.task.getTaskName();
            head = head.next;
            System.out.println("Task deleted successfully: " + removedName);
            return true;
        }

        Node prev = head;
        Node curr = head.next;
        while (curr != null) {
            if (curr.task.getTaskId().equals(taskId)) {
                String removedName = curr.task.getTaskName();
                prev.next = curr.next;
                System.out.println("Task deleted successfully: " + removedName);
                return true;
            }
            prev = curr;
            curr = curr.next;
        }

        System.out.println("Task with ID " + taskId + " not found.");
        return false;
    }
}
