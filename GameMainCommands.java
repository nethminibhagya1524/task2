public class GameMainCommands {

	public static void main(String[] args) {
		Aardvark aardvarkk = new Aardvark();
		
		DominoPlacing aardvarkDominoPlacingCommand = new aardvarkDominoPlacingCommand(aardvarkk);

		GameInvokerCommand aardvarkGameInvoker = new aardvarkGameInvoker(aardvarkDominoPlacingCommand);
		
		aardvarkGameInvoker.placeDomino();
		
		System.out.println("Unplace Domino?");
		String undo = IOLibrary.getString();
		if(undo.equalsIgnoreCase("yes")) {
			aardvarkGameInvoker.unplaceDomino();
		}
	}

}
