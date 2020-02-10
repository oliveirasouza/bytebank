package bytebank.com.br;

public class TestaValores {

	public static void main(String[] args) {

//		Conta conta = new Conta();
//		
//		//Conta está inconsistente
//		
//		conta.setAgencia(-50);
//		conta.setNumero(-330);
//		
//		
		
		
		
		
		Conta conta = new Conta(1337, 24226);
		
		
		System.out.println(conta.getAgencia());
		
		
		
		
		conta.setAgencia(123);
		
		
		Conta conta2  = new Conta(1337,2322);
		
		Conta conta3 = new Conta(1233,22333);
		
		
		System.out.println("Total de Contas : " + Conta.getTotal());
		
		
		
		
		
		

		
	}

}
