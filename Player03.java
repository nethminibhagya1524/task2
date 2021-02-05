public class Player03 implements Strategy{
	@Override
	public void autoplay() {
		Aardvark aardvark = new Aardvark(3);
		aardvark.playerName = "Player-03";
		aardvark.play();
	}
}
