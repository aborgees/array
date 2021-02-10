public class Arraydois {

	public static void main(String[] args) {

		Integer array[] = new Integer[10];

		for ( int contador1 = 9; contador1 >= 0; contador1-- )	{
			array[contador1] = contador1;
		}

		System.out.println("O elemento do array eh: ");

		for (int contador1 = 9; contador1 >= 0 ; contador1-- )	{
			System.out.println( array[contador1] );
		}
	}
}
