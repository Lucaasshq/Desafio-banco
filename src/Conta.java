abstract class Conta implements IConta {


    private int agencia;
    private int numero;
    private int saldo;

    public Conta() {
        this.agencia = +1;
        this.numero = +2;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;

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

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }


}
