package org.dimigo.basic;

public class Loop {

	public static void main(String[] args) {
		
		int i, j;
		
		for(i=0; i<10; i++){
			
			for(j=0; j<10; j++){
				
				if(i == j){
					System.out.print("*");
				}
				else if(i != j) System.out.print(j+1);
				
			}
			
			System.out.println();
	
		}

}
	
}
