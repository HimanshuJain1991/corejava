
public class MachineTest implements Machine, CarParts {

	public static void main(String[] args) {
		Machine mt= new MachineTest();
		mt.machineType();
		CarParts cp=new MachineTest();
		cp.carAc();

	}

	@Override
	public void machineType() {
		System.out.println("MACHINE TYPE IS JCB..");
		
	}

	@Override
	public void carAc() {
		System.out.println("Company Name of AC");
		
	}

}
