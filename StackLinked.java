import java.util.EmptyStackException;

/**
 * Implementação de uma pilha utilizando estrutura encadeada.
 *
 * @author Nicole Ernesto Roque
 */
public class StackLinked {

    /**
     * Classe interna que representa um nó da pilha.
     */
    private class Node {

        private Integer element;
        private Node next;

        /**
         * Cria um novo nó.
         *
         * @param e Elemento armazenado no nó.
         */
        public Node(Integer e) {

        }
    }

    // Atributos
    private Node topo;
    private int count;

    /**
     * Constrói uma pilha vazia.
     */
    public StackLinked() {

    }

    /**
     * Retorna a quantidade de elementos da pilha.
     *
     * @return Número de elementos armazenados.
     */
    public int size() {
        return 0;
    }

    /**
     * Remove todos os elementos da pilha.
     */
    public void clear() {

    }

    /**
     * Verifica se a pilha está vazia.
     *
     * @return true se estiver vazia; false caso contrário.
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * Insere um elemento no topo da pilha.
     *
     * @param element Elemento a ser inserido.
     */
    public void push(Integer element) {

    }

    /**
     * Remove e retorna o elemento do topo da pilha.
     *
     * @return Elemento removido.
     * @throws EmptyStackException Caso a pilha esteja vazia.
     */
    public Integer pop() {
        return null;
    }

    /**
     * Retorna o elemento do topo da pilha sem removê-lo.
     *
     * @return Elemento do topo.
     * @throws EmptyStackException Caso a pilha esteja vazia.
     */
    public Integer top() {
        return null;
    }

    /**
     * Copia os elementos da pilha para um vetor de inteiros,
     * preservando o conteúdo original da pilha.
     *
     * @return Vetor contendo os elementos da pilha.
     */
    public int[] pilhaParaVetor() {
        return null;
    }

    /**
     * Retorna uma cópia da pilha sem alterar a pilha original.
     *
     * @return Nova pilha contendo os mesmos elementos.
     */
    @Override
    public StackLinked clone() {
        return null;
    }

    /**
     * Copia o conteúdo da pilha para o final de uma lista,
     * preservando os elementos da pilha.
     *
     * @param lista Lista de destino.
     * @param pilha Pilha de origem.
     */
    public static void copiaParaLista(DoubleLinkedListOfInteger lista, StackLinked pilha) {

    }
}
