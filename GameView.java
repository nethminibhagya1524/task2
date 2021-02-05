public class GameView {
	public void GameMainGUI() {
		Subject subject = new Subject();
		
		new ConObs01(subject);
		new ConObs02(subject);
		new ConObs03(subject);
		
		subject.notifyAllObservers();
	}

}
