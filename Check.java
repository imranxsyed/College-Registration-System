package project;

public class Check {

	public static void main(String[] args) {
	/*Student imran= new Student("Imran", "Syed",157005366,2018 );
	Student haneef = new Student("Haneef", "Syed", 157005367,2020);
		System.out.println(imran.getSchedule()); */
		Course coding = new Course(666,765,"Coding", 'M',5,2);
		Course computer = new Course(666,11,"computer",'M', 4,4);
		Course checking = new Course(666,123,"checking",'T', 4,3);
		Course science = new Course(45,173,"science",'H', 6,3);
		Course Theatre = new Course(11,205,"plays",'W', 1,3);
		Course english = new Course(983,525,"english",'F', 6,4);
		
		Student imran= new Student("imran","Syed",157005366, 2018);
		Student haneef = new Student("haneef","Syed",158997788, 2016);
		Student Yash = new Student("yash","patel", 111111111, 2018);
		boolean A = WebReg.addCourse(imran, coding);
	boolean a=	WebReg.addCourse(imran, computer);
	boolean b=WebReg.addCourse(imran, checking);
	boolean c=WebReg.addCourse(imran, science);
	boolean d=WebReg.addCourse(imran, Theatre);
	boolean e=WebReg.addCourse(imran, english);
	
	boolean g=WebReg.addCourse(haneef, checking);
		boolean h=WebReg.addCourse(haneef, science);
		boolean I=WebReg.addCourse(haneef, Theatre);
		boolean G=WebReg.addCourse(haneef, english); 
		boolean k=WebReg.addCourse(Yash, computer);
		boolean l=WebReg.addCourse(Yash, checking);
		//boolean m=WebReg.addCourse(Yash, science);
		//boolean n=WebReg.addCourse(Yash, Theatre);
		//boolean o=WebReg.addCourse(Yash, english);
		boolean P=WebReg.addCourse(haneef, coding);
		boolean f=WebReg.addCourse(haneef, computer);
		
		//WebReg.dropCourse(haneef, english);//
	//	System.out.println(Yash.getSchedule());//
		/*Student[] s = english.getRoster();
		for (int i=0; i<s.length; i++){
			System.out.println(s[i]);
		}*/
/*Course[] print=	WebReg.commonCourses(haneef, imran);
if (print!=null){
	for(int p =0; p<print.length; p++){
		System.out.println(print[p]);
	} 
}else {
	System.out.println("error");
} */
		WebReg.sortByNumber(haneef.getSchedule());
		Course[] sortedSchedule = haneef.getSchedule();
		for (int i=0; i<sortedSchedule.length; i++){
			System.out.println(sortedSchedule[i]);
		}
				
		
		
		
		
	

	}

}
