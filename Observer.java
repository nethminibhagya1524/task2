import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class Observer extends JFrame implements ActionListener {
	static JTextField text;
	static JFrame aardvarkMainGUI = new JFrame("Aardvark Main Menu");
	static JFrame aardvarSelectDifficulty = new JFrame("Aardvark Difficulty Menu");
	static JLabel label;
	static Game model = new Game ();
	static GameView view = new GameView();
	static GameController controller = new GameController(model, view);
	static protected Aardvark aardvark;
	
	protected Subject subject;
	
	public abstract void display();

	

}
