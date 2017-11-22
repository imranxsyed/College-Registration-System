package project;

public class Course {
	private int department;
	private int courseNum;
	private String name;
	private char day;
	private int timeSlot;
	private int credits;
	private Student[] students;
	private Period thisP;
	private String period;

	public Course(int department, int courseNum, String name, char day, int timeSlot, int credits) {
		if (department >= 0 && department <= 999) {
			this.department = department;
		}
		if (credits >= 1 && credits <= 4) {
			this.credits = credits;
		}
		if (courseNum >= 0 && courseNum <= 999) {
			this.courseNum = courseNum;
		}
		this.name = name;
		thisP = new Period(day, timeSlot);
		period = thisP.toString();
		students = new Student[20];

	}

	public int getDepartment() {
		return department;
	}

	public int getCourseNumber() {
		return courseNum;
	}

	public String getName() {
		return name;
	}

	public Period getPeriod() {
		return thisP;
	}

	public int getCredits() {
		return credits;
	}

	public Student[] getRoster() {
		return students;
	}

	public String toString() {
		return Integer.toString(department) + ":" + Integer.toString(courseNum) + " [" + name + "] " + thisP
				+ " credits:" + Integer.toString(credits);
	}

	public boolean equals(Course other) {
		if (department == other.getDepartment() && courseNum == other.getCourseNumber()) {
			return true;
		} else {
			return false;
		}
	}

}
