package lab06.exercise02;

public class AgeException extends Exception {
	private float age;
	public AgeException(float age){
		this.age=age;
	}
		

	public String toString() {
		return age+" is an invalid age"; 
	}
}