package main;

public class ham_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,9};
		for (int i=0; i < array.length; i++) {
			if (array[i]==4) {
				System.out.println("index:"+i);
				break;
			}
		}
	}

}
