import java.util.List;


public class Student {
	private int primeKey;
	private List<Class> choosedClasses;
	private List<Class> enrolledClasses;
	
	public Student(int key){
		primeKey = key;
	}
	
	public List<Class> getChoosedClasses(){
		return choosedClasses;
	}
	
	
	public List<Class> enrolledClasses(){
		return enrolledClasses;
	}
	
	public void removeCourse(Class c){
		enrolledClasses.remove(c);
	}

}
