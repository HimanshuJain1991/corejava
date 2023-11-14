
public class Note_Count_Example_Home {

	public static void main(String[] args) {
		int count=0;
		int money=2519;
		int note[]= {500,200,100,50,20,10,5,2,1};
		for(int i=0;i<note.length;i++) {
			count=money/note[i];
			if(count>0) {
				System.out.println(note[i]+"= "+count);
			}
			money=money%note[i];
			
		}

	}

}
