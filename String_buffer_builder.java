package learn_Aotmation_Online;

public class String_buffer_builder {
	
	public static void main(String[] args) {
		
		
		StringBuffer buff = new StringBuffer("Manjunathan");
		
		System.out.println(buff.reverse());
		
		System.out.println(buff.replace(0, 3, "Nathan"));
		
		System.out.println(buff.capacity());

		
	}

}
