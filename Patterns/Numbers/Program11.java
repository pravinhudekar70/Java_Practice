/*
5
9  4
12 8  3
14 11 7  2
15 13 10 6  1
*/

class Pattern11 {
	public static void main(String [] args){
		int n = 5;
		int count = n;
		for(int i = 1; i<=n;i++){
			int c= count;
			for(int j=1;j<=i;j++){
				System.out.print(c+"\t");
				c -=n-i+1+j;
			}
			System.out.println();
			count+=n-i;
		}
	}
}
