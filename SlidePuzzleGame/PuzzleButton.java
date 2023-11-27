package pr.SlidePuzzleGame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PuzzleButton extends JButton implements ActionListener {
    private PuzzleFrame view;
    public int num;
    private SlidePuzzleBoard board;
    public PuzzleButton(SlidePuzzleBoard b, PuzzleFrame f, int n) {
        super(n>0 ? n+""  : "");
        board = b;
        view = f;
        num = n;
//        addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {    // 동작 감지 시 작동함
//        System.out.println("눌림" + num);
        board.move(num);
        view.update();
    }
    public void setNum(int n) {
        num = n;
    }
}
