package project;

public class Period {
	private char day;
	private int timeSlot;
	private String period;
	String[] arr = { "MTWHFS" };
	String[] nums = { "123456789" };
	private int Op;
	private int p;

	public Period(char day, int timeSlot) {
		if (day == 'M' || day == 'T' || day == 'W' || day == 'H' || day == 'F' || day == 'S') {
			this.day = day;
			
		}
		if (timeSlot >= 1 && timeSlot <= 9) {
			this.timeSlot = timeSlot;

		}
		period = Character.toString(this.day) + Integer.toString(this.timeSlot);
	}

	public char getDay() {
		return day;
	}

	public int getTimeSlot() {
		return timeSlot;
	}

	public String toString() {
		return period;
	}

	public int compareTo(Period other) {
		if (toString().equals(other.toString())) {
			return 0;
		} else if (getDay() == other.getDay() && getTimeSlot() != other.getTimeSlot()) {
			if (getTimeSlot() > other.getTimeSlot()) {
				p = 1;
			} else {
				p = -1;
			}
		} else if (getDay() != other.getDay()) {
			if (arr[0].indexOf(getDay()) > arr[0].indexOf(other.getDay())) {
				p = 1;
			} else {
				p = -1;
			}
		}
		return p;

	}

}
