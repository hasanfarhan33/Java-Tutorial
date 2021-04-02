import java.util.ArrayList;

public class javatutorial {

	public javatutorial() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5; //Integer
		char b = 'i';  //Character
		long c = 400;  
		double d = 4.532; 
		String name = "Farhan"; //Object 
		System.out.println(name.length()); //Shows the length of the string
		System.out.println(name.toUpperCase()); //Turns all the letters to upper case
		System.out.println(name.toLowerCase()); //Turns all the letter to lower case
		String result = addExclamationPoint("hot dogs");
		System.out.println(result); 
		
		Animal dog = new Animal(); 
		String dogsaid = dog.iAmDog();
		System.out.println(dogsaid);
		dog.doStuff();
		
		ArrayList<Integer> AList = new ArrayList<Integer>(); 
		AList.add(1); 
		AList.add(23); 
		System.out.println(AList);
		
	}
	
	
	
	public static String addExclamationPoint(String s) //This is a function
	{
		return s + "!"; 
		
	}

}
