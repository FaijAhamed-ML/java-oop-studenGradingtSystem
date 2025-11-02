
import java.util.Scanner;

public class student {
    private String studentName;
    private int assignmentMarks;
    private int examMarks;
    private char finalGrade;

    public void setStudentName(String yourName){
        studentName = yourName;
    }
    public void setAssignmentMarks(int  yourMark){
        assignmentMarks = yourMark;
    }
    public void setExamMarks(int yourExamMarks){
        examMarks = yourExamMarks;
    }

    public String getStudentName(){
        return studentName;
    }
    public int getAssignmentMark(){
        return assignmentMarks;
    }
    public int getExamMark(){
        return examMarks;
    }
    public char getFinalGrade(){
        return finalGrade;
    }
    public void setFinalGrade(int assignmentMarks,int examMarks){
        double totalMarks = ((double)assignmentMarks*0.4) + ((double)examMarks*0.6);
        if (totalMarks>=80){
            finalGrade='A';
        }else if(totalMarks<80 && totalMarks>=65){
            finalGrade='B';
        }else if(totalMarks<65 && totalMarks>=50){
            finalGrade='c';
        }else{
            finalGrade='F';
        }
    }
    
    public static void main(String[] args) {
        Scanner get=new Scanner(System.in);

        student input1= new student();

        System.out.print("Enter your name : ");
        String name= get.next();
        System.out.print("Enter your assignment marks : ");
        int assignment= get.nextInt();
        System.out.print("enter your exam marks : ");
        int exam= get.nextInt();

        input1.setStudentName(name);
        input1.setAssignmentMarks(assignment);
        input1.setExamMarks(exam);

        input1.setFinalGrade(assignment, exam);

        System.out.println("\nyour final grade is: "+input1.getFinalGrade());
        
       


    }
    
}
