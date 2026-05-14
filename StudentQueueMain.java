import java.util.Scanner;

public class StudentQueueMain {
    public static void main(String[] args) {
        StudentQueue q = new StudentQueue();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Service Queue ---");
            System.out.println("1. Register Student (Enqueue)");
            System.out.println("2. Call Next Student (Dequeue)");
            System.out.println("3. Check First & Last Student");
            System.out.println("4. Total Students in Queue");
            System.out.println("5. Clear Queue");
            System.out.println("6. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("NIM: "); String nim = sc.nextLine();
                    System.out.print("Name: "); String name = sc.nextLine();
                    System.out.print("Class: "); String cls = sc.nextLine();
                    System.out.print("GPA: "); double gpa = sc.nextDouble();
                    q.enqueue(new Student(nim, name, cls, gpa));
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.peek();
                    break;
                case 4:
                    System.out.println("Total students waiting: " + q.getSize());
                    break;
                case 5:
                    q.clear();
                    break;
            }
        } while (choice != 6);
        sc.close();
    }
}