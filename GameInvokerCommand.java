public class GameInvokerCommand {
	private GameCommands placingDomino;
	
	public GameInvokerCommand(DominoPlacing aardvarkDominoPlacingCommand) {
		this.placingDomino= aardvarkDominoPlacingCommand;
	}
	
	public void placeDomino() {
		placingDomino.playGame();
	}
	
	public void unplaceDomino() {
		placingDomino.revokeGame();
	}
	

}
