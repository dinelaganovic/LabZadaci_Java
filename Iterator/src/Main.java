
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iterator i;
		Vector v = new Vector(10);
		i = new VectorIterator( v );
		i.reset();
		while ( i.existMore() )
		{
			System.out.println( i.current() );
			i.next();
		}
	}

}
