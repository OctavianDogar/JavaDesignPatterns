package visitor;

public abstract class AtvPart {

	protected double cost;
	public abstract void accept(AtvPartVisitor visitor);
}
