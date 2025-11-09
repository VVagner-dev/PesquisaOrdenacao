import java.util.ArrayList;

public class Metodos {
    public Metodos() {}


    public ArrayList<Reserva> quick(ArrayList<Reserva> lista, int esq, int dir) {

        int i = 0, j = lista.size()-1;
        String pivo = lista.get((esq + dir) / 2).getNome();

        do {
            while (lista.get(i).getNome().compareTo(pivo) < 0) i++;
            while (lista.get(j).getNome().compareTo(pivo) > 0) j--;

            if (i <= j) {
                Reserva temp = lista.get(i);
                lista.set(i, lista.get(j));
                lista.set(j, temp);
                i++;
                j--;
            }
        } while (i <= j);

        if (esq < j) quick(lista, esq, j);
        if (i < dir) quick(lista, i, dir);

        return lista;

    }


}
