
public class Util {
	
	
	/* 	Implementação do cálculo de fatorial de n utilizando a abordagem recursiva segundo a descrição do documento enviado.
		fatorial(n) = 1 				se n = 0
					= n x fatorial(n-1) se n > 0
	*/
	public static int fatorial(int n) {
		if(n == 0)  
			return 1;
		else 
			return  n * fatorial(n-1);
		
	}
}
