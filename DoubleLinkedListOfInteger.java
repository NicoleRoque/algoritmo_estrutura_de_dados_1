public class DoubleLinkedListOfInteger {

    // Referencia para o nodo sentinela de inicio da lista encadeada.
    private Node header;

    // Referencia para o nodo sentinela de fim da lista encadeada.
    private Node trailer;

    // Referencia para a posicao corrente.
    private Node current;

    // Contador do numero de elementos da lista.
    private int count;

    private class Node {
        public Integer element;
        public Node next;
        public Node prev;

        public Node(Integer e) {
            element = e;
            next = null;
            prev = null;
        }
    }

    public DoubleLinkedListOfInteger() {
        header = new Node(null);
        trailer = new Node(null);
        header.next = trailer;
        trailer.prev = header;
        count = 0;
    }

    /**
     * Adiciona um elemento ao final da lista.
     * @param element elemento a ser adicionado ao final da lista
     */
    public void add(Integer element) {

    }

    /**
     * Insere um elemento em uma determinada posicao da lista.
     * @param index a posicao da lista onde o elemento sera inserido
     * @param element elemento a ser inserido
     * @throws IndexOutOfBoundsException se (index < 0 || index > size())
     */
    public void add(int index, Integer element) throws IndexOutOfBoundsException {

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
     * @param index a posicao da lista
     * @return o elemento que foi removido da lista
     * @throws IndexOutOfBoundsException se (index < 0 || index >= size())
     */
    public Integer removeByIndex(int index) {
        return null;
    }

    /**
     * Retorna o elemento de uma determinada posicao da lista.
     * @param index a posicao da lista
     * @return o elemento da posicao especificada
     * @throws IndexOutOfBoundsException se (index < 0 || index >= size())
     */
    public Integer get(int index) {
        return null;
    }

    /**
     * Retorna uma referencia para o nodo da posicao index.
     */
    private Node getNodeIndex(int index) {
        return null;
    }

    /**
     * Substitui o elemento armazenado em uma determinada posicao da lista
     * pelo elemento indicado.
     *
     * @param index a posicao da lista
     * @param element o elemento a ser armazenado na lista
     * @return o elemento armazenado anteriormente na posicao da lista
     * @throws IndexOutOfBoundsException se (index < 0 || index >= size())
     */
    public Integer set(int index, Integer element) {
        return null;
    }

    /**
     * Retorna um arranjo com uma copia de um subconjunto dos elementos da
     * lista.
     *
     * @param fromIndex a posição inicial ("inclusive") dos elementos a serem
     * incluídos
     * @param toIndex a posição final ("exclusive") dos elementos a serem
     * incluídos
     * @return um arranjo com um subconjunto da lista
     * @throws IndexOutOfBoundsException se (fromIndex < 0 || toIndex > size())
     * @throws IllegalArgumentException se (fromIndex > toIndex)
     */
    public Integer[] subList(int fromIndex, int toIndex) {
        return null;
    }
        /**
     * Retorna true se a lista contem o elemento especificado.
     * @param element o elemento a ser testado
     * @return true se a lista contém o elemento especificado
     */
    public boolean contains(Integer element) {
        Node aux = this.header;
        while (aux != null) {
            if (aux.element.equals(element)) {
                return true;
            }
            aux = aux.next;
        }
        return false;
    }

    /**
     * Retorna o indice da primeira ocorrencia do elemento na lista,
     * ou -1 se a lista não contém o elemento.
     *
     * @param element o elemento a ser buscado
     * @return o indice da primeira ocorrencia do elemento na lista,
     * ou -1 se a lista não contém o elemento
     */
    public int indexOf(Integer element) {
        Node aux = this.header;
        for (int i = 0; i < size(); i++) {
            if (aux.element.equals(element)) {
                return i;
            }
            aux = aux.next;
        }
        return -1;
    }

    /**
     * Metodo que inverte o conteudo da lista.
     */
    public void reverse() {

    }

    /**
     * Esvazia a lista.
     */
    public void clear() {
        header = null; //começo recebe null
        trailer = null; //final recebe null
        header.next = trailer; //o começo aponta para o final
        trailer.prev = header; //o final aponta pro começo
        count = 0; //zera o count
    }

    /**
     * Retorna o numero de elementos da lista.
     * @return o numero de elementos da lista
     */
    public int size() {
        return count;
    }

    /**
     * Retorna true se a lista não contem elementos.
     * @return true se a lista não contem elementos
     */
    public boolean isEmpty() {
        if (header.next == trailer) {
            return true;
        }
        return false;
    }

    @Override
    public String toString()
    {
        StringBuilder s = new StringBuilder();
        Node aux = header.next;
        for (int i = 0; i < count; i++) {
            s.append(aux.element.toString());
            s.append("\n");
            aux = aux.next;
        }
        return s.toString();
    } 

    /**
     * Inicializa o current na primeira posicao
     * (para percorrer do inicio para o fim).
     */
    public void reset() {

    }

    /**
     * Retorna o elemento da posicao corrente e faz current
     * apontar para o proximo elemento da lista.
     *
     * @return elemento da posicao corrente
     */
    public Integer next() {

        return null;
    }
        /**
     * Retorna uma String com o conteúdo da lista de trás para frente.
     *
     * @return String contendo os elementos da lista de trás para frente
     */
    public String toStringBackToFront() {

        return null;
    }

    /**
     * Método que percorre a lista e retira elementos repetidos,
     * deixando apenas uma ocorrência de cada elemento.
     */
    public void unique() {

    }

    /**
     * Conta o número de ocorrências do elemento passado como parâmetro
     * na lista, retornando este valor.
     *
     * @param element elemento cuja ocorrência deve ser contada
     * @return número de ocorrências do elemento na lista
     */
    public int countOccurrences(int element) {
        int contador = 0;
        Node aux = this.header;

        while (aux != null) {
            if (aux.element.equals(element)) {
                contador++;
            }
            aux = aux.next;
        }
        return contador;
    }

    /**
     * Método que percorre a lista removendo todos os elementos pares.
     * Para desenvolver este algoritmo é obrigatório o uso dos atributos,
     * pois nenhum método já implementado pode ser chamado.
     *
     * @return true se houver alguma remoção, e false caso não tenham
     * elementos pares e não seja feita remoção.
     */
    public boolean removeEvenNumbers() {
        
        return false;
    }

    /**
     * Retorna verdadeiro se a lista recebida por parâmetro possuir
     * os mesmos elementos da lista e na mesma ordem.
     * Caso contrário o método retorna falso.
     *
     * @param outra lista a ser comparada
     * @return true se as listas forem iguais, false caso contrário
     */
    public boolean equals(DoubleLinkedListOfInteger outra) {
        if (!(outra.size() == this.size())) {
            return false;
        }

        //cria duas variaveis, uma para cada lista
        Node aux = this.header;
        Node aux2 = outra.header;

        //percorrer qualquer uma das listas, já que o tamanho delas é o mesmo
        while (aux != null) {
            if (!(aux.element.equals(aux2.element))) {
                return false;
            }
            aux = aux.next;
            aux2 = aux2.next;
        }
        return true;
    }
}