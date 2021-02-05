public class GameController {
	private Game model;
	private GameView view;
	
	public GameController(Game model, GameView view) {
		this.model = model;
		this.view = view;
	}

	public void setPlayerName(String PlayerName) {
		model.setName(PlayerName);
	}
	
	public String getPlayerName() {
		return model.getName();
	}
	
	public void updateView() {
		view GameMainGUI();
	}
}
