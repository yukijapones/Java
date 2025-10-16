public class Gato extends Animal {
    private String tipoDePelo;

    public Gato() {
        super();
        this.tipoDePelo = "Curto";
    }

    public Gato(String nome, String raca, String cor, String tipoDePelo) {
        super(nome, raca, cor);
        this.tipoDePelo = tipoDePelo;
    }

    @Override
    public void fazerSom() {
        System.out.println("Miauu Miauu!!");
    }

    public void arranhar() {
        System.out.println(nome + " está arranhando!");
    }
}
