package bytebank.com.br;

public class TesteSacaNegativo {

	public static void main(String[] args) {

		Conta conta = new Conta(1337,24226);
		conta.deposita(1000);
		conta.saca(200);
		
		System.out.println(conta.saca(200));
	

		conta.getSaldo();
	
		System.out.println(conta.getSaldo());
		
		
		
	}

}
