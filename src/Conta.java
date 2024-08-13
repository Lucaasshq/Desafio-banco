public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo = 0.0;

    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }



    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }


    @Override
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }

    }

    @Override
    public void depositar(double valor) {
        if (valor > 0){
            saldo += valor;
        } else {
            System.out.println("Deposito invalido, Informe um valor positivo");
        }
    }

    @Override
    public void transferir(double valor, Conta contadestino) {
        this.sacar(valor);
        contadestino.depositar(valor);

    }


    protected void ImprimirInfoComuns() {
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Numero: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
    }


    public abstract void imprimirExtrato();
}
