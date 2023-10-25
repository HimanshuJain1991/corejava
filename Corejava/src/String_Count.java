
public class String_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String name="Malyalam";
     
        
         for(int i=0;i<name.length();i++) {
        	 char currentChar=name.charAt(i);
        	 int count=0;
        	 
         for(int j=0;j<name.length();j++) {
        	 if(name.charAt(j)==currentChar) {
        		 count ++;
        		 
        	 }
        	 
         }
         
         System.out.println(""+currentChar+"  "+count+" =times");
	}
         
	}
}
