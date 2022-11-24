package learn_Aotmation_Online;


public class Highest_Number {

	public static void main(String[] args) {

		int arr[] = { 0, 1, 2, 3, 9, 5, 6, 7, 8, 4};

		int maxnum=arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > maxnum)

			{
				maxnum = arr[i];
			}
		}
		System.out.println(maxnum);
	}
	
}
