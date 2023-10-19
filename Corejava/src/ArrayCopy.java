

public class ArrayCopy {

	public static void main(String[] args) {
		//char c[]=new char[50];
		char c[]= {'A','B','C'};
		//String name1=c.getClass().getName();
//		int y=c.length;
//		System.out.println(y);
		for(int i=0;i<c.length;i++) {
			
			
			System.out.println(c[i]);
		}
		
		char[] c1= {'A','B','C','D','E','F','G'};
		char[] c2=new char[8];
		System.arraycopy(c1, 2, c2, 0, 4);
		System.out.println(c2);
		for (char d : c1) {
			System.out.println(d);
			
		}                     //rows,coloum
		int[][] tables=new int[10][10];
		
		for(int row=0;row<tables.length;row++) {
			for(int col=0;col<tables.length;col++) {
				tables[row][col]=(row+1)*(col+1);
				System.out.print(tables[row][col]+"\t");
			}
			System.out.println(" ");
		}

	}

}
