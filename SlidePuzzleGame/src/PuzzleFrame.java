package pr.SlidePuzzleGame;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class PuzzleFrame extends JFrame {
    private SlidePuzzleBoard board;
    public PuzzleButton[][] button_board;
    private Container cp = getContentPane();
    public PuzzleFrame(SlidePuzzleBoard b){
        board = b;
        cp.setLayout(new GridLayout(4,4));
        this.button_board = new PuzzleButton[4][4];
//        int number = 15;
        for (int row = 0; row < 4; row++)
            for (int col = 0; col < 4; col++) {
                PuzzlePiece a = board.getPuzzlePiece(row, col);
                if (a != null) {
                    PuzzleButton but =  new PuzzleButton(board, this, a.faceValue());
                    button_board[row][col] = but;
                    but.addActionListener(but);
//                    but.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//                            update(a.faceValue());
////                            but.setText(String.valueOf(a.faceValue()));
//                        }
//                    });
//                    JPanel panel = new JPanel();
//                    panel.setLayout(new GridBagLayout());
//                    GridBagConstraints constraints = new GridBagConstraints();
//                    constraints.insets = new Insets(1, 1, 1, 1);
//                    panel.add(but, constraints);
                    cp.add(but);
                }else {
                    PuzzleButton but =  new PuzzleButton(board, this, 0);
                    button_board[row][col] = but;
                    but.addActionListener(but);
//                    but.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//                            // 버튼을 누를 때마다 숫자를 랜덤하게 바꾸기
////                            update();
//                            System.out.println("잘못된 클릭");
////                            but.setText(String.valueOf(0));
//                        }
//                    });
//                    JPanel panel = new JPanel();
//                    panel.setLayout(new GridBagLayout());
//                    GridBagConstraints constraints = new GridBagConstraints();
//                    constraints.insets = new Insets(1, 1, 1, 1);
//                    panel.add(but, constraints);
                    cp.add(but);
                }
            }
        setTitle("PuzzleFrame");
        setSize(300 + 15, 300 + 38);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void update(){//int n) {
//        System.out.println("업데이트");
//        System.out.println("눌림" + n);
//        System.out.println(board.move(n));
//        Container cp = getContentPane();
//        cp.setLayout(new GridLayout(4,4));
//        this.button_board = new PuzzleButton[4][4];
//        int number = 15;
//        cp.removeAll();
//        cp.setLayout(new GridLayout(4,4));
//        cp./
        for (int row = 0; row < 4; row++)
            for (int col = 0; col < 4; col++) {
                PuzzlePiece a = board.getPuzzlePiece(row, col);
                if (a != null) {
                    button_board[row][col].setText(String.valueOf(a.faceValue()));
                    button_board[row][col].setNum(a.faceValue());
                }else {
                    button_board[row][col].setText(" ");
                    button_board[row][col].setNum(0);
                }
            }

    }
}
