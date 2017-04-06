import java.util.Scanner;


interface funcoesContas{
	void criaConta(Conta conta);
}

class Conta{
	double saldo;
	String num_conta;
	Scanner in = new Scanner(System.in);

	void deposita(double valor){
		saldo += valor;
	}

	void retira(double valor){
		saldo -= valor;
	}

	double getsaldo(){
		return(saldo);
	}
}

class Corrente extends Conta implements funcoesContas{

	void criaConta(Conta conta){
		System.out.println("Você esta criando uma conta corrente!\n\n\n\n\n");
	}
}

class Poupanca extends Conta implements funcoesContas{

}