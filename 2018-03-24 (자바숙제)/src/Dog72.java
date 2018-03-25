
public class Dog72 {
	private String name;
	private String breed;
	private int age;

	public Dog72(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Dog72(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getBreed() {
		return breed;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
