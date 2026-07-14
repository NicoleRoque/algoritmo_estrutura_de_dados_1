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
       //cria um nodo que guarda o elemento
       Node newNode = new Node(element);
      
       newNode.prev = trailer.prev;  // novo recebe as informações anteriores do ultimo
       newNode.next = trailer;       // o ultimo passa a apontar para o novo
       trailer.prev.next = newNode;  // antigo último(trailer.prev) aponta para o novo (.next)
       trailer.prev = newNode;       // trailer aponta para o novo último


       count++;
       return;
    }

    /**
     * Insere um elemento em uma determinada posicao da lista.
     * @param index a posicao da lista onde o elemento sera inserido
     * @param element elemento a ser inserido
     * @throws IndexOutOfBoundsException se (index < 0 || index > size())
     */
    public void add(int index, Integer element) throws IndexOutOfBoundsException {
        // Verifica se o índice é válido
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException("Posição inválida.");
        }
        if (count == index) {
            add(element);
        }
        //criar um nodo
        Node newNode = new Node(element);
        //cria variavel que percorre até o index
        Node aux = getNodeIndex(index);

        //antes e depois do newNode
        newNode.prev = aux.prev;
        newNode.next = aux;

        //depois e antes do aux
        aux.prev.next = newNode;
        aux.prev = newNode;

        count++;
        
    }

    /**
     * Remove a primeira ocorrencia do elemento na lista, se estiver presente.
     * @param element o elemento a ser removido
     * @return true se a lista contem o elemento especificado
     */
    public boolean remove(Integer element) {
        Node aux = header.next; //percorre a lista 
        for (int i = 0; i < count; i++) {
            if (aux.element.equals(element)) {
                aux.prev.next = aux.next; //(aux.prev)é o número a ser removido, o proximo dele recebe o proximo 
                aux.next.prev = aux.prev;//(aux.next) é o proximo que recebe o anterior
                count--;
                return true;
            }
            aux = aux.next;
        }
        return false;
    }

    /**
     * Remove o elemento de uma determinada posicao da lista.
     * @param index a posicao da lista
     * @return o elemento que foi removido da lista
     * @throws IndexOutOfBoundsException se (index < 0 || index >= size())
     */
    public Integer removeByIndex(int index) {
        // Verifica se o índice é válido
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Posição inválida.");
        }

        Node removido = header.next;

        for (int i = 0; i < index; i++) {
            removido = removido.next;
            
        }
        removido.prev.next = removido.next;
        removido.next.prev = removido.prev;
        count--;

        return removido.element;
    }

    /**
     * Retorna o elemento de uma determinada posicao da lista.
     * @param index a posicao da lista
     * @return o elemento da posicao especificada
     * @throws IndexOutOfBoundsException se (index < 0 || index >= size())
     */
    public Integer get(int index) {
        if(index < 0 || index >= size()){
            throw new IndexOutOfBoundsException("Posição do index invalida");
        }

        Node aux = getNodeIndex(index);
        return aux.element;
    }

    /**
     * Retorna uma referencia para o nodo da posicao index.
     */
    private Node getNodeIndex(int index) {
        Node retornado = header.next;
        for (int i = 0; i < size(); i++) {
            if (index == i) {
                return retornado;
            }
            retornado = retornado.next;
        }
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
        if(index < 0 || index >= size()){
            throw new IndexOutOfBoundsException("Posição do index invalida");
        }
        Node aux = header.next;

        for (int i = 0; i < index; i++) {
            aux = aux.next;
        }
        //guarda o elemento a ser trocado
        Integer elementoTrocado = aux.element;
        aux.element = element;

        return elementoTrocado;
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
        //verificação dos indexs
        if (fromIndex < 0 || toIndex > size()) {
            throw new IndexOutOfBoundsException("Valor de index inválido");
        }
        if (fromIndex > toIndex) {
            throw new IllegalArgumentException("O valor do index do começo é maior que o final");
        }

        //cria o vetor 
        Integer list [] = new Integer[toIndex - fromIndex];

        //cria um nodo 
        Node aux = header.next;
        //cria um for para percorrer a lista até a posição anterior ao fromIndex
        for (int i = 0; i < fromIndex; i++) {
            aux = aux.next;
        }

        //cria um for para percorrer a lista, preenchendo o vetor
        for (int i = 0; i < list.length; i++) {
            list[i] = aux.element;
            aux = aux.next;
        }

        return list;
    }
        /**
     * Retorna true se a lista contem o elemento especificado.
     * @param element o elemento a ser testado
     * @return true se a lista contém o elemento especificado
     */
    public boolean contains(Integer element) {
        Node aux = header.next;
        while (aux != trailer) {
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
        Node aux = header.next;
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
        //nodos auxiliares para percorrer a lista
        Node inicio = header.next;
        Node fim = trailer.prev;

        //percorre até metade da lista, os dois irão se encontrar no meio
       for (int i = 0; i < count / 2; i++) {
            //trocar apenas os elementos de lugar
            Integer aux = inicio.element;
            inicio.element = fim.element;
            fim.element = aux;

            //anda na lista a cada laço do for
            inicio = inicio.next;
            fim = fim.prev;
        }


    }

    /**
     * Esvazia a lista.
     */
    public void clear() {
        header = new Node(null); //começo recebe null
        trailer = new Node(null); //final recebe null
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
        return (count == 0);
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
        current = header.next;
    }

    /**
     * Retorna o elemento da posicao corrente e faz current
     * apontar para o proximo elemento da lista.
     *
     * @return elemento da posicao corrente
     */
    public Integer next() {
        if (current == trailer) {
            return null;
        }
         Integer atual = current.element;
         current = current.next;
         
        return atual;
    }
        /**
     * Retorna uma String com o conteúdo da lista de trás para frente.
     *
     * @return String contendo os elementos da lista de trás para frente
     */
    public String toStringBackToFront() {
        Node aux = trailer.prev;
        String nodosString = "";

        while (aux != header) {
            nodosString = nodosString + aux.element;
            if (aux.prev != header) {
                nodosString += " , "; //recebem o valor deles e uma virgula
            }
            aux = aux.prev;
        }
        return nodosString;
    }

    /**
     * Método que percorre a lista e retira elementos repetidos,
     * deixando apenas uma ocorrência de cada elemento.
     */
    public void unique() {
        Node aux = header.next; //cria um nodo para ercorre a lista
        while (aux != trailer) { //cria um while para percorre a lista
            Node atual = aux.next; //variavel para guardar a informação do proximo nodo de aux para ele ser removido com segurança
            while (atual != trailer) { //percorre a lista da segunda posição adiante
                if (aux.element.equals(atual.element)) {//compara se o primeiro elemento e todos os outros são iguais, depois o segundo... etc
                    Node prox = atual.next; //cria uma variavel para remove o atual com segurança
                    //remove
                    atual.prev.next = atual.next; 
                    atual.next.prev = atual.prev;
                    
                    count--; //decrementa o count
                    atual = prox; //anda pela lista e remove novamente se for necessario
                }else{
                    atual = atual.next; //atual anda pela lista
                }  
            }
            aux = aux.next; //aux anda pela lista
        }
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
        Node aux = header.next;

        while (aux != trailer) {
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
        Node aux = header.next; //variavel para percorrer a lista
        int countComeco = count; //guarda o count do começo
        while (aux != trailer) { //percorre a lista
            Node atual = aux.next; //guarda o aux.next para remover o nodo com segurança
            if ((aux.element % 2 == 0)) { //verifica se a lista possui elementos pares
                //remove e decrementa o count
               aux.prev.next = aux.next; 
                aux.next.prev = aux.prev;
                count--;
            }
            aux = atual; //anda na lista
            
        }
        if (count ==countComeco) { //se o count não mudou é porque ninguem foir removido, retorna false
            return false;
        }
        return true;
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
        Node aux = header.next;
        Node aux2 = outra.header.next;

        //percorrer qualquer uma das listas, já que o tamanho delas é o mesmo
        while (aux != trailer) {
            if (!(aux.element.equals(aux2.element))) {
                return false;
            }
            aux = aux.next;
            aux2 = aux2.next;
        }
        return true;
    }
}