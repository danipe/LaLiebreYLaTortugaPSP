
public class Main {

	public static void main(String[] args) {
		//Creamos tres objetos de la clase Animal y le pasamos el nombre de dicho animal
		Animal guepardo = new Animal("guepardo");
		Animal liebre = new Animal("liebre");
		Animal tortuga = new Animal("tortuga");
		//Asignamos prioridades a cada animal
		guepardo.setPriority(Thread.MAX_PRIORITY);
		liebre.setPriority(Thread.NORM_PRIORITY);
		tortuga.setPriority(Thread.MIN_PRIORITY);
		//Iniciamos la carrera de los animales
		guepardo.start();
		liebre.start();
		tortuga.start();

	}

}
