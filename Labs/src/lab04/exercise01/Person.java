package lab04.exercise01;

public class Person {
	private String name;
	private float age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Name: " + name + " age: " + age;
	}
}
