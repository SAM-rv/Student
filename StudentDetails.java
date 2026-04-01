package Students;

import java.util.*;

public class StudentDetails {
    Scanner sc=new Scanner(System.in);
    List<Student> studentList=new ArrayList<>();
    Set <Integer> set =new HashSet<>();
    void addStudents() throws InputMismatchException {
        System.out.println("Enter Details :-");
        char ch='y';
        do {
            System.out.print("Id :- ");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.print("Name :- ");
            String name=sc.nextLine();
            System.out.print("Age :- ");
            int age=sc.nextInt();
            System.out.print("mark :- ");
            int mark=sc.nextInt();
            sc.nextLine();
                if (!set.add(id))
                    System.out.println("Student With Same Id Is Already Present");
                else {
                    studentList.add(new Student(id, name, age, mark));
                    System.out.println("Student Details Added Successfully");
                }
            System.out.println("Press y for next Entry");
            ch=sc.nextLine().charAt(0);
        }while(ch=='y');
    }
    void removeStudents(){
        boolean found=false;
        if(studentList.isEmpty()){
            System.out.println("No Student Data Found");
            return;
        }
        System.out.print("Enter Student Id :-");
        int id=sc.nextInt();
        Student s1 = null;
        for(Student st:studentList){
            if(st.getId()==id) {
                found=true;
                s1 = st;
            }
        }
        if(!found){
            System.out.println("No Student Data Found");
            return;
        }
        studentList.remove(s1);
        set.remove(id);
        System.out.println("Student Removed Successfully");
    }
    void updateStudentMarks(){
        System.out.print("Enter Student Id :-");
        int id=sc.nextInt();
        boolean found=false;
        System.out.print("Enter Mark To Update :-");
        int mark=sc.nextInt();
        for(Student st:studentList){
            if(st.getId()==id) {
                found=true;
                st.setMark(mark);
            }
        }
        if(!found){
            System.out.println("No Student Data Found");
            return;
        }
        System.out.println("Student Details Updated Successfully");
    }
    void viewAllStudents(){
        System.out.println("<-----Student Detail----->");
        System.out.println("Id\tName\tAge\tMarks");
        for(Student st:studentList){
            System.out.println(st.getId()+"\t"+st.getName()+"\t"+st.getAge()+"\t"+st.getMark());
        }
    }
    void findTopper(){
        if(studentList.isEmpty()){
            System.out.println("No Student Data Found");
            return;
        }
        int topper=Integer.MIN_VALUE;
        Student st1 = null;
        for(Student st:studentList){
            if(topper<st.getMark()){
                topper=st.getMark();
                st1=st;
            }
        }
        System.out.println(st1.getId()+"\t"+st1.getName()+"\t"+st1.getAge()+"\t"+st1.getMark());
    }
}