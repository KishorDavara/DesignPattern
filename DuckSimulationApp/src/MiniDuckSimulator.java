/**
 * 
 */

/**
 * @author KDavara
 *
 */
public class MiniDuckSimulator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		// model duck behavior
	   Duck model = new ModelDuck();
	   model.performFly();
	   model.setFlyBehavior(new FlyRocketPowered());
	   model.performFly();
	}

}
