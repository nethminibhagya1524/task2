import javax.swing.*;
import java.awt.*;

public class ConObs1 extends Observer{
	
	public ConObs1(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

}
