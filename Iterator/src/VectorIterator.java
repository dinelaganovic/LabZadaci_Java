public class VectorIterator implements Iterator {
	private Vector vektor;
	private int index;
	public VectorIterator(Vector v) {
		vektor=v;
	}
	@Override
	public boolean existMore() {
		// TODO Auto-generated method stub
		return index < vektor.getDimension();
	}

	@Override
	public void next() {
		// TODO Auto-generated method stub
		index++;
	}

	@Override
	public int current() {
		// TODO Auto-generated method stub
		return vektor.getElement( index );
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		index=0;
	}

}
