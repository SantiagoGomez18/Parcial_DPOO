package Presentacion;
import LogicaP.Hombre;
import LogicaP.Personas;
import LogicaP.Mujer;

public class Principal {

	public static void main(String[] args) {
		Personas p;
		p = new Hombre(75,187,27);
		System.out.println(p.calcularIMB());
		
		p = new Mujer(56,162,23);
		System.out.println(p.calcularIMB());
	}
}