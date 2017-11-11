package Maman12Q1;

public class SubtractionExpression extends CompoundExpression {
	public SubtractionExpression(Expression expression1, Expression expression2) {
		super(expression1, expression2);
	}

	@Override
	public double calculate() {
		return this.getExp1().calculate() - this.getExp2().calculate();
	}

	@Override
	public String toString() {
		return (this.getExp1().calculate()) + " - " + (this.getExp2().calculate());
	}

}
