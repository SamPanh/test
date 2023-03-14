package main;

public class Ham_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,13,3};
		int s=0;
		
		for (int i:array) {
			if (i==13) {
				continue;
			}
			s+=i;
		}
		System.out.println("total:"+s);
	}

}
