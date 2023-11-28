package in.com.rays.marksheet;

public class TestMarksheet  {

	public static void main(String[] args) throws Exception {
	     //testAdd();
		//testDelete();
		//MarksheetModel.getData();
		alterTableData();

	}
	 public static void alterTableData() throws Exception {
		 MarksheetBean bean5=new MarksheetBean();
		 bean5.setTotal("total");
		 MarksheetModel.alter(bean5);
		
		
	}
	static void testDelete() throws Exception {
	MarksheetBean bean2=new MarksheetBean();
	bean2.setId(888);
	MarksheetModel.deleteData(bean2);
		
	}
	public static void testAdd() throws Exception  {
		MarksheetBean bean=new MarksheetBean();
		bean.setId(888);bean.setName("PM MODI");bean.setRoll_no(1111);
		bean.setPhyscis(88);bean.setChemistry(65);bean.setMaths(99);
		MarksheetModel.insertData(bean);

	
		
		
	}

}
