/**
 * 
 */

/**
 * @author KDavara
 *
 */
public class ModelDuck extends Duck {

	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	/* (non-Javadoc)
	 * @see Duck#display()
	 */
	@Override
	public void display() {
		System.out.println("I'm a model duck");
	}

}
