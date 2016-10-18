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
package uran.err;
import java.io.*;
public final class DuplicatedDeclaration extends AbstractException{

	public DuplicatedDeclaration(){
		super();
		this.code=0x11;
	}

	public DuplicatedDeclaration(String msg){
		super (msg);
	}
	
}
