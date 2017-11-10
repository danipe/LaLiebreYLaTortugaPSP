
public class Animal extends Thread{
	private String animal;
	public Animal(String a) {
		this.animal = a;
	}
	
	@Override
	public void run() {
		//Mostramos el nombre del animal 10 veces y después mostramos un mensaje para indicar que ha llegado a la meta
		for(int i = 0; i < 10; i++) {
			System.out.println(this.animal);
		}
		System.out.println("Acaba "+this.animal);
	}
	
}
