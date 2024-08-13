abstract class Conta implements IConta {
    private static int contadorAgencia = 1;
    private static int contadorNumero = 0001;

    private int agencia;
    private int numero;
    private double saldo;

    public Conta() {
        this.agencia = contadorAgencia++;
        this.numero = contadorNumero++;
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

    public void mostrarDados() {
        System.out.println("Número: " +getNumero());
        System.out.println("Agencia: " +getAgencia());
        System.out.println("Saldo: " +getSaldo());
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

}
