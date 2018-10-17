/*
	Tomisin Odetoyinbo
	Assignment a8 - Lee Student Mini Database
	October 16th, 2018
*/

// This class is meant to manage the data structure of all of the fields for the Lee University students.

class People {
	private String first_name;
	private String last_name;
	private String classification;
	private String email;
	private String phone;
	private String major;
	private String reshall;
	
	
	
	
	// overriding constructor 
	People(String first_name, String last_name, String classification, String email, String phone, String major, String reshall) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.classification = classification;
		this.email = email;
		this.phone = phone;
		this.major = major;
		this.reshall = reshall;
	}
	

	// this lists all of the fields that will be printed out for each student.
	public void printInfo() {
		System.out.println(first_name + " "  + last_name
	+ "\n" + classification
	+ "\n" + email
	+ "\n" + phone
	+ "\n" + major
	+ "\n" + reshall);
	}
}

	class LeeStudents{
		public static void main(String argv[]){
			People person1 = new People("Annie", "Smith", "Freshman", "asmith00@leeu.edu", "423-456-7890", "Information Systems", "Keeble");
			People person2 = new People("James", "Johnson", "Senior", "jjohns21@leeu.edu", "770-456-7890", "Chemisrty", "Medlin");
			People person3 = new People("Courtney", "Zawadski", "Junior", "czawad01@leeu.edu", "678-456-7890", "Elementary Education", "Sharp-Davis");
			People person4 = new People("Nick", "White", "Senior", "nwhite02@leeu.edu", "404-456-7890", "Business Management", "B.O.B.");
			People person5 = new People("Lucas", "Bailey", "Sophomore", "lbailey00@leeu.edu", "706-456-7890", "Graphic Design", "Brinsfield");
			People person6 = new People("Elizabeth", "Thompson", "Sophomore", "ethomp41@leeu.edu", "401-456-7890", "Studio Art", "Atkins-Ellis");
			People person7 = new People("Carlos", "Rich", "Senior", "crich000@leeu.edu", "432-456-7890", "Communications", "Medlin");
			People person8 = new People("Madison", "Burgess", "Freshman", "mburge02@leeu.edu", "678-456-7890", "English", "Nora Chambers");
			People person9 = new People("Noah", "Alpine", "Junior", "nalpin20@leeu.edu", "404-456-7890", "Accounting", "BL Hicks");
			People person10 = new People("Hailey", "Davis", "Senior", "hdavis33@leeu.edu", "423-456-7890", "Political Science", "New Hughes");
			
			person1.printInfo();
				System.out.println();
			person2.printInfo();
				System.out.println();
			person3.printInfo();
				System.out.println();
			person4.printInfo();
				System.out.println();
			person5.printInfo();
				System.out.println();
			person6.printInfo();
				System.out.println();
			person7.printInfo();
				System.out.println();
			person8.printInfo();
				System.out.println();
			person9.printInfo();
				System.out.println();
			person10.printInfo();
				System.out.println();
		}
	}
