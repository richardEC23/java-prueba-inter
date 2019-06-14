
public class Perro extends SerVivo implements IComportamientoSerVivo{

	@Override
	public int cumplirAnios() {
		// TODO Auto-generated method stub
		edad = edad + 7;
		return edad;
	}

}
