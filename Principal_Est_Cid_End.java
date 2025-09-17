package aula07;

public class Principal_Est_Cid_End {
    public static void main(String[] args) {
        Estado estado = new Estado("São Paulo", "SP");
        Cidade cidade = new Cidade("Campinas", estado);
        Endereco endereco = new Endereco("Rua das Flores", 123, "Centro", "13000-000", cidade);

        System.out.println(endereco);
    }
}