/* Desired output:

1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8 
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

*/


class NumberOutput {
	public static void main(String args[]) {
		System.out.println("I am about to output many numbers in the shape of a triangle.");
		int number = 9;
		
		for(int a = number; a>=0; a--) {
			for (int b = 1; b<=a; b++)
				System.out.print(" " + b);
				System.out.println();
			}
	}
}
