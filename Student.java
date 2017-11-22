package project;

public class Student {
	private String firstName;
	private String lastName;
	private int id;
	private int gradYear;
	private Course[] courses;

	public Student(String firstName, String lastName, int id, int gradYear) {
		if (id >= 100000000 && id <= 999999999) {
			this.id = id;
		}
		if (gradYear >= 1900 && gradYear <= 2050) {
			this.gradYear = gradYear;
		}
		this.firstName = firstName;
		this.lastName = lastName;
		courses = new Course[6];
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getId() {
		return id;
	}

	public int getGradYear() {
		return gradYear;
	}

	public Course[] getSchedule() {
		return courses;
	}

	public String toString() {
		return Integer.toString(id) + ":" + " " + lastName + ", " + firstName + " - " + gradYear;
	}

	public boolean equals(Student other) {
		if (id == other.getId()) {
			return true;
		} else {
			return false;
		}

	}

}
