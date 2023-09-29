package in.com.Get_Set_Methods;

public class Increment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int i=0 ,j,m ,h=0;
   
   j=++i + ++i + ++i;
   m= h++ + h++;
   //m=h++ + h++ + h++  + h++ + h++;
   System.out.println(" preincrement i value="+i + " j value="+ j);
   //System.out.println(++i + ++i + ++i + ++i + ++i + ++i);
   //System.out.println(i++ + i++ + i++);
   System.out.println(" post increment h value= "+ h+" m value "+m);
   
	}

}
