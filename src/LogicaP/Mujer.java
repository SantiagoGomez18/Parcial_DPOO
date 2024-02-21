package LogicaP;

public class Mujer extends Personas{

	public Mujer(double peso, int altura, int edad) {
		super(peso, altura, edad);
	}

	@Override
	public double calcularIMB() {
		return 444.593 + (9.247 * peso) + (3.098 * altura) - (4.33 * edad);
	}

}
