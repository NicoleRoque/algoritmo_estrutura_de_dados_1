//utilização da main para testar os métodos implementados em ListArrayOfInteger

public class AppListArrayOfInteger{
    public static void main(String args[]){
        ListArrayOfInteger teste1 = new ListArrayOfInteger(10);
        ListArrayOfInteger teste2 = new ListArrayOfInteger(10);
        System.out.println("Verificar o tamanho do meu vetor " + teste1.size()); //funcionando!


        teste1.add(1);
        teste1.add(62);
        teste1.add(0);
        teste1.add(10);
        teste2.add(1);
        teste2.add(5);
        teste2.add(9);
        teste2.add(0);

        System.out.println(teste1.merge(teste2));
        /* teste1.unique();
        System.out.println(teste1.toString());
        System.out.println(teste1.intersec(teste2));
     
        /* teste1.addIncreasingOrder(20);
        System.out.println(teste1.toString() + teste1.count());
        System.out.println(java.util.Arrays.toString(teste1.subList(1, 3 ))); //funcionando!
       teste1.add(4, 5); //funcionando
        System.out.println(teste1.toString()); //funcionando
        teste1.reverse();  //funcionando
        System.out.println(teste1.toString()); //funcionando
        System.out.println("quantas vezes o elemento aparece na lista " + teste1.countOccurrences(7)); //funcionando!
        System.out.println( "A primeira posição do elemento foi na posição "+ teste1.indexOf(3)); //funcionando!
        System.out.println(teste1.toString()); //funcionando
        System.out.println( teste1.get(0));//funcionando
        System.out.println(teste1.isEmpty()); //funcionando
        
        //System.out.println(" Troca o elemento e retorna o elemento antigo " + teste1.set(0, 6));
       // System.out.println( "Retorna o elemento da posição escolhida " + teste1.get(0));//funcionando
       // System.out.println("Verifica se os elementos foram adicionados pelo count " + teste1.count()); //funcionando!*/

        

    }
}