package learn_Aotmation_Online;

import java.util.Iterator;
import java.util.Scanner;

public class WriteTable {

	public static void main(String[] args) {
		
		int a,b;
		Scanner in = new Scanner(System.in);
		
		System.out.println("writting table ");
		a=in.nextInt();
		System.out.println("table limit ");
		b=in.nextInt();
	
		for(int i=1;i < b;i++)
		{
			System.out.println(i+"*"+a+"="+(i*a));
		}
		
	}

}
