package sudokugui;

import java.awt.event.*;
import javax.swing.*;

public class DigitButton extends JButton implements ActionListener {
	
	private Sudoku board;
	private SudokuFrame frame;
	
	public DigitButton(Sudoku b, SudokuFrame f) {
		board = b;
		frame = f;
		addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (board.check(Integer.parseInt(getText())))
			frame.update();
	}

}


package sudokugui;

		import java.awt.event.*;
		import javax.swing.*;

public class SudokuButton extends JButton implements ActionListener {

	private Sudoku board;
	private int row;
	private int col;

	public SudokuButton(Sudoku b, int r, int c) {
		board = b;
		row = r;
		col = c;
		addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		board.selected(row, col);
	}

}



package sudokugui;

public class SudokuPuzzle {

	public static void main(String[] args) {

		new SudokuFrame(new Sudoku(18));

	}
}
