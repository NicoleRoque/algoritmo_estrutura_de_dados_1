public class LinkedListOfInteger {

    // Classe interna Node
    private class Node {
        public Integer element;
        public Node next;

        public Node(Integer element) {
            this.element = element;
            next = null;
        }

        public Node(Integer element, Node next) {
            this.element = element;
            this.next = next;
        }
    }

    // Referência para o primeiro elemento da lista encadeada.
    private Node head;

    // Referência para o último elemento da lista encadeada.
    private Node tail;

    // Contador para a quantidade de elementos que a lista contem.
    private int count;

    /**
     * Construtor da lista.
     */
    public LinkedListOfInteger() {

    }

    /**
     * Retorna true se a lista nao contem elementos.
     * @return true se a lista nao contem elementos
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * Retorna o numero de elementos da lista.
     * @return o numero de elementos da lista
     */
    public int size() {
        return 0;
    }

    /**
     * Esvazia a lista.
     */
    public void clear() {

    }

    /**
     * Adiciona um elemento ao final da lista.
     * @param element elemento a ser adicionado ao final da lista
     */
    public void add(Integer element) {

    }

    /**
     * Retorna o elemento de uma determinada posicao da lista.
     * @param index a posição da lista
     * @return o elemento da posicao especificada
     * @throws IndexOutOfBoundsException se (index < 0 || index >= size())
     */
    public Integer get(int index) {
        return null;
    }

    @Override
    public String toString() {
        return "";
    }

    ////////////////////////////////////////////////////////////////

    /**
     * Retorna true se a lista contem o elemento especificado.
     * @param element o elemento a ser testado
     * @return true se a lista contem o elemento especificado
     */
    public boolean contains(Integer element) {
        return false;
    }

    /**
     * Procura recursivamente por um elemento na lista.
     * @param element elemento a ser procurado
     * @return true se o elemento estiver na lista, false caso contrário
     */
    public boolean containsRecursivo(Integer element){
        return false;
    }

    /**
     * Método auxiliar recursivo utilizado na busca de um elemento.
     * @param element elemento a ser procurado
     * @param i posição atual da busca
     * @return true se o elemento for encontrado, false caso contrário
     */
    private boolean containsRecursivoAux(Integer element, int i){
        return false;
    }

    /**
     * Substitui o elemento armazenado em uma determinada posicao da lista pelo
     * elemento indicado.
     * @param index a posicao da lista
     * @param element o elemento a ser armazenado na lista
     * @return o elemento armazenado anteriormente na posicao da lista
     * @throws IndexOutOfBoundsException se (index < 0 || index >= size())
     */
    public Integer set(int index, Integer element) {
        return null;
    }

    /**
     * Insere um elemento em uma determinada posicao da lista.
     * @param index a posicao da lista onde o elemento sera inserido
     * @param element elemento a ser inserido
     * @throws IndexOutOfBoundsException se (index < 0 || index > size())
     */
    public void add(int index, Integer element) {

    }

    /**
     * Insere um elemento na lista mantendo a ordem crescente.
     * @param element elemento a ser inserido
     */
    public void addIncreasingOrder(Integer element){

    }

    /**
     * Remove a primeira ocorrencia do elemento na lista, se estiver presente.
     * @param element o elemento a ser removido
     * @return true se a lista contem o elemento especificado
     */
    public boolean remove(Integer element) {
        return false;
    }

        /**
     * Remove o elemento de uma determinada posicao da lista.
     *
     * @param index a posicao da lista
     * @return o elemento que foi removido da lista
     * @throws IndexOutOfBoundsException se (index < 0 || index >= size())
     */
    public Integer removeByIndex(int index) {
        return null;
    }

    /**
     * Retorna o indice da primeira ocorrencia do elemento na lista, ou -1 se a
     * lista nao contem o elemento.
     * @param element o elemento a ser buscado
     * @return o indice da primeira ocorrencia do elemento na lista, ou -1 se a
     * lista nao contem o elemento
     */
    public int indexOf(Integer element) {
        return 0;
    }

    /**
     * Retorna um arranjo que contem os elementos da lista original entre
     * fromIndex (inclusivo) e toIndex (exclusivo).
     *
     * @param fromIndex posicao a partir da qual os elementos serao inseridos no
     * arranjo a ser retornado
     * @param toIndex indica a posicao final dos elementos que devem ser
     * inseridos
     * @return Um arranjo com um subconjunto dos elementos da lista.
     * @throws IndexOutOfBoundsException se (fromIndex < 0 || toIndex > size())
     * @throws IllegalArgumentException se (fromIndex >= toIndex)
     */
    public Integer[] subList(int fromIndex, int toIndex) {
        return null;
    }

    /**
     * Compara o conteudo da lista com o conteudo da lista recebida por
     * parametro.
     * @param outra
     * @return true se as listas forem iguais, false caso contrario
     */
    public boolean equals(LinkedListOfInteger outra) {
        return false;
    }

    /**
     * Retorna uma nova lista contendo apenas os elementos comuns entre duas listas.
     * @param outraLista lista utilizada para realizar a intersecção
     * @return uma nova lista contendo a intersecção das listas
     */
    public LinkedListOfInteger intersec(LinkedListOfInteger outraLista){
        return null;
    }

    /**
     * Retorna uma nova lista contendo os elementos de duas listas
     * em ordem crescente.
     * @param l1 primeira lista
     * @param l2 segunda lista
     * @return uma nova lista com os elementos das duas listas ordenados
     */
    public LinkedListOfInteger merge(LinkedListOfInteger l1, LinkedListOfInteger l2){
        return null;
    }

    /**
     * Conta quantas vezes um determinado elemento aparece na lista.
     * @param element elemento a ser contado
     * @return quantidade de ocorrências do elemento
     */
    public int countOccurrences(Integer element){
        return 0;
    }

    /**
     * Remove todas as ocorrências repetidas da lista,
     * mantendo apenas uma ocorrência de cada elemento.
     */
    public void unique(){

    }

    /**
     * Inverte a ordem dos elementos armazenados na lista.
     */
    public void reverse(){

    }
        /**
     * Retorna um array com o conteudo da lista invertido.
     * @return um arranjo contendo os elementos da lista na ordem inversa
     */
    public Integer[] getBackToFront() {
        return null;
    }

    /**
     * Método auxiliar recursivo utilizado por getBackToFront().
     * @param n nodo atual
     * @param vet vetor que receberá os elementos
     * @param i posição atual do vetor
     */
    private void getBackToFront(Node n, Integer[] vet, int i){

    }

    /**
     * Retorna uma nova lista contendo os elementos repetidos da lista recebida.
     * Cada elemento repetido deve aparecer apenas uma vez na lista retornada.
     *
     * @param li lista utilizada na busca pelos elementos repetidos
     * @return uma nova lista contendo apenas os elementos repetidos
     */
    public LinkedListOfInteger getRepetidos(LinkedListOfInteger li){
        return null;
    }

}
