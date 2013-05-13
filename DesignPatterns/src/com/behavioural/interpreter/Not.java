package com.behavioural.interpreter;

public class Not extends IExpression {

	private IExpression exp;
	public Not(IExpression exp){
		this.exp = exp;
	}
	@Override
	public boolean interpret(Context ctx) {
		return !exp.interpret(ctx);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Not){
			return exp.equals(((Not)obj).exp);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}

	@Override
	public String toString() {
		return "(Not " + exp.toString() + ")";
	}

}
