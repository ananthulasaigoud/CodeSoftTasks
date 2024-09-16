import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args){
        Scanner scanning = new Scanner(System.in);
        int NumberOfSubjects;
        System.out.print("Enter the number of subjects :");
        NumberOfSubjects = scanning.nextInt();
        int TotalSubMarks[] = new int[NumberOfSubjects];
        for(int i = 1 ; i<=NumberOfSubjects;i++){
            System.out.print("Enter the marks in "+i+" Subject out of 100 :");
            int MarksValues = scanning.nextInt();
            TotalSubMarks[i-1]=MarksValues;
        }
        float sum = 0f;
        for(int i = 0 ;i<TotalSubMarks.length;i++){
            sum = sum+TotalSubMarks[i];
        }
        float AvarageOfMarks = sum/NumberOfSubjects;

        char grade;

        if (AvarageOfMarks >= 90) {
            grade = 'A';
        } else if (AvarageOfMarks >= 80) {
            grade = 'B';
        } else if (AvarageOfMarks >= 70) {
            grade = 'C';
        } else if (AvarageOfMarks >= 60) {
            grade = 'D';
        } else if (AvarageOfMarks >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        System.out.println("Total marks: "+sum+"\nAverage Percentage: "+AvarageOfMarks+"\nGrade: "+grade);
    }
}
