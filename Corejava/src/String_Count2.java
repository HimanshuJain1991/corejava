
public class String_Count2 {

	public static void main(String[] args) {
		String name="MhZhimanshu119@yahoo.com";
         int count=0;
         
         for(char ch='a'&'A';ch<='z'  ;ch++){
        	 for(int i=0;i<name.length();i++) {
        		if(name.charAt(i)==ch) {
        			count++;
        		}
        	 }
        	 
         }
         System.out.println(count);
	}

}
