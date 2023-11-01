
public class String_Number_Count {

	public static void main(String[] args) {
		int count=0;
		String name="Himanshu@465656.com";
		for(char ch:name.toCharArray()) {
			if(Character.isDigit(ch)) {
				count++;
			}
			
		}
		System.out.println("count total: "+count);
		
	}

}
