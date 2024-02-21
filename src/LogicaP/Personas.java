package LogicaP;

public abstract class Personas {
	protected double peso;
	protected int altura;
	protected int edad;
	
	public double getpeso() {
		return peso;
	}
	public void setpeso(double peso) {
		this.peso = peso;
	}
	
	public int getaltura() {
		return altura;
	}
	public void setaltura(int altura) {
		this.altura = altura;
	}

	public int getedad() {
		return edad;
	}
	public void setedad(int edad) {
		this.edad = edad;
	}
	
	public Personas(double peso, int altura, int edad) {
		this.peso = peso;
		this.altura = altura;
		this.edad = edad;
	}
	
	public abstract double calcularIMB();
}
