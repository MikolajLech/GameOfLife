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
		assertEquals(true, gameOfLife.getCell(1,1).getIsAlive());
	}

	@Test
	public void falseFor00() {
		assertEquals(false, gameOfLife.getCell(0,0).getIsAlive());
	}
	
	@Test
	public void falseFor22() {
		assertEquals(false, gameOfLife.getCell(2,2).getIsAlive());
	}
	
	@Test
	public void checkUpdateFalseFor22() {
		assertEquals(false, gameOfLife.getCell(1,1).getIfWillBeAlive());
	}

	@Test
	public void checkUpdateFalseFor01() {
		assertEquals(false, gameOfLife.getCell(1,1).getIfWillBeAlive());
	}
	
	//////////////////////////
	// initial board, oscillator
	// 0 0 0    0 1 0
	// 1 1 1 -> 0 1 0
	// 0 0 0    0 1 0
	
	boolean [][] board2 = {{false, false, false}, {true, true, true}, {false, false, false}};
	GameOfLife gameOfLife2 = new GameOfLife(board2);
	
	@Test
	public void checkUpdate2TrueFor01() {
		assertEquals(true, gameOfLife2.getCell(0,1).getIfWillBeAlive());
	}
	
	@Test
	public void checkUpdate2TrueFor11() {
		assertEquals(true, gameOfLife2.getCell(1,1).getIfWillBeAlive());
	}
	
	@Test
	public void checkUpdate2TrueFor21() {
		assertEquals(true, gameOfLife2.getCell(2,1).getIfWillBeAlive());
	}
	
	@Test
	public void checkUpdate2FalseFor10() {
		assertEquals(false, gameOfLife2.getCell(1,0).getIfWillBeAlive());
	}
	
	@Test
	public void checkUpdate2FalseFor12() {
		assertEquals(false, gameOfLife2.getCell(1,2).getIfWillBeAlive());
	}
}
