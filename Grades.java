package project;

import com.examples.IO;

public class Grades {

	public static void main(String[] args) {
		int average = 0;
		int courses = 0;
		int numberOfGrades = 0;
		System.out.println("Enter the number of Courses");
		courses = IO.readInt();

		if (courses <= 0) {
			System.out.println("The number must be Positive");
			return;

		}

		int grades = 0;

		do {
			System.out.println("Enter grade");
			grades = IO.readInt();
			average = average + grades;
			numberOfGrades++;

		} while (numberOfGrades < courses);

		System.out.println((double) average / courses);
		if (((double) average / courses) >= 90) {
			System.out.println("Your Letter Grade: A ");
		}
		if ((double) average / courses >= 80 && ((double) average / courses) < 90) {
			System.out.println("Your Letter Grade: B ");
		}
		if (((double) average / courses) >= 70 && ((double) average / courses) < 80) {
			System.out.println("Your Letter Grade: C");
		}
		if (((double) average / courses >= 66) && ((double) average / courses) < 70) {
			System.out.println("Your Letter Grade : C-" + "\n" + "You do not qualify for this course");
		}
	}

}
