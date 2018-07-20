package visitor;

import java.util.List;

public class AtvPartsShippingVisitor implements AtvPartVisitor {

	 double shippingAmount = 0;

	@Override
	public void visit(AtvPart part) {
		if(part instanceof PartsOrder){
			System.out.println("If they bought more than 3 things we will give them a discount on shipping.");
			List<AtvPart> parts = ((PartsOrder) part).getParts();
			if(parts.size() >= 3) {
				shippingAmount -= 5;
			}
			System.out.printf("Totalcost: %s%n",shippingAmount);

		}else {
			shippingAmount +=part.cost;
		}

	}
}
