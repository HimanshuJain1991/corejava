package in.com.batch;

public class String_Operation_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String name="Vijay Dinanath Chouhan";
       System.out.println("String Length is- "+name.length());
       System.out.println("7th char is- "+name.charAt(6));
       System.out.println("Dina index is:" +name.indexOf("Dina"));
       System.out.println("First i Position "+ name.indexOf("i"));
       System.out.println("Last i Position"+ name.lastIndexOf("i"));
       System.out.println("a is replace by b "+ name.replace("a", "b"));
       System.out.println("Lower case "+name.toLowerCase());
       System.out.println("Upper Case" +name.toUpperCase());
       System.out.println("start with Vijay  "+ name.startsWith("Vijay"));
       System.out.println("Ends with han "+ name.endsWith("han"));
       System.out.println("Substring "+name.substring(2));
	}

}
