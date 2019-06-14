
public class Humano extends SerVivo implements IComportamientoSerVivo{

	@Override
	public int cumplirAnios() {
		// TODO Auto-generated method stub
		edad = edad + 1;
		return edad;
	}

	
}
