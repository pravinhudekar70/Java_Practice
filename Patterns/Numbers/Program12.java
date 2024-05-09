/*
11
7 12
4 8  13
2 5  9  14
1 3  6  10  15
*/


class Pattern12 {
	public static void main(String [] args) {
		int n =5;
		int count = n+n+1;
		for(int i =1; i<=n;i++){
			int c= count ;
			for(int j =1; j<=i;j++){
				System.out.print(c+"\t");
				c +=n-i+1+j;
			}
			System.out.println();
			count -=n-i;
		}
	}
} 