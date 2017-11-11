package Maman12Q1;

public class AdditionExpression extends CompoundExpression {

	public AdditionExpression(Expression expression1, Expression expression2) {
		super(expression1, expression2);
	}

	@Override
	public double calculate() {
		return this.getExp1().calculate() + this.getExp2().calculate();
	}

	@Override
	public String toString() {
		return Integer.toString(this.getExp1().getOperand()) + " + " + Integer.toString(this.getExp2().getOperand());
	}

}
