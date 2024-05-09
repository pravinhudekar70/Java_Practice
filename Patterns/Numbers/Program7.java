/*
5
4  9
3  8  12
2  7  11  14
1  6  10  13  15
*/

class Pattern7 {
	public static void main(String [] args){
		int n = 5;
		int count = n;
		for(int i=1;i<=n;i++){
			int c = count;
			for(int j = 1; j<=i; j++){
				System.out.print(c+"\t");
				c+=n-j+1;
			}
			System.out.println();
			count--;
		}
	}
}
			