public class main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        cc.depositar(200);
        Conta cp = new ContaPoupanca();
        cc.transferir(200 , cp);
        cc.ImprimirInfoComuns();
        cp.ImprimirInfoComuns();


    }
}
