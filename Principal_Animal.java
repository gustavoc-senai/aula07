package aula07;

public class Principal_Animal {
	public static void main(String[] args) {
        
        Animal cachorro = new Animal();
        
        cachorro.setNome("Rex");
        cachorro.setCor("Marrom");
        cachorro.setTamanho("Médio");
        cachorro.setPeso("10kg");
        cachorro.setRaca("Labrador");

        System.out.println("-- CACHORRO  --");
        System.out.println("Nome: " + cachorro.getNome());
        System.out.println("Cor: " + cachorro.getCor());
        System.out.println("Tamanho: " + cachorro.getTamanho());
        System.out.println("Peso: " + cachorro.getPeso());
        System.out.println("Raça: " + cachorro.getRaca());
	}
}