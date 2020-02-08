package bytebank.com.br;

public class CriaConta {

	public static void main(String[] args) {

		
		Conta primeiraConta = new Conta();
		primeiraConta.getSaldo();
		
		System.out.println(primeiraConta.getSaldo());
		
		primeiraConta.getSaldo();
		System.out.println(primeiraConta.getSaldo());
		
		
		Conta segundaConta = primeiraConta;
		segundaConta.getSaldo();
		
		System.out.println(primeiraConta.getSaldo());
		
		System.out.println(segundaConta.getSaldo());
		
		
		
			
	}

	
}
