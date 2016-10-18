/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * +++++++++++++++++++++++++++++++++++Written by: xxxx++++++++++++++++++++++++++++++++
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *	 Author: anonymous
 *  JULY-2015
 *  
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * ++++++++++++++++++++++++++++++Do or do not, there is no try.+++++++++++++++++++++++++
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */


package uran.formula.cnf;
import uran.formula.cnf.visitor.AbstractVisitor;

public final class NotGate extends BooleanCircuit{

	private BooleanCircuit input;

	public NotGate(BooleanCircuit i){
		input=i;
	}
	
	public BooleanCircuit input(){
		return input;
	}

	public boolean isNotGate(){return true;}
	public void accept (AbstractVisitor v){
		v.visit(this);
	}

}
