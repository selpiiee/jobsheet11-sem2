
public class SLLMain21 {

    public static void main(String[] args) {
        SingleLinkedList21 sll = new SingleLinkedList21();

        Student21 std1 = new Student21("001", "Student 1", "TI-1I", 3.89);
        Student21 std2 = new Student21("002", "Student 2", "TI-1I", 3.45);
        Student21 std3 = new Student21("003", "Student 3", "TI-1I", 3.20);
        Student21 std4 = new Student21("004", "Student 4", "TI-1I", 3.00);

        sll.print();
        sll.addFirst(std4);
        sll.print();
        sll.addLast(std1);
        sll.print();
        sll.insertAfter(std3, "Student 4");
        sll.insertAt(2, std2);
        sll.print();

        System.out.println();

        System.out.println("Data at index 1 is:");
        Student21 data = sll.getData(1);
        data.print();

        int idx = sll.indexOf("Student 1");
        System.out.println("Student 1 is located at index: " + idx);

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }

}
