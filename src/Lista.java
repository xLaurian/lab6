public class Lista {

    private Nod varf;
    private Nod coada;
    private int contor;
    class Nod{
        private int val;
        private Nod urm;

        public Nod(int x) {

            if (x < 0) {
                throw new IllegalArgumentException("Valoarea nodului trebuie să fie mai mare sau egală cu 0.");
            }

            this.val = x;
            this.urm = null;
        }

        public Nod() {
            this.val = 0;
            this.urm = null;
        }
    }

    static class ContorListe {
        private static int numarListe;

        private void incrementNrListe() {
            numarListe++;
        }

        public static int getNumarListe() {
            return numarListe;
        }
    }
    public Lista() {
        this.varf = null;
        this.coada = null;
        this.contor = 0;

        ContorListe contorListe = new ContorListe();
        contorListe.incrementNrListe();
    }

    public void adauga(int x) {

        Nod nod_nou = new Nod(x);

        if(coada == null) {
            varf = nod_nou;
            coada = nod_nou;
        } else {
            coada.urm = nod_nou;
            coada = nod_nou;
        }
        contor++;
    }

    public int dimensiune() {
        return contor;
    }

    public void afisareLista() {
        Nod nodCurent = varf;

        System.out.print("Lista: ");
        while (nodCurent != null) {
            System.out.print(nodCurent.val + " ");
            nodCurent = nodCurent.urm;
        }
        System.out.printf("\n");
        System.out.println("numar Liste = " + ContorListe.numarListe + "\n");
    }



    public static void main(String[] args) {

        Lista new_lista = new Lista();

        new_lista.adauga(5);
        new_lista.adauga(10);
        new_lista.adauga(15);

        System.out.println("Elemente lista");
        new_lista.afisareLista();

        int dimens = new_lista.dimensiune();
        System.out.printf("Dimensiune lista: " + dimens + "\n");

        Lista lista2 = new Lista();
        lista2.adauga(1);
        lista2.adauga(2);
        lista2.adauga(3);

        System.out.println("Elemente lista :");
        lista2.afisareLista();
        System.out.println("\n");

        dimens = lista2.dimensiune();
        System.out.printf("Dimensiune lista: " + dimens + "\n");

    }
}