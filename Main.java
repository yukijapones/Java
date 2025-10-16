import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Cachorro("Rex", "Vira-Lata", "Marrom", "Grande");
        Animal a2 = new Gato("Mimi", "Siames", "Branco", "Curto");
        Animal a3 = new Passaro("Louro", "Papagaio", "Verde", "Amazônico");


        a1.fazerSom();
        a2.fazerSom();
        a3.fazerSom();

        System.out.println();


        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(a1);
        animais.add(a2);
        animais.add(a3);

        for (Animal a : animais) {
            System.out.println(a);
            a.fazerSom();


            if (a instanceof Cachorro) {
                Cachorro c = (Cachorro) a;
                c.abanarRabo();
            }


            if (a instanceof Passaro) {
                Passaro p = (Passaro) a;
                p.voar();
            }

            if(a instanceof Gato) {
                Gato g = (Gato) a;
                g.arranhar();
            }

            System.out.println("-----");
        }
    }
}