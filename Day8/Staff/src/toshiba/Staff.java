package toshiba;

public class Staff {
	private int id;
	private String name;
	private int age;
	private String sex;
	private String email;
	
	public Staff(int id, String name, int age, String sex, String email) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.email = email;
	}
	
	public Staff(int id) {
		this.id = id;
	}

	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
