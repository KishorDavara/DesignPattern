/**
 * 
 */

/**
 * @author KDavara
 *
 */
public class MuteQuack implements QuackBehavior {

	/* (non-Javadoc)
	 * @see QuackBehavior#quack()
	 */
	@Override
	public void quack() {
	  System.out.println("<< Silence >>");	
	}

}
