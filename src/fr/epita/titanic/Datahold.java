package fr.epita.titanic;

public class Datahold {
	private Integer Survived;
	private Integer Pclass;
	private String Name;
	private String Sex;
	private double Age;
	private Integer Siblings;
	private Integer Parents;
	private double Fare;
	
	
	public Integer getSurvived() {
		return Survived;
	}
	public void setSurvived(Integer survived) {
		Survived = survived;
	}
	public Integer getPclass() {
		return Pclass;
	}
	public void setPclass(Integer pclass) {
		Pclass = pclass;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		Sex = sex;
	}
	public double getAge() {
		return Age;
	}
	public void setAge(double age) {
		Age = age;
	}
	public Integer getSiblings() {
		return Siblings;
	}
	public void setSiblings(Integer siblings) {
		Siblings = siblings;
	}
	public Integer getParents() {
		return Parents;
	}
	public void setParents(Integer parents) {
		Parents = parents;
	}
	public double getFare() {
		return Fare;
	}
	public void setFare(double fare) {
		Fare = fare;
	}
	public Datahold() {

	}
}
