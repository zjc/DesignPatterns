package com.behavioural.interpreter;

public class Or extends IExpression {

	private IExpression left, right;

	public Or(IExpression left, IExpression right) {
		this.left = left;
		this.right = right;

	}

	@Override
	public boolean interpret(Context ctx) {
		return left.interpret(ctx) && right.interpret(ctx);
	}

	@Override
	public boolean equals(Object obj) {
		if (null != obj && obj instanceof Or) {
			return left.equals(((Or) obj).left)
					&& right.equals(((Or) obj).right);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}

	@Override
	public String toString() {
		return "(" + left.toString() + " OR " + right.toString() + ")";
	}

}
