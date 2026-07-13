public class AppLinkedListofInteger {
    public static void main(String[] args) {
        LinkedListOfInteger listaSimples = new LinkedListOfInteger();
        listaSimples.add(10);
        listaSimples.add(20);
        listaSimples.add(30);
        listaSimples.add(40);
        listaSimples.add(50);

      /*System.out.println(" A lista esta vazia? " + listaSimples.isEmpty());
        System.out.println("A quantidade de elementos da lista é igual a " + listaSimples.size());
        System.out.println(listaSimples);
        System.out.println(" Mostrar o elemento de determinada posição: " + listaSimples.get(0));
        System.out.println("Retorna verdadeiro ou falso se o elemento existe: " + listaSimples.contains(50));
        System.out.println("substitui o elemento armazenado e retorna o elemento anterior que foi excluido " + listaSimples.set(4, 50) );
        listaSimples.add(7, 256);
        listaSimples.addIncreasingOrder(12);
        System.out.println("Diz em que posição esta determinado elemento " + listaSimples.indexOf( 50));
        System.out.println(" O elemento removido foi o " + listaSimples.removeByIndex(4));*/
        System.out.println("O elemento escolhido foi removido? " + listaSimples.remove(10));
        System.out.println(listaSimples);
    }
}
