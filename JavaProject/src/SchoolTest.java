
public class SchoolTest {
	public static void main(String[] args){
		School s = new School();
		s.schoolName = "Inpyeong Automobile High School"; 
		s.major = "Web Contents , Echo Automobile";
		s.print();
		
		Place r = new Place();
		r.schoolOffice = 1;
		r.adminOffice = 1;
		r.pressRoom = 1;
		r.classRoom = 18;
		r.print2();
		
		Student st = new Student();
		st.students = 536;
		st.autoStudents = 356;
		st.webStudents = 180;
		st.print3();
		
	}
}
