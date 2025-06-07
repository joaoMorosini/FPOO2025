package appTest;

import com.utfpr.fpoo.ticTacToe.component.button.Button;
import com.utfpr.fpoo.ticTacToe.gui.MainWindow;

public interface AppButtonMouseListenerTest {
	public static void main(String[] args) {
		
	
		MainWindow window = new MainWindow();
		Button button = new Button(250, 100, 50, 50);
		window.add(button);
		window.addMouseListener(button.mouseListener());
		window.addMouseMotionListener(button.mouseMotionListener());

	}
}