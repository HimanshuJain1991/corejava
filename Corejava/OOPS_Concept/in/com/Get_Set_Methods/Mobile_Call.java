package in.com.Get_Set_Methods;

public class Mobile_Call {

	public static void main(String[] args) {
		Mobile_Details md= new Mobile_Details();
		md.setMobile_Brand("VIVO");
		md.setMobile_Model("v20");
		md.setMobile_Imi(1549875622);
		System.out.println(md.getMobile_Brand());
		System.out.println(md.getMobile_Model());
		System.out.println(md.getMobile_Imi());

	}

}
