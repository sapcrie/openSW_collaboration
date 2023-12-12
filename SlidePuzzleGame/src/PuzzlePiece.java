package pr.SlidePuzzleGame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/** PuzzlePiece - 슬라이드 퍼즐 게임 조각  */
public class PuzzlePiece extends JButton implements ActionListener {
    private int face_value;

    /** Constructor - PuzzlePiece 퍼즐 조각을 만듬
     * @param value - 퍼즐 조각 위에 표시되는 값  */
    private SlidePuzzleBoard board;
    public PuzzlePiece(String text, int value, SlidePuzzleBoard b) {
        super(text);
        face_value = value;
        board = b;
    }

    /** faceValue - 조각의 액면 값을 리턴  */
    public int faceValue() {
        return face_value;
    }

    public void actionPerformed(ActionEvent e) {
        board.move(face_value);
    }
}
