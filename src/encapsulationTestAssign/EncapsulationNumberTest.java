package encapsulationTestAssign;

import numberTestAssign.Number;

public class EncapsulationNumberTest {

	public static void main(String[] args) {
		Number n = new Number();
		n.setX(10);
		n.setY(50);
		n.setZ(90);
		System.out.println(n.getX() +" " + n.getY()+ " "+ n.getZ());
		

	}

}
