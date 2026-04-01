package Students;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StudentDetails stu=new StudentDetails();
        System.out.println("<----Select Operation---->");
        System.out.println("1. Add Student \n2. Remove Student \n3. Update Student\n4. View All Students \n5. Find Topper \n6. Exit");
        int ch;
        do {
            ch=sc.nextInt();
            switch (ch) {
                case 1:
                    try {
                        stu.addStudents();
                    } catch (RuntimeException e) {
                        System.out.println("Invalid Input");
                    }
                    break;
                case 2:
                    stu.removeStudents();
                    break;
                case 3:
                    stu.updateStudentMarks();
                    break;
                case 4:
                    stu.viewAllStudents();
                    break;
                case 5:
                    stu.findTopper();
                    break;
                default:
                    System.out.println("---------Invalid Selection-------");
            }
        }while(ch!=6);
    }
}