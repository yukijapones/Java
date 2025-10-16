public class Cachorro extends Animal {
    private String tamanho;

    public Cachorro(){
        super();
        this.tamanho = "Medio";
    }
    public Cachorro(String nome, String raca, String cor, String tamanho){
        super(nome, raca, cor);
        this.tamanho = tamanho;
    }
    @Override
    public void fazerSom() {
        System.out.println("Auu Auuu!!");
    }


    public void abanarRabo() {
        System.out.println(nome + " está abanando o rabo!");
    }
}
