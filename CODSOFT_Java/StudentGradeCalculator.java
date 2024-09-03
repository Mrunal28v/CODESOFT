package CODSOFT_Java;

import java.util.Scanner;

public class StudentGradeCalculator {
	
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Enter Your Obtianed Marks out of 100 " );
		System.out.println("Enter obtained marks in English: ");
		int eng = s.nextInt();
		
		System.out.println("Enter obtained marks in Hindi: ");
		int hin = s.nextInt();
		
		System.out.println("Enter obtained marks in Maths: ");
		int maths = s.nextInt();
		
		System.out.println("Enter obtained marks in Biology: ");
		int bio = s.nextInt();
		
		System.out.println("Enter obtained marks in Chemistry: ");
		int chem = s.nextInt();
		
		System.out.println("Enter obtained marks in Physics: ");
		int phy = s.nextInt();
		
		int total = eng+hin+maths+bio+chem+phy;
		float percentage = (total/600f)*100;
		
		char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
		
		System.out.println("Total Marks: " +total);
		System.out.println("Percentage: "+ percentage+"%");
		System.out.println("Grade: " +grade);
	}

}
