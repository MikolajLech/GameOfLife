package ml.GameOfLife;

public class Coordinates {
	private int mX;
	private int mY;
	Coordinates(int inX, int inY) {
		mX = inX;
		mY = inY;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + mX;
		result = prime * result + mY;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coordinates other = (Coordinates) obj;
		if (mX != other.mX)
			return false;
		if (mY != other.mY)
			return false;
		return true;
	}

	public int getX() {
		return mX;		
	}

	public int getY() {
		return mY;
	}

}
