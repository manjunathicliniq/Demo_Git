package learn_Aotmation_Online;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Reverse_String {

	String Myname = "MANJUNATHAN";

	// Inpit Manjunathan
	// output nahtnaujnaM

	public void StringBuffer_Reverse() {

		StringBuffer reverse = new StringBuffer();
		reverse.append(Myname);
		System.out.println("My name reverse order in string Buffer use :" + reverse.reverse());

	}

	public void StringBuilder_Reverse() {

		StringBuilder Reverse = new StringBuilder();
		Reverse.append(Myname);
		System.out.println("My name reverse order in string Builder use :" + Reverse.reverse());
	}

	public void LogicToreverse() {

		char[] reversefor = Myname.toCharArray();

		String rev = "";
		for (int i = reversefor.length - 1; i >= 0; i--)

		{
			rev = rev + reversefor[i];
		}
		System.out.println("For loop used reverse a string  :" + rev);

	}

	public void Collection_Rev() {

		char[] collectionRev = Myname.toCharArray();

		List<Character> rever = new ArrayList<Character>();

		for (Character character : rever) {
			rever.add(character);

		}

		Collections.reverse(rever);
		ListIterator iterator = rever.listIterator();

		while (iterator.hasNext()) {

			System.out.println("collection Used reverse string   :" + iterator.next());
		}
	}

	public static void main(String[] args) {
		
		Reverse_String reve = new Reverse_String();
		reve.Collection_Rev();
	}
	
	
}
