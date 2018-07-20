package visitor;

public class AtvPartsDisplayVisitor implements AtvPartVisitor {


	@Override
	public void visit(AtvPart part) {
		System.out.printf("We have: %s%n",part.getClass().getSimpleName());
	}
}
