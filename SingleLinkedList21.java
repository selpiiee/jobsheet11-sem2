



public class SingleLinkedList21 {
    Node21 head;
    Node21 tail;

    boolean isEmpty(){
        return (head==null);
    }

    void print() {
        if(!isEmpty()){
            Node21 tmp = head;
            System.out.println("LinkedList Data: ");
            while (tmp!=null){
                tmp.data.print();
                tmp = tmp.next;
            }
        }else {
            System.out.println("LinkedList is empty!!");
        }
    }

    void addFirst(Student21 std) {
        Node21 newNode21 = new Node21(std, null);
        if(isEmpty()){
            head = newNode21;
            tail = newNode21;
        } else {
            newNode21.next = head;
            head = newNode21;
        }
    } 

    void addLast(Student21 std) {
        Node21 newnNode21 = new Node21(std, null);
        if(isEmpty()) {
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

}