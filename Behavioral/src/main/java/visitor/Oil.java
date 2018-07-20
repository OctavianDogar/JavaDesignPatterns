package visitor;

public class Oil extends AtvPart {

	public Oil() {
		this.cost = 20;
	}

	@Override
	public void accept(AtvPartVisitor visitor) {
		visitor.visit(this);
	}
}
