//TOKEN RING ALGORITHM


// Implementation of Token Ring Algorithm
import java.io.*;
import java.lang.*;
import java.util.Scanner;

class TokenRing {

	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the num of nodes:");
	int n=sc.nextInt();
	
	int token = 0;
	int ch = 1;
	// print all nodes
	for (int i = 0; i<n; i++)
	System.out.print(" " + i);
	System.out.println(" "+ 0);

	try {
		while (ch == 1) {
		
			System.out.println("Enter sender :");
			int s=sc.nextInt();

			System.out.println("Enter receiver :");
			int r=sc.nextInt();

			System.out.println("Enter Data:");
			sc.nextLine();
			String d=sc.nextLine();

// 			System.out.println("Token passing:");
// 			for (int i=token; i != s; i++)
// 				System.out.print(" "+ i + "->");
			
// 			System.out.println(" " + s);

			System.out.println("Sender " + s + " sending data: " + d);
			
			for (int i=s+1; i != r; i=(i+1)%n)
				System.out.println("data " + d + " forwarded by " + i);
			System.out.println("Receiver " + r + " received data: " + d);
	 		token = s;
		}

	} catch (Exception e) {}

}	
}
