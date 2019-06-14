
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SerVivo unH= new Humano();
		unH.setEdad(22);
		
		SerVivo unP= new Perro();
		unP.setEdad(7);

		IComportamientoSerVivo unSerVivo = (IComportamientoSerVivo) unP;
		IComportamientoSerVivo otroSerVivo = (IComportamientoSerVivo) unH;
		
		System.out.println(unP.getEdad());
		System.out.println(unH.getEdad());
		
		unSerVivo.cumplirAnios();
		otroSerVivo.cumplirAnios();
		
		System.out.println(unP.getEdad());
		System.out.println(unH.getEdad());
		
	}

}
