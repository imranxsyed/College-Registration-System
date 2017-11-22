package project;

public class Mike{

	public static Course lookupCourseByName(Course[] catalog, String courseName){
		
		for(int i=0; i< catalog.length; i++){
			if( catalog[i].getName().equals(courseName)){
				return catalog[i];
			} 
				
			
		}return null;
	}
	public static Course[] lookupCoursesByDept(Course[] catalog, int department){
		int found = 0;
		int c=0;
		
		Course[] courses = new Course[100];
	
		for(int i =0; i< catalog.length; i++){
			if( catalog[i].getDepartment() == department ){
				found++;
				courses[i] =catalog[i];
			}
			else{
				courses[i]=  null;
			}
		}if (found >0){
		Course[] n = new Course[found];
		for (int i=0 ;i<found; i++){
			for (int j=0; j< courses.length ; j++){
				if (courses[j]!= null){
				n[j]= courses[j];
				}
			}
		}return n;
		}return null;
		}
		 
	
	public static int countCredits(Student s){
		int credits = 0;
		Course[] S = s.getSchedule();
		for(int i = 0; i< s.getSchedule().length; i++){
			if(S[i] != null){
				credits += s.getSchedule()[i].getCredits();
			}else{
				break;
			}
			
		}
		return credits;
	}
	public static boolean addCourse(Student s, Course c){
		int counter = 0;
		Student[] roster = c.getRoster();
		for(int i = 0; i < s.getSchedule().length; i++){
			if( s.getSchedule()[i] == null && s.getSchedule()[i].getPeriod().compareTo(c.getPeriod())!=0){
				s.getSchedule()[i] = c;
				for(int j = 0; j < c.getRoster().length; j++){
					if( c.getRoster()[j] == null ){
						c.getRoster()[j] = s;
						counter++;
						break;
					}
				}
			}
		}
		if(counter == 0){
			return false;
		}
		else{
			return true;
		}
	}
	
	public static boolean dropCourse(Student s, Course c){
		int counter = 0;
		for(int i=0; i<s.getSchedule().length; i++){
			if( s.getSchedule()[i] == c){
				s.getSchedule()[i] = null;
			}
		}
			for( int j=0; j<c.getRoster().length; j++){
				if( c.getRoster()[j] == s){
					c.getRoster()[j] = null;
					counter++;
				}
			}
			
					if (counter>0){
					for( int k = 0; k< c.getRoster().length; k++){
						if (c.getRoster()[k]==null){
					
						c.getRoster()[k] = c.getRoster()[k+1];
						}
					
				
			}return true;
					}
					return false;
	}
		
		
	
	}


					
