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
package uran.formula.type;

public final class Bool extends Type{

	public Bool(){
		this.type=Type.BOOL;
	}	

	@Override
	public String name(){
		return "Bool";
	}
	
	@Override
	public boolean isBool(){return true;}	
	@Override
	public String toString(){return name();}
	
}
