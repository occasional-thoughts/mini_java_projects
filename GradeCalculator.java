import java.util.*;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks of subject " + (i+1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        double avg = (double) total / n;
        System.out.println("Total = " + total);
        System.out.println("Average = " + avg);

        if (avg >= 90) System.out.println("Grade: A");
        else if (avg >= 75) System.out.println("Grade: B");
        else if (avg >= 50) System.out.println("Grade: C");
        else System.out.println("Grade: Fail");
    }
}
