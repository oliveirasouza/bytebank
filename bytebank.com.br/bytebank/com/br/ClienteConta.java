package bytebank.com.br;

public class ClienteConta {

	public static void main(String[] args) {

		Conta contaDaMarcela = new Conta();
		contaDaMarcela.titular = new Cliente();
		
		contaDaMarcela.titular.nome="Marcela";
		
		System.out.println(contaDaMarcela.titular.nome);

		
		
		
		
	}

}
