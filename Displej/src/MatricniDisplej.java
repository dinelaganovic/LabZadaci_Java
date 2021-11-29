
public class MatricniDisplej extends Displej {
	public int Matrica [][];
	
	public MatricniDisplej(int c) {
		super(c);
		// TODO Auto-generated constructor stub
		this.Matrica=new int[5][3];
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		switch(this.cifra)
		{
		case 0:this.Matrica=new int [][]{{1,1,1},{1,0,1},{1,0,1},{1,0,1},{1,1,1}};break;
		case 1:this.Matrica=new int [][]{{0,0,1},{0,0,1},{0,0,1},{0,0,1},{0,0,1}};break;
		case 2:this.Matrica=new int [][]{{1,1,1},{0,0,1},{1,1,1},{1,0,0},{1,1,1}};break;
		case 3:this.Matrica=new int [][]{{1,1,1},{0,0,1},{1,1,1},{0,0,1},{1,1,1}};break;
		}
		
		for(int i=0;i<5;i++)
		{
		for(int j=0;j<3;j++)
		{
			System.out.print(this.Matrica[i][j]+"\t");
		}
		System.out.println();
		}
	}

}
