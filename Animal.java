public abstract class Animal {
    protected String nome;
    protected String raca;
    protected String cor;

    public Animal(String nome, String raca, String cor) {
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
    }

    public Animal() {
        this("Desconhecido", "Nenhuma", "Sem cor");
    }


    public abstract void fazerSom();

    @Override
    public String toString() {
        return "Animal{nome='" + nome + "', raca='" + raca + "', cor='" + cor + "'}";
    }
}
