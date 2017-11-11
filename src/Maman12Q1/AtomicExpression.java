package Maman12Q1;

public class AtomicExpression extends Expression {

	public AtomicExpression(int number) {
		this.setOperand(number);

	}

	@Override
	public String toString() {
		return Integer.toString(this.getOperand());

	}

	@Override
	public double calculate() {
		// TODO Auto-generated method stub
		return this.getOperand();
	}

}
