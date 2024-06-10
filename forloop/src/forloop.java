import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        Scanner grades = new Scanner(System.in);

        //prompt user for grades and store in an array

        System.out.println("Enter the floating number grade for student 1: ");
        Float student1 = grades.nextFloat();

        System.out.println("Enter the floating number grade for student 2: ");
        Float student2 = grades.nextFloat();

        System.out.println("Enter the floating number grade for student 3: ");
        Float student3 = grades.nextFloat();

        System.out.println("Enter the floating number grade for student 4: ");
        Float student4 = grades.nextFloat();

        System.out.println("Enter the floating number grade for student 5: ");
        Float student5 = grades.nextFloat();

        System.out.println("Enter the floating number grade for student 6: ");
        Float student6 = grades.nextFloat();

        System.out.println("Enter the floating number grade for student 7: ");
        Float student7 = grades.nextFloat();

        System.out.println("Enter the floating number grade for student 8: ");
        Float student8 = grades.nextFloat();

        System.out.println("Enter the floating number grade for student 9: ");
        Float student9 = grades.nextFloat();

        System.out.println("Enter the floating number grade for student 10: ");
        Float student10 = grades.nextFloat();

        //store the values entered into an array
        float[] studentGrades = {student1, student2, student3, student4, student5, student6, student7, student8, student9, student10};

        //sum and average of array values
       float avg, sum =0;
       int length = studentGrades.length;
       for (int i = 0; i < length; i++) {
           sum += studentGrades[i];
       }
       avg = sum / length;
       System.out.println("The average student grade is: " + avg);

       //max grade
        float largest = studentGrades[0];
        for (int i = 0; i < studentGrades.length; i++) {
            if (studentGrades[i] > largest) {
                largest = studentGrades[i];
            }
        }
        System.out.println("The maximum student grade is: " + largest);

        //min grade
        float smallest = studentGrades[0];
        for (int i = 0; i < studentGrades.length; i++) {
            if (studentGrades[i] < smallest) {
                smallest = studentGrades[i];
            }
        }
        System.out.println("The min student grade is: " + smallest);



    }




}
