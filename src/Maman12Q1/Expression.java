package Maman12Q1;

public abstract class Expression {

	private int operand;

	public int getOperand() {
		return operand;
	}

	public void setOperand(int operand) {
		this.operand = operand;
	}

	public abstract double calculate();

	@Override
	public boolean equals(Object obj) {
		{
			// if the object send is type of Expression and the sum of both of
			// them is equal
			if ((obj instanceof Expression) && (this.calculate() == ((Expression) obj).calculate()))
				return true;
			else
				return false;

		}
	}

}
