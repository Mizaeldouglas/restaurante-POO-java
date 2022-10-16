import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        Endereco endereco2 = new Endereco("123456789","Rua nona,Vila nunu");

        Restaurante restaurante = new Restaurante();

        restaurante.setId(1L);
        restaurante.setNomeFantasia("Mizael Douglas de Mello");
        restaurante.setCnpj("1234567852551");
        restaurante.setEndereco(endereco2);

        System.out.println(restaurante);
    }
}