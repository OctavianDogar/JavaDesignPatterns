package visitor;

public class Wheel extends AtvPart {

	public Wheel() {
		this.cost = 30;
	}

	@Override
	public void accept(AtvPartVisitor visitor) {
		visitor.visit(this);
	}
}
