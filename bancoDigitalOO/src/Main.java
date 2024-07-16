
public class Main {

	public static void main(String[] args) {
		PessoaFisica gustavo = new PessoaFisica("Gustavo", "07021434995");
		Conta cc = new ContaCorrente((Cliente) gustavo);
		Conta poupanca = new ContaPoupanca((Cliente) gustavo);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
