package project;

public class WebReg {

	public static Course lookupCourseByName(Course[] catalog, String courseName) {
		int j = 0;
		int count = 0;
		for (int i = 0; i < catalog.length; i++) {
			if (catalog[i].getName().equalsIgnoreCase(courseName)) {
				j = i;
				count++;
				break;
			}
		}
		if (count == 0) {
			return null;
		} else {
			return catalog[j];
		}
	}

	public static Course[] lookupCoursesByDept(Course[] catalog, int department) {
		int count = 0;
		int n = 0;
		int[] dpt = new int[catalog.length];
		for (int i = 0; i < catalog.length; i++) {
			if (catalog[i].getDepartment() == department) {
				count++;
				dpt[i] = i;
			} else {
				dpt[i] = -1;
			}
		}
		if (count != 0) {
			Course[] newList = new Course[count];
			for (int j = 0; j < newList.length; j++) {
				for (int k = n; k < dpt.length; k++) {
					if (dpt[k] != -1) {
						newList[j] = catalog[dpt[k]];
						n++;
						break;
					} else {
						n++;

					}
				}
			}
			return newList;
		} else {
			return null;
		}

	}

	public static int countCredits(Student s) {
		int credits = 0;
		Course[] courses = s.getSchedule();
		for (int i = 0; i < courses.length; i++) {
			if (courses[i] != null) {
				credits += courses[i].getCredits();
			}
		}
		return credits;
	}

	public static boolean addCourse(Student s, Course c) {

		int same = 0;
		int space = 0;
		int index = 0;
		Course[] courses = s.getSchedule();//schedule of the student//
		Student[] students = c.getRoster();// how many students and the info of the students enrolled in c course//
		for (int i = 0; i < courses.length; i++) {
			if (courses[i] != null && courses[i].getPeriod().compareTo(c.getPeriod()) == 0) {
				same++;
				break;
			} else if(courses[i]== null) {
				space++;
				index = i;
				break;
			}
		}
		if (same == 0 && space != 0) {
			courses[index] = c;
			for (int j = 0; j < students.length; j++) {
				if (students[j] == null) {
					students[j] = s;
					break;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	public static boolean dropCourse(Student s, Course c) {
		Course[] courses = s.getSchedule();
		Student[] students = c.getRoster();
		int count = 0;
		for (int i = 0; i < courses.length && courses[i] != null; i++) {
			if (courses[i].getDepartment() == c.getDepartment()
					&& courses[i].getCourseNumber() == c.getCourseNumber()) {
				courses[i] = null;
				count++;
				break;
			}
		}
		if (count != 0) {
			for (int k = 0; k < students.length; k++) {
				if (students[k].getId() == (s.getId())) {
					students[k] = null;
					break;
				}
			}
			for (int roster = 0; roster < students.length - 1; roster++) {
				if (students[roster] == null) {
					students[roster] = students[roster + 1];
					students[roster + 1] = null;
				}
			}
			for (int j = 0; j < courses.length - 1; j++) {
				if (courses[j] == null) {
					courses[j] = courses[j + 1];
					courses[j + 1] = null;
				}

				/*
				 * Course[] newCourse = new Course[courses.length]; int b=0; int
				 * n = 0; for (int j = 0; j < newCourse.length; j++) { for (int
				 * k = n; k < courses.length; k++) { if (courses[k] != null) {
				 * newCourse[j] = courses[k]; n++; b++; break; }else { n++; if
				 * (n== courses.length-1){break;}
				 */

			}
			return true;
		} else {
			return false;
		}

	}	public static Course[] commonCourses(Student one, Student two){
		Course[] first = one.getSchedule();
		Course[] second = two.getSchedule();
		int count=0;
		int[] index = new int[6];
		for(int i=0; i<first.length; i++){
			if (first[i]== null || second[0]==null){
				index[i]=-1;
				break;
			}
			for (int j=0; j<second.length; j++){
				if (second[j]!= null && first[i].equals(second[j])){
					count++;
					index[i]= i;
					break;
				}else if (second[j]==null){
					index[i]= -1;
					break;
				}else{
					index[i]= -1;
				}
			}
		}if (count != 0){
			int f=0;
			Course[] common = new Course[count];
			for (int t=0 ; t<common.length; t++){
				for ( f =f; f<index.length; f++){
					if (index[f]!= -1){
						common[t]= first[index[f]];
						f++;
						break;
					}
					
				}
			}return common;
			
		}else{
			return null;
		}
	}public static void sortByNumber(Course[] catalog){
		for(int i=0; i<catalog.length-1; i++){
			if (catalog[i]== null){
				break;
			}else{
			for(int j=i+1; j<catalog.length; j++){
		if ( catalog[j]!= null&&catalog[i].getDepartment()> catalog[j].getDepartment()&& catalog[i].getDepartment()!= catalog[j].getDepartment()){
			Course temp = catalog[i];
			catalog[i]=catalog[j];
			catalog[j]=temp;
		}else if(catalog[j]!= null&& catalog[i].getDepartment()== catalog[j].getDepartment()){
			if (catalog[i].getCourseNumber()> catalog[j].getCourseNumber()){
				Course Temp= catalog[i];
				catalog[i]= catalog[j];
				catalog[j]= Temp;
			}
				
			
		}
			}
			}
		}
		
	}public static void sortByTime(Course[] catalog){
		for (int i=0 ; i<catalog.length-1; i++){
			if (catalog[i]== null){
				break;
			}else{
			for (int j=i+1; j<catalog.length; j++ ){
				if (catalog[j]!= null&& catalog[i].getPeriod().compareTo(catalog[j].getPeriod())== 1 ){
					Course temp = catalog[i];
					catalog[i]= catalog[j];
					catalog[j]= temp;
				}else if(catalog[j]==null){
					break;
				}
			}
			}
		}
	}

}
