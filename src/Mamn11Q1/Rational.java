package Mamn11Q1;

public class Rational {

	private int P;
	private double Q;

	public Rational(int p, double q) {
		if (q > 0) {
			this.P = p;
			this.Q = q;
		} else {
			this.P = 0;
			this.Q = 1;
		}
	}

	@Override
	public String toString() {
		return P + "/" + (int) Q;
	}

	public int getNumerator() {
		return P;
	}

	public double getDenominator() {
		return Q;
	}

	public void setNumerator(int p) {
		this.P = p;
	}

	public void setDenominator(double q) {
		this.Q = q;
	}

	public Boolean greaterThan(Rational R) {
		if (this.P * R.getDenominator() > this.Q * R.getNumerator()) {
			return true;

		}
		return false;
	}

	public Boolean equals(Rational R) {
		if (this.P * R.getDenominator() == this.Q * R.getNumerator()) {
			return true;

		}
		return false;
	}

	public Rational plus(Rational R) {
		int p = (int) ((double) this.P * R.getDenominator() + this.Q * R.getNumerator());
		double q = ((double) this.P * R.getDenominator());
		Rational ans = new Rational(p, q);
		return ans;

	}

	public Rational minus(Rational R) {

		int p = (int) ((double) this.P * R.getDenominator() - this.Q * R.getNumerator());
		double q = ((double) this.P * R.getDenominator());
		Rational ans = new Rational(p, q);
		return ans;
	}

	public Rational multiply(Rational R) {

		Rational ans = new Rational(this.P * R.P, this.Q * R.Q);
		return ans;
	}

	private int gdc(int p, double q) {
		if (p < 0)
			p = -p;
		if (q == 0)
			return p;
		else
			return gdc((int) q, p % q);

	}

	public Rational reduce(Rational R) {
		int gd = gdc(R.P, R.Q);
		R.setNumerator(R.P / gd);
		R.setDenominator(R.Q / gd);
		return R;

	}

}
