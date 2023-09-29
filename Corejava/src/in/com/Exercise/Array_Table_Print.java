package in.com.Exercise;

public class Array_Table_Print {

	public static void main(String[] args) {
		int table[][]=new int[5][5];
		for(int i=0;i<table.length;i++) {
			for(int j=0;j<table.length;j++) {
				table[i][j]=(i+1)*(j+1);
				System.out.print(table[i][j]+"\t");
			}
			System.out.println();
		}
		

	}

}
