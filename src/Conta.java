import java.util.List;

public abstract class Conta implements IConta {


    private int agencia;
    private int numero;
    private int saldo;

    int contatosAgencia =+ 1;
    int contatorNumero =+ 2;
    public Conta() {
        this.agencia = contatosAgencia;
        this.numero = contatorNumero;
    }

    @Override
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public void depositar(double valor) {
            if (valor > 0) {
                saldo += valor;
            } else {
                System.out.println("Digite um valor para depositar");
            }
    }

    @Override
    public void transferir(double valor, Conta destino) {
            if (valor > 0 && destino != null) {
                sacar(valor);
                destino.depositar(valor);
            } else {
                System.out.println("Valor insuficiente");
            }
    }
}
