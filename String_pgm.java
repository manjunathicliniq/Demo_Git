package learn_Aotmation_Online;

public class String_pgm {
	
	public static void main(String[] args) {
		
		
		String name = "MANJUNATHAN";
		
		
		//char place in index
		System.out.println(name.charAt(0));
		
		//add in QA
		System.out.println(name.concat("QA"));

		//equal
		System.out.println(name.compareToIgnoreCase("manjunathan"));

		//upper case
		System.out.println(name.toUpperCase());

		//lowercase
		System.out.println(name.toLowerCase());

		//index position char
		System.out.println(name.indexOf(3));

		//replace char
		System.out.println(name.replace('A', 'N'));

		//check empty or not
		System.out.println(name.isEmpty());

		//
		System.out.println(name.isBlank());

		//length og the name
		System.out.println(name.length());

		//cut the string value
		System.out.println(name.substring(3));
		
		//cut value start to end mention
		System.out.println(name.substring(1, 6));


		//contais value check
		System.out.println(name.contains("A"));
	}

}
