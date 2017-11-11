package Maman12Q1;

public abstract class CompoundExpression extends Expression {
	private Expression exp1;
	private Expression exp2;

	public CompoundExpression(Expression expression1, Expression expression2) {
		this.exp1 = expression1;
		this.exp2 = expression2;

	}

	public Expression getExp1() {
		return exp1;
	}

	public void setExp1(Expression exp1) {
		this.exp1 = exp1;
	}

	public Expression getExp2() {
		return exp2;
	}

	public void setExp2(Expression exp2) {
		this.exp2 = exp2;
	}

	@Override
	public double calculate() {
		// TODO Auto-generated method stub
		return 0;
	}

}
