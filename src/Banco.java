import java.util.ArrayList;
import java.util.List;

public class Banco {

   List<Cliente> clientes;

    public Banco() {
        this.clientes = new ArrayList<Cliente>();
    }

    public void listarClientes() {
        
    }



    public static void main(String[] args) {
        Banco banco = new Banco();


        Cliente cliente = new Cliente("Lucas", "65241475", new ContaCorrente());
        Conta Lucas = new ContaCorrente();
        Lucas.depositar(200.0);
        banco.clientes.add(cliente);

    }
}



