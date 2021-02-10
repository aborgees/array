public class Arrayum {
public static void main(String[] args) {

		Integer array[] = new Integer[9];
		int contador1 = 0;

		for ( contador1 = 0; contador1 < array.length; contador1++ )	{
			array[contador1] = contador1;
		}

		System.out.println("O elemento do array eh: ");

		for ( contador1 = 0; contador1< array.length; contador1++ )	{
			System.out.println( array[contador1] );
		}

		for ( contador1 = 0; contador1 < array.length; contador1++ )	{
			array[contador1] = array[contador1] * 3;
		}

		System.out.println("O elemento do array multiplicado por 3 eh: ");

		for ( contador1 = 0; contador1 < array.length; contador1++ )	{
			System.out.println( array[contador1] );
		}
	}
}
