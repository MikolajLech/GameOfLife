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
	Viewer viewer;
	// check board importing
	@Test
	public void falseFor00() {
		assertEquals(false, gameOfLife.getCell(0,0).getIsAlive());
	}
	
	@Test
	public void falseFor01() {
		assertEquals(false, gameOfLife.getCell(0,1).getIsAlive());
	}
	
	@Test
	public void falseFor02() {
		assertEquals(false, gameOfLife.getCell(0,2).getIsAlive());
	}
	
	@Test
	public void falseFor10() {
		assertEquals(false, gameOfLife.getCell(1,0).getIsAlive());
	}
	
	@Test
	public void trueFor11() {
		assertEquals(true, gameOfLife.getCell(1,1).getIsAlive());
	}
	
	@Test
	public void falseFor12() {
		assertEquals(false, gameOfLife.getCell(1,2).getIsAlive());
	}

	@Test
	public void falseFor20() {
		assertEquals(false, gameOfLife.getCell(2,0).getIsAlive());
	}
	
	@Test
	public void falseFor21() {
		assertEquals(false, gameOfLife.getCell(2,1).getIsAlive());
	}
	
	@Test
	public void falseFor22() {
		assertEquals(false, gameOfLife.getCell(2,2).getIsAlive());
	}
	
	// check if cell will be alive
	@Test
	public void checkUpdateFalseFor00() {
		assertEquals(false, gameOfLife.getCell(0, 0).evalIfWillBeAlive());
	}
	@Test
	public void checkUpdateFalseFor11() {
		assertEquals(false, gameOfLife.getCell(1, 1).evalIfWillBeAlive());
	}
	@Test
	public void checkUpdateFalseFor22() {
		assertEquals(false, gameOfLife.getCell(2,2).evalIfWillBeAlive());
	}

	
	//////////////////////////
	// initial board, oscillator
	// 0 0 0    0 1 0
	// 1 1 1 -> 0 1 0
	// 0 0 0    0 1 0
	
	boolean [][] board2 = {{false, false, false}, {true, true, true}, {false, false, false}};
	GameOfLife gameOfLife2 = new GameOfLife(board2);
	
	// check board importing
	@Test
	public void false2For00() {
		assertEquals(false, gameOfLife.getCell(0,0).getIsAlive());
	}
	
	@Test
	public void false2For01() {
		assertEquals(false, gameOfLife.getCell(0,1).getIsAlive());
	}
	
	@Test
	public void false2For02() {
		assertEquals(false, gameOfLife.getCell(0,2).getIsAlive());
	}
	@Test
	public void true2For10() {
		assertEquals(true, gameOfLife2.getCell(1,0).getIsAlive());
	}
	
	@Test
	public void true2For11() {
		assertEquals(true, gameOfLife2.getCell(1,1).getIsAlive());
	}
	
	@Test
	public void true2For12() {
		assertEquals(true, gameOfLife2.getCell(1,2).getIsAlive());
	}
	
	// check if cell will be alive
	@Test
	public void checkUpdate2FalseFor00() {
		assertEquals(false, gameOfLife2.getCell(0,0).evalIfWillBeAlive());
	}
	
	@Test
	public void checkUpdate2TrueFor01() {
		assertEquals(true, gameOfLife2.getCell(0,1).evalIfWillBeAlive());
	}
	
	@Test
	public void checkUpdate2FalseFor02() {
		assertEquals(false, gameOfLife2.getCell(0,2).evalIfWillBeAlive());
	}
	
	@Test
	public void checkUpdate2FalseFor10() {
		assertEquals(false, gameOfLife2.getCell(1,0).evalIfWillBeAlive());
	}
	
	@Test
	public void checkUpdate2TrueFor11() {
		assertEquals(true, gameOfLife2.getCell(1,1).evalIfWillBeAlive());
	}
	
	@Test
	public void checkUpdate2FalseFor12() {
		assertEquals(false, gameOfLife2.getCell(1, 2).evalIfWillBeAlive());
	}

	@Test
	public void checkUpdate2TrueFor20() {
		assertEquals(false, gameOfLife2.getCell(2,0).evalIfWillBeAlive());
	}
	
	@Test
	public void checkUpdate2TrueFor21() {
		assertEquals(true, gameOfLife2.getCell(2,1).evalIfWillBeAlive());
	}
	
	@Test
	public void checkUpdate2FalseFor22() {
		assertEquals(false, gameOfLife2.getCell(2,2).evalIfWillBeAlive());
	}
	
	//////////////////////////
	// initial board, oscillator
	// 0 1 1    0 1 1
	// 0 1 1 -> 0 1 1
	// 0 0 0    0 0 0
	
	boolean [][] board3 = {{false, true, true}, {false, true, true}, {false, false, false}};
	GameOfLife gameOfLife3 = new GameOfLife(board3);
	
	// check if cell will be alive
	@Test
	public void checkUpdate3FalseFor00() {
		assertEquals(false, gameOfLife3.getCell(0,0).evalIfWillBeAlive());
	}
	
	@Test
	public void checkUpdate3TrueFor01() {
		assertEquals(true, gameOfLife3.getCell(0,1).evalIfWillBeAlive());
	}
	
	@Test
	public void checkUpdate3TrueFor02() {
		assertEquals(true, gameOfLife3.getCell(0,2).evalIfWillBeAlive());
	}
	
	@Test
	public void checkUpdate3FalseFor10() {
		assertEquals(false, gameOfLife3.getCell(1,0).evalIfWillBeAlive());
	}
	
	@Test
	public void checkUpdate3TrueFor11() {
		assertEquals(true, gameOfLife3.getCell(1,1).evalIfWillBeAlive());
	}
	
	@Test
	public void checkUpdate3TrueFor12() {
		assertEquals(true, gameOfLife3.getCell(1,2).evalIfWillBeAlive());
	}
	
	@Test
	public void checkUpdate3FalseFor20() {
		assertEquals(false, gameOfLife3.getCell(2,0).evalIfWillBeAlive());
	}
	
	@Test
	public void checkUpdate3FalseFor21() {
		assertEquals(false, gameOfLife3.getCell(2,1).evalIfWillBeAlive());
	}
	
	@Test
	public void checkUpdate3FalseFor22() {
		assertEquals(false, gameOfLife3.getCell(2,2).evalIfWillBeAlive());
	}
}
