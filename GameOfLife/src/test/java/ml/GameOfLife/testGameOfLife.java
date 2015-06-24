package ml.GameOfLife;

import static org.junit.Assert.*;
import org.junit.Test;

public class testGameOfLife {

//		return twoDArray;
	//////////////////////////
	// initial board
	// 0 0 0
	// 0 1 0
	// 0 0 0
	boolean [][] board = {{false, false, false}, {false, true, false}, {false, false, false}};
	GameOfLife gameOfLife = new GameOfLife(board);
	
	@Test
	public void test() {
		assertEquals(true, gameOfLife.getCell(2,2));
	}

}
