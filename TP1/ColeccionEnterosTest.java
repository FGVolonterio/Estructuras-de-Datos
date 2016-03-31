public class ColeccionEnterosTest {
	
	public static void main(String[] args) {
		
		ColeccionEnteros E = new ColeccionEnterosArreglo(101);
		
		try {

			for (int i = 0; i < 100; i++)
				E.Insertar(i);
				
			E.print();
			for (int i = 0; i < 100; i++)
				if (E.Pertenece(i))
					E.Eliminar(i);
			
			E.print();
			
		} catch (ColeccionVacia e) {
			System.out.println(e.getMessage());
		} catch (ColeccionLlena e) {
			System.out.println(e.getMessage());
		}
	}
}