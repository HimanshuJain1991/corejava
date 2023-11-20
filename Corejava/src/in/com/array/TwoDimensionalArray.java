package in.com.array;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int [][]table=new int[5][5];
//		table[0][0]=2;
//		table[1][0]=4;
//		table[0][1]=6
//		table[1][1]=8;
		for(int row=0;row<table.length;row++) {
			for(int col=0;col<table.length;col++) {
				table[row][col]=(row+1)*(col+1);
				System.out.print((table[row][col])+"\t");
			}
			System.out.println();
		}
	

	}

}
