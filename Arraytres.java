public class Arraytres {
public static void main(String[] args) {

		Integer array[][] = new Integer[100][100];
		int contador1 = 0;
		int contador2 = 0;

		for ( contador1 = 0; contador1 < 100; contador1++ ) {
            for ( contador2 = 0; contador2 < 100; contador2++ ){
  			   array[contador1][contador2] = contador1 - contador2; 
	        }   
        }

		System.out.println("Resultado da subtração dos indices:" );

		for ( contador1 = 0; contador1 < 100; contador1++ ) {
            for ( contador2 = 0; contador2 < 100; contador2++ ){
            	System.out.println(array[contador1][contador2]);
            }
		}

		for ( contador1 = 0; contador1 < 100; contador1++ ) {
            for ( contador2 = 0; contador2 < 100; contador2++ ){
  			   array[contador1][contador2] = 7 * (contador1 - contador2) ; 
            }
		}

		System.out.println("Resultado da subtração dos indices multiplicadas por 7:" );

		for ( contador1 = 0; contador1 < 100; contador1++ ) {
            for ( contador2 = 0; contador2 < 100; contador2++ ){
            	System.out.println(array[contador1][contador2]);
            }
		}
}
}
