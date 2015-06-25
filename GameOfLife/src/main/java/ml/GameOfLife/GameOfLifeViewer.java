package ml.GameOfLife;

public class GameOfLifeViewer implements Viewer {
	@Override
	public void prt() {
		for(int i = 0; i < 3; i ++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(convCell(mGameOfLife.getCell(i, j).getIsAlive()));
			}
			System.out.println();
		}
		System.out.println();
	}
	
	private GameOfLife mGameOfLife;
	GameOfLifeViewer(GameOfLife inGameOfLife) {
		mGameOfLife = inGameOfLife;
	}
	private char convCell(boolean bool) {
		return bool ? Character.toChars(79)[0] : Character.toChars(43)[0];
	}

}
