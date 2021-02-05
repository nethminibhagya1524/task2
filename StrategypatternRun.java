public class StrategypatternRun {
	public static void main(String args[]) {
		
		ContextStrategy contextstrategy = new ContextStrategy(new Player01());
		contextstrategy.executeStrategy();
		
		ContextStrategy contextstrategy = new ContextStrategy(new Player02());
		contextstrategy.executeStrategy();
		
		ContextStrategy contextstrategy = new ContextStrategy(new Player03());
		contextstrategy.executeStrategy();
	}

}
