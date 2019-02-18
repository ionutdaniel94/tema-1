import java.util.Scanner;

public abstract class Parinte {
	static String name= new String();
	int varsta;
	
	public static void disp(String args[]) {
		
		Scanner input = new Scanner(System.in);
		Copil tenthObject = new Copil();
		
		System.out.println("Spune-ti numele: ");
		String name = input.nextLine();
		

		tenthObject.simpleMessage(name);
}
	
	public static void main(String args[]) {
		
		Scanner input1 = new Scanner(System.in);
		Copil tenthObject1 = new Copil();
		
		System.out.println("Spune-ti numele: ");
		String name = input1.nextLine();
		
		Scanner input = new Scanner(System.in);
		Copil tenthObject = new Copil();
		System.out.println("Introdu varsta: ");
		String varsta = input.nextLine();
		
		tenthObject.simpleMessage(name);
		
		System.out.println("Te cheama: " + name+" si ai "+varsta+" ani");
	}
	
}