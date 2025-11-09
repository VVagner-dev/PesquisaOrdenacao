import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Metodos metodos = new Metodos();


    public static void main(String[] args) {

        ArrayList<Reserva>[] lista = LerArquivos();

        quick(lista);
        
    }

    public static ArrayList<Reserva>[] LerArquivos(){
        Dados dd = new Dados();
        String[] linkArquivo = {"src/arquivosAntes/dado.txt"};
        ArrayList<Reserva>[] vetorArquivos = new ArrayList[12];
        for(int i = 1;i<12;i++) {
            vetorArquivos[i] = dd.lerArquivo(linkArquivo[i]);
        }
        return vetorArquivos;
    }


    public static void quick(ArrayList<Reserva>[] lista) {

        for(int i = 1;i<12;i++) {
            for(int j = 1;j<5;j++){
            metodos.quick(lista[i],0,lista[i].size()-1);
            }

        }

    }


}