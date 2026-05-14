
public class SingleLinkedList21 {

    Node21 head;
    Node21 tail;

    boolean isEmpty() {
        return (head == null);
    }

    void print() {
        if (!isEmpty()) {
            Node21 tmp = head;
            System.out.println("LinkedList Data: ");
            while (tmp != null) {
                tmp.data.print();
                tmp = tmp.next;
            }
        } else {
            System.out.println("LinkedList is empty!!");
        }
    }

    void addFirst(Student21 std) {
        Node21 newNode21 = new Node21(std, null);
        if (isEmpty()) {
            head = newNode21;
            tail = newNode21;
        } else {
            newNode21.next = head;
            head = newNode21;
        }
    }

    void addLast(Student21 std) {
        Node21 newnNode21 = new Node21(std, null);
        if (isEmpty()) {
            head = newnNode21;
            tail = newnNode21;
        } else {
            tail.next = newnNode21;
            tail = newnNode21;
        }
    }

    void insertAfter(Student21 std, String key) {
        Node21 newnNode21 = new Node21(std, null);
        Node21 temp = head;
        do {
            if (temp.data.name.equalsIgnoreCase(key)) {
                newnNode21.next = temp.next;
                temp.next = newnNode21;
                if (newnNode21.next == null) {
                    tail = newnNode21;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    void insertAt(int index, Student21 std) {
        if (index < 0) {
            System.out.println("wrong index!");
        } else if (index == 0) {
            addFirst(std);
        } else {
            Node21 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node21(std, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    Student21 getData(int idx) {
        if (isEmpty()) {
            System.out.println("LinkedList is empty!!");
            return null;
        }
        Node21 tmp = head;
        for (int i = 0; i < idx; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    int indexOf(String key) {
        if (isEmpty()) {
            System.out.println("LinkedList is empty!!");
            return -1;
        }
        Node21 tmp = head;
        int idx = 0;
        while (tmp != null && !tmp.data.name.equalsIgnoreCase(key)) {
            tmp = tmp.next;
            idx++;
        }
        if (tmp == null) {
            return -1;
        } else {
            return idx;
        }
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("LinkedList is empty!!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("LinkedList is empty!!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node21 tmp = head;
            while (tmp.next != tail) {
                tmp = tmp.next;
            }
            tmp.next = null;
            tail = tmp;
        }
    }

    public void remove(String key) {
        if (isEmpty()) {
            System.out.println("LinkedList is empty!!");
        } else {
            Node21 temp = head;
            while (temp != null) {
                if ((temp.data.name.equalsIgnoreCase(key)) && (temp == head)) {
                    removeFirst();
                    break;
                } else if (temp.next.data.name.equalsIgnoreCase(key)) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node21 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }

}
