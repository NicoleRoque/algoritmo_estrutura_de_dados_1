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
            element = e;
            next = null;
        }
    }

    // Atributos
    private Node topo;
    private int count;

    /**
     * Constrói uma pilha vazia.
     */
    public StackLinked() {
        topo = null;
        count = 0;
    }

    /**
     * Retorna a quantidade de elementos da pilha.
     *
     * @return Número de elementos armazenados.
     */
    public int size() {
        return count;
    }

    /**
     * Remove todos os elementos da pilha.
     */
    public void clear() {
        topo = null;
        count = 0; 
    }

    /**
     * Verifica se a pilha está vazia.
     *
     * @return true se estiver vazia; false caso contrário.
     */
    public boolean isEmpty() {
        return (count == 0);
    }

    /**
     * Insere um elemento no topo da pilha.
     *
     * @param element Elemento a ser inserido.
     */
    public void push(Integer element) {
        
        Node inserir = new Node(element);
            if (count > 0) {
                inserir.next = topo; //
            }
            topo = inserir;
            count++;
    }

    /**
     * Remove e retorna o elemento do topo da pilha.
     *
     * @return Elemento removido.
     * @throws EmptyStackException Caso a pilha esteja vazia.
     */
    public Integer pop() {
        if (count == 0) {
            throw new EmptyStackException();
        }
        
        Integer elementoTopo = topo.element;
        topo = topo.next;
        count--;
        return elementoTopo;
    }

    /**
     * Retorna o elemento do topo da pilha sem removê-lo.
     *
     * @return Elemento do topo.
     * @throws EmptyStackException Caso a pilha esteja vazia.
     */
    public Integer top() {
        if (count == 0) {
            throw new EmptyStackException();
        }
        return topo.element;
    }

    /**
     * Copia os elementos da pilha para um vetor de inteiros,
     * preservando o conteúdo original da pilha.
     *
     * @return Vetor contendo os elementos da pilha.
     */
    public int[] pilhaParaVetor() {
        //cria uma variavel para guardar o tamanho original da pilha
        int tamanho = this.size();
        //criar um vetor para guardar os elementos
        int vetor [] = new int[this.size()];

        //criar uma pilha aux para guardar os elementos
        StackLinked pilhaAux = new StackLinked();
        //cria uma variavel auxiliar para guardar os elementos
        Integer elemento;
        //for que preenche a lista e a pilha auxiliar
        for (int i = 0; i < tamanho; i++) {
            elemento = this.pop();
            vetor[i] = elemento;
            pilhaAux.push(elemento);
        }
        
        //cria um for para colocar os elementos na pilha original de novo
        for (int i = 0; i < tamanho; i++) {
            elemento = pilhaAux.pop();
            this.push(elemento);
        }
        return vetor;
    }

    /**
     * Retorna uma cópia da pilha sem alterar a pilha original.
     *
     * @return Nova pilha contendo os mesmos elementos.
     */
    @Override
    public StackLinked clone() {
        //Cria a pilha copia 
        StackLinked pilhaCopia = new StackLinked();
        //cria uma pilha auxiliar
        StackLinked aux = new StackLinked();

        //Cria um elemento auxiliar para preencher as lista
        Integer elemento;
        //cria uma variavel para guardar o tamanho original da pilha
        int tamanho = this.size();
        //for que preenche  a auxiliar esvaziando a original
        for (int i = 0; i < tamanho; i++) {
            elemento = this.pop();
            aux.push(elemento);
        }
        //for para esvaziar a pilha aux e preencher a pilha original e a copia juntas
        for (int i = 0; i < tamanho; i++) {
            elemento = aux.pop();
            this.push(elemento);
            pilhaCopia.push(elemento);
        }
        return pilhaCopia;
    }

    /**
     * Copia o conteúdo da pilha para o final de uma lista,
     * preservando os elementos da pilha.
     *
     * @param lista Lista de destino.
     * @param pilha Pilha de origem.
     */
    public static void copiaParaLista(DoubleLinkedListOfInteger lista, StackLinked pilha) {
        //cria a pilha auxiliar
        StackLinked aux = new StackLinked();
        //Cria um elemento auxiliar para preencher as lista
        Integer elemento;
        //cria uma variavel para guardar o tamanho original da pilha
        int tamanho = pilha.size();
        //for que vai esvaziar a pilha original e preencher a lista e a pilha auxiliar
        for (int i = 0; i < tamanho; i++) {
            elemento = pilha.pop();
            aux.push(elemento);
            lista.add(elemento);
        }
        //for pra esvaziar pilha auxiliar e preencher a pilha original
        for (int i = 0; i < tamanho; i++) {
            elemento = aux.pop();
            pilha.push(elemento);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Topo -> ");

        Node aux = topo;

        while (aux != null) {
            sb.append(aux.element);

            if (aux.next != null) {
                sb.append(" -> ");
            }

            aux = aux.next;
        }

        sb.append(" -> null");

        return sb.toString();
    }
}
