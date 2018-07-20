package visitor;

public class Fender extends AtvPart {

	public Fender() {
		this.cost=10;
	}

	@Override
	public void accept(AtvPartVisitor visitor) {
		visitor.visit(this);
	}
}
