import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args){
        Scanner scanning = new Scanner(System.in);
        int NumberOfSubjects;
        System.out.print("Enter the number of subjects :");
        NumberOfSubjects = scanning.nextInt();
        int TotalSubMarks[] = new int[NumberOfSubjects];

        //Here we are giving the input to each subject
        for(int i = 1 ; i<=NumberOfSubjects;i++){
            System.out.print("Enter the marks in "+i+" Subject out of 100 :");
            int MarksValues = scanning.nextInt();
            TotalSubMarks[i-1]=MarksValues;
        }
        //Here we are finding the sum of the marks
        float sum = 0f;
        for(int i = 0 ;i<TotalSubMarks.length;i++){
            sum = sum+TotalSubMarks[i];
        }

        //It calculate the Average Percentage of marks
        float AvarageOfMarks = sum/NumberOfSubjects;
        
        //It will give the grade as per the Marks
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

        //Display in the total record of sum,average marks percentage  and grade
        System.out.println("Total marks: " + sum);
        System.out.println("Average Percentage: " + AvarageOfMarks);
        System.out.println("Grade: " + grade);

        // Close the scanner
        scanning.close();
    }
}
