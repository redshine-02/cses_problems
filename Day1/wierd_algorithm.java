package Day1;

import java.util.*;

public class wierd_algorithm
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.print(n+" ");
		while(n!=1  && n!=0){
		    if(n%2==0){
		        n=n/2;
		    }
		    else{
		        n=n*3+1;
		    }
		    System.out.print(n+" ");
		}

	}
}