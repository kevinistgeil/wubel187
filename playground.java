package playground;

import java.awt.Color;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class playground extends GraphicsProgram {

	public static final int ROWS = 4;
	public static final int CELLS = 6;
	public static final int BOARD_OFFSET = 50;
	public static final int CELL_SIZE = 52;
	public static final int DESCRIPTION_OFFSET = 5;
	public static final int PLAYING_FIELD_OFFSET = BOARD_OFFSET + DESCRIPTION_OFFSET;
	public static final int BOARD_SIZE = CELL_SIZE * ROWS + CELLS;

	@Override
	public void run() {
		// Make space for the whole board.
		setSize(PLAYING_FIELD_OFFSET * 2 + BOARD_SIZE, PLAYING_FIELD_OFFSET * 2 + BOARD_SIZE);

		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < CELLS; j++) {
				if ((i + j) % 2 == 1) {
					GRect boardPiece = new GRect(PLAYING_FIELD_OFFSET + j * CELL_SIZE,
							PLAYING_FIELD_OFFSET + i * CELL_SIZE, CELL_SIZE, CELL_SIZE);
					boardPiece.setColor(Color.BLACK);
					boardPiece.setFilled(true);
					add(boardPiece);
				}

			}
		}
	}
}
