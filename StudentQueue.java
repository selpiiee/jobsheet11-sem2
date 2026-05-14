
public class StudentQueue {

    Node head, tail;
    int size;

    public StudentQueue() {
        head = tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean isFull() {
        return false;
    }

    public void enqueue(Student data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        System.out.println(data.name + " added to the queue.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println("Calling student: " + head.data.name);
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Front: " + head.data.name);
            System.out.println("Rear: " + tail.data.name);
        } else {
            System.out.println("Queue is empty.");
        }
    }

    public int getSize() {
        return size;
    }

    public void clear() {
        head = tail = null;
        size = 0;
        System.out.println("Queue cleared.");
    }
}
