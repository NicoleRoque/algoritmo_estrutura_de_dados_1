public class AppStackArray {
    public static void main(String[] args) {
        StackLinked pilha = new StackLinked();
        DoubleLinkedListOfInteger lista = new DoubleLinkedListOfInteger();

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.push(40);
        pilha.push(50);

       /*  System.out.println("O elemento removido foi o: " + pilha.pop());
        System.out.println("O elemento removido foi o: " + pilha.pop());
        System.out.println("O elemento removido foi o: " + pilha.pop());
        System.out.println("O elemento do topo da lista é o " + pilha.top());
        System.out.println("O tamanho da pilha é " + pilha.size());
        pilha.clear();
        System.out.println("A pilha esta vazia? " + pilha.isEmpty());

        System.out.println("Retorna uma lista com os elementtos da pilha " + java.util.Arrays.toString(pilha.pilhaParaVetor()));*/
        System.out.println ("Retorna uma pilha igual a pilha atual mas sem alterar a original " + pilha.clone());
        pilha.copiaParaLista(lista, pilha);
        System.out.println(pilha);
        System.out.println(lista);
    }
}
