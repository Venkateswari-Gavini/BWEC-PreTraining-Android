


class Person
{
	String name;
	String address;

	public Person(String name, String address){
		this.name=name;
		this.address=address;
	}
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public String toString(){
		return "Person [name = " +name+ ", address = "+address+"]";
	}
}


class Student extends Person
{
	private String program;
	private int year;
	private double fee;

	public Student(String name, String address, String program, int year, double fee){
		super(name,address);
		this.program=program;
		this.year=year;
		this.fee=fee;
	}
	public String getProgram(){
		return program;
	}
	public void setProgram(String program){
		this.program=program;
	}
	public int getYear(){
		return year;
	}
	public void setYear(int year){
		this.year=year;
	}
	public double getFee(){
		return fee;
	}
	public void setFee(double fee){
		this.fee=fee;
	}
	public String toString(){
		return "\n\n Student[Person[name = " +name+ ", address = " +address+ "], program = " +program+ ", year = " +year+ ", fee = " +fee+ "]";
	}
}


class Staff extends Person
{
	private String school;
	private double pay;

	public Staff(String name, String address, String school, double pay){
		super(name,address);
		this.school=school;
		this.pay=pay;
	}
	public String getSchool(){
		return school;
	}
	public void setSchool(String school){
		this.school=school;
	}
	public double getPay(){
		return pay;
	}
	public void setPay(double pay){
		this.pay=pay;
	}
	public String toString(){
		return "\n\n Staff[Person[name = " +name+ ", address = " +address+ "], School = " +school+ ", Pay = " +pay+ "]";

	}
}

	
class MainPerson2
{
	public static void main(String args[]){
		Person p2 = new Person("Venkateswari","Bapatla");
		System.out.println(p2);

		p2.setAddress("Railpet");
		System.out.println("Name :" +p2.getName()+" Address :  " +p2.getAddress());
		
		Student s2 = new Student("Laxmi","Guntur","CSE",2016,15000);
		System.out.println(s2);

		s2.setProgram("ECE");
		s2.setYear(2015);
		s2.setFee(20000);
		System.out.println("Program :" +s2.getProgram()+"Year : " +s2.getYear()+ "Fee : "+s2.getFee());

		Staff s4 = new Staff("Trilok","Vijayawada","KV School",50000);
		System.out.println(s4);

		s4.setSchool("Public School");
		s4.setPay(60000);
		System.out.println("School : "+s4.getSchool()+ "Pay : " +s4.getPay());
	}
}
