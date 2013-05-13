package com.behavioural.interpreter;

public class And extends IExpression {

	private IExpression left, right;
	public And(IExpression left,IExpression right){
		this.left = left;
		this.right = right;
	}

	@Override
	public boolean interpret(Context ctx) {
		return left.interpret(ctx) && right.interpret(ctx);
	}

	@Override
	public boolean equals(Object obj) {
		if (null != obj && obj instanceof And) {
			return left.equals(((And) obj).left)
					&& right.equals(((And) obj).right);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}

	@Override
	public String toString() {
		return "("+left.toString() +" AND " +right.toString();
	}

}
