import java.util.Scanner;

public class SLLMain21 {
    public static void main(String[] args) {
        SingleLinkedList21 sll = new SingleLinkedList21();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- Student Data Input (Linked List) ---");
        
        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter data for Student " + (i + 1));
            
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            
            System.out.print("Name  : ");
            String name = sc.nextLine();
            
            System.out.print("Class : ");
            String className = sc.nextLine();
            
            System.out.print("GPA   : ");
            double gpa = sc.nextDouble();
            sc.nextLine();

            Student21 std = new Student21(nim, name, className, gpa);
            sll.addLast(std);
        }

        System.out.println("\n--- Final Student List ---");
        sll.print();
        
        sc.close();
    }
}