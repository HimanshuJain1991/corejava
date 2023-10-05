package in.com.Batch;

public class Copy_Array {

	public static void main(String[] args) {
		
		
		//System.out.println(args[1]);
//		char[] copyFrom= {'s','u','n','i','l','o','s'};
//		char[] copyTo=new char[4];
//		System.arraycopy(copyFrom, 2, copyTo, 0, 4);
//		System.out.println(copyFrom);
//System.out.println(copyTo);
   int [] i= {1,2,3,4,5,6,7,8};
   int [] table= {5,2,3,4};
   System.arraycopy(i, 0, table, 0, 3); 
   System.out.println(table[0]+"  "+table[1]+" "+table[2]+" "+table[3]);
   }
	
}
