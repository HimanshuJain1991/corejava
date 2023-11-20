package in.com.clone_practice;

public class SahllowCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
	   ShallowClone shallow1=new ShallowClone(222);
	   ShallowClone shallow2=(ShallowClone) shallow1.clone();
	   shallow2.id=555;
	   System.out.println(shallow1.id);
        System.out.println(shallow2.id);
	}

}
