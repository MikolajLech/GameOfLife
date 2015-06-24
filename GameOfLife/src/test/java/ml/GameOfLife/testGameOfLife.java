package ml.GameOfLife;

import static org.junit.Assert.*;
import org.junit.Test;

public class testGameOfLife {

	//////////////////////////
	// initial board
	// 0 0 0
	// 0 1 0
	// 0 0 0
	boolean [][] board = {{false, false, false}, {false, true, false}, {false, false, false}};
	GameOfLife gameOfLife = new GameOfLife(board);
	
	@Test
	public void trueFor11() {
		assertEquals(true, gameOfLife.getCell(1,1));
	}

	@Test
	public void falseFor00() {
		assertEquals(false, gameOfLife.getCell(0,0));
	}
	@Test
	public void falseFor22() {
		assertEquals(false, gameOfLife.getCell(2,2));
	}
}
