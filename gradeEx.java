package Java_Module_2;

public class gradeEx {
    public static void main(String[] args) {
        int marks= 82;
        String grade=(marks>=90)?"A":
                     (marks>=75)?"B":
                     (marks>=50)?"C":"F";
        System.out.println("Grade: "+ grade);             
    }
}
