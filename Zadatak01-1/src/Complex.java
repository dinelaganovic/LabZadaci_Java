import java.lang.Math;
public class Complex {
private double Im;
private double Re;

Complex(int im, int rel){
	this.Im=im;
	this.Re=rel;
}
public double IzracunajMoudl() {
	 double z;
	 z=Math.sqrt((this.Im*this.Im) +(this.Re * this.Im));
	return z;
}
public Complex Saberi(Complex u, Complex v) {
	Complex w = null;
	w.Re=u.Re+v.Re;
	w.Im=u.Im+v.Im;

	return w;
}
}
