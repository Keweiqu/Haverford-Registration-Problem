import java.util.List;


public class Class {
	private static int numClasses = 0;
	private int primeKey;
	private List<Student> enrolledStudents;
	private int timeSlot;
	private int room;
	private int instructor;
	
	//constructor
	public Class(int key, int instructor){
		primeKey = key;
		this.instructor = instructor;
		numClasses++;
	}
	
	//accessors
	public int getKey(){
		return primeKey;
	}
	
	public int getInstructor(){
		return instructor;
	}
	
	public int getNumClasses(){
		return numClasses;
	}
	
	public List<Student> getStudents(){
		return enrolledStudents;
	}
	
	public int getRoom(){
		return room;
	}
	
	public int getSlot(){
		return timeSlot;
	}
	
	public int getSize(){
		return enrolledStudents.size();
	}
	//methods
	public void removeStudent(Student s){
		enrolledStudents.remove(s);
		//todo s.removeClass(this);
	}
	
	public void assignRoom(int r){
		this.room = r;
	}
	
	public void assignSlot(int t){
		timeSlot = t;
	}
	
	public int getCollisions(Class otherClass){
		int sum = 0;
		for(Student s: otherClass.getStudents()){
			if(this.enrolledStudents.contains(s)){
				sum++;
			}
		}
		return sum;
	}
}
