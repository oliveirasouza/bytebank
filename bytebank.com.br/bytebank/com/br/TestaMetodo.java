package bytebank.com.br;

public class TestaMetodo {

	public static void main(String[] args) {

		Conta contaDoPaulo = new Conta(1373,24226);
		//contaDoPaulo.saldo = 100;
		contaDoPaulo.getSaldo();
		contaDoPaulo.deposita(50);
		
		System.out.println(contaDoPaulo.getSaldo());
		
		boolean conseguiuRetirar = contaDoPaulo.saca(20);
		
		System.out.println(contaDoPaulo.getSaldo());
		
		System.out.println(conseguiuRetirar);
		
		
		Conta contaDaMarcela = new Conta(1373,24226);
		contaDaMarcela.deposita(1000);
		
		if (contaDaMarcela.transfere(1500,contaDoPaulo)) {
			System.out.println("Tranferencia com sucesso");	
			
		}else {
		
			System.out.println("Sem saldo");
			
		}
		
		
		System.out.println(contaDaMarcela.getSaldo());
		System.out.println(contaDoPaulo.getSaldo());
	}

}