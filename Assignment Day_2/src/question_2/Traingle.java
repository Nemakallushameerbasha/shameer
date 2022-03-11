package question_2;

public class Traingle extends Figure {
	
	public Traingle(int dim1, int dim2) {
		super(dim1, dim2);
		
	}

	@Override
	public double area() {
		return 1*2*this.getDim1()*this.getDim2();
	}

}
