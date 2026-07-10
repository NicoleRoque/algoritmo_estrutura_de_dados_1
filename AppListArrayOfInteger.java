//utilização da main para testar os métodos implementados em ListArrayOfInteger
import java.util.Scanner;
public class AppListArrayOfInteger{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        ListArrayOfInteger teste1 = new ListArrayOfInteger(5);
        System.out.println("Verificar o tamanho do meu vetor " + teste1.size()); //funcionando!

        teste1.add(1);
        teste1.add(2);
        System.out.println("Verifica se os elementos foram adicionados pelo count" + teste1.count()); //funcionando!

    }
}