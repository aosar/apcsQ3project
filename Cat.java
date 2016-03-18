
public class Cat extends Mammal{
	private String hairLength;
	public Cat(){
		
	}
		String name, ownerName, color, ownerEmail;
	int monthS, dayS, yearS, monthE, dayE, yearE;
	int weight;
	public void printInfo(){
		System.out.println(
							 "  Owner name: "+ getOwnerName()
							+"  Owner email: "+getOwnerEmail()
							+"  Pet name: " + getName()
							+"  Pet color: " + getColor()
							+"  Pet gender: "+getGender());
	}
	
	public void setBoardStart(int month, int day, int year){
		this.monthS = month;
		this.dayS = day;
		this.yearS = year;
	}
	public void setBoardEnd(int month, int day, int year){
		this.monthE = month;
		this.dayE = day;
		this.yearE = year;
	}
	public boolean boarding(int month, int day, int year) throws IllegalDateException{
		boolean canBoard = false;
		try{
			//LocalDate.of(year,month,day);
			if(month >= monthS && day >= dayS && year >= yearS && month <= monthE && day <= dayE && year <= yearE)
				canBoard = true;
			else throw new IllegalDateException("Date not in range of boarding dates");
			if(monthS<1 || monthS>12 || dayS<1 || dayS>31 || yearS<2000 || yearS>2016
					||monthE<1 || monthE>12 || dayE<1 || dayE>31 || yearE<2000 || yearE>2016){
				throw new IllegalDateException("Out of Bounds");
			}
			else canBoard=true;
		}
		catch(IllegalDateException e){
			e.printStackTrace();
			System.out.println("Illegal date exception: out of bounds");
		}
		return canBoard;
	}
	
	public String foodType(char c){
		String rStr = "";
		if(c == 'c' || c == 'h' || c == 'o'){
			switch(c){
				case 'c':
					rStr = "carnivore";
				case 'o':
					rStr = "omnivore";
				case 'h':
					rStr = "herbivore";
			}
		}
		else
			rStr = "no food type given";
		return rStr;
	}
	
	public int getWeight(){
		return weight;
	}
	public void setWeight(int weight){
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getOwnerEmail() {
		return ownerEmail;
	}
	public void setOwnerEmail(String ownerEmail) {
		try{
			InternetAddress this.ownerEmail = new InternetAddress (ownerEmail);
			ownerEmail.validate();
			//finish dis shit
			
		}
		
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public boolean hasPaws(boolean paw){
		if(paw)
			return true;
		else
			return false;
	}
	
	

}
