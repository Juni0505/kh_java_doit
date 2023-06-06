package abstractex;

public abstract class DeskTop extends Computer{

	@Override
	public void display() {
		System.out.println("DeskTop dsiplay();");
	}

	@Override
	public void typing() {
		System.out.println("DeskTop typing();");
	}
	

}
