package LogicaP;

public class Hombre extends Personas{

	public Hombre(double peso, int altura, int edad) {
		super(peso, altura, edad);
	}

	@Override
	public double calcularIMB() {
		// TODO Auto-generated method stub
		return 88.362 + (13.397 * peso) + (4.799 * altura) - (4.33 * edad);
	}

}
