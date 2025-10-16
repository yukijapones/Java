public class Passaro extends Animal {
    private String especie;

    public Passaro() {
        super();
        this.especie = "Desconhecida";
    }

    public Passaro(String nome, String raca, String cor, String especie) {
        super(nome, raca, cor);
        this.especie = especie;
    }

    @Override
    public void fazerSom() {
        System.out.println("Piuu Piuuu!!");
    }

    public void voar() {
        System.out.println(nome + " está voando!");
    }
}