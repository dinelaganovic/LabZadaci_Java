
public class MagacinKaoVektor extends Magacin {

	int [] nizelemenata;
	
	public MagacinKaoVektor(int kapacitetmagacina){
		super(kapacitetmagacina);
		nizelemenata= new int [kapacitetmagacina];
	}
	
	@Override
	public void DodajElement(int element) {
		// TODO Auto-generated method stub

		nizelemenata[brojelemenata]=element;
		brojelemenata++;
	}

	@Override
	public int IzbaciPoslednji() {
		// TODO Auto-generated method stub

		brojelemenata--;
		return nizelemenata[brojelemenata];
	}

}
