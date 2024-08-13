import java.util.List;

public class Banco {

    List<Conta> conta;


    public static void main(String[] args) {
        Banco banco = new Banco();

        Cliente cliente = new Cliente("Lucas", "65241475", new ContaCorrente());


    }
}



