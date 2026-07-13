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
        //faz todos os elementos receberem nulo
        this.head = null;
        this.tail = null;
        this.count = 0;
    }

    /**
     * Retorna true se a lista nao contem elementos.
     * @return true se a lista nao contem elementos
     */
    public boolean isEmpty() {
        if (count == 0  && head == null) {
            return true;
        }
        return false;
    }

    /**
     * Retorna o numero de elementos da lista.
     * @return o numero de elementos da lista
     */
    public int size() {
        return count;
    }

    /**
     * Esvazia a lista.
     */
    public void clear() {
       //copia tudo do construtor
       this.head = null;
       this.tail = null;
       this.count = 0;
    }

    /**
     * Adiciona um elemento ao final da lista.
     * @param element elemento a ser adicionado ao final da lista
     */
    public void add(Integer element) {
        //cria um nodo com o valor do elemento
        Node newNode = new Node(element);
        //verifica se a lista esta vazia 
        if (count == 0) {
            head = newNode;
        }
        else{
            tail.next = newNode; //o proximo valor após o ultimo recebe o novo nodo
        }
        tail = newNode; //a ultima posição passa a ser o novo nodo 
        count++;
    }

    /**
     * Retorna o elemento de uma determinada posicao da lista.
     * @param index a posição da lista
     * @return o elemento da posicao especificada
     * @throws IndexOutOfBoundsException se (index < 0 || index >= size())
     */
    public Integer get(int index) {
        //verifica se o index é válido
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException(" Este index é invalido ");
        }
        //cria uma variavel que recebe o valor da primeira posição
        Node currentNode = this.head;
        for (int i = 0; i < index; i++) { //o for percorre até uma posição antes do index
            currentNode = currentNode.next; //anda a lista, posição por posição
        }

        return currentNode.element; //quando chegar no index, passa o elemento 
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        Node aux = head;

        while (aux != null) {
            s.append(aux.element.toString());
            s.append("\n");
            aux = aux.next;
        }

        return s.toString();
    } 

    ////////////////////////////////////////////////////////////////

    /**
     * Retorna true se a lista contem o elemento especificado.
     * @param element o elemento a ser testado
     * @return true se a lista contem o elemento especificado
     */
    public boolean contains(Integer element) {
        //cria uma variavel auxliar com referencia para o primeiro elemento
        Node auxiliaryNode = this.head;

        while(auxiliaryNode != null){
            if (auxiliaryNode.element.equals(element)) {
                return true;
            }
            auxiliaryNode = auxiliaryNode.next;
        }
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
        Node auxiliaryNode = this.head; //variavel auxiliar que tem a referencia pro primeiro elemento

        //usa o for pra chegar até a posição anterior do index
        for (int i = 0; i < index; i++) { 
            auxiliaryNode = auxiliaryNode.next; //caminha na lista 
        }
        Node previousNode = new Node(auxiliaryNode.element); //variavel que guarda o elemento a ser removido 
        auxiliaryNode.element = element; //troca o elemento da posição do index pelo elemento passado por parametro
        
        return previousNode.element; //retorna o elemento antigo
    }

    /**
     * Insere um elemento em uma determinada posicao da lista.
     * @param index a posicao da lista onde o elemento sera inserido
     * @param element elemento a ser inserido
     * @throws IndexOutOfBoundsException se (index < 0 || index > size())
     */
    public void add(int index, Integer element) {
        //verifica se o index é válido
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException("Posição do index é inválido");
        }
        Node auxiliaryNode = this.head; //variavel auxiliar que tem a referencia pro primeiro elemento
        Node newNode = new Node(element); //variavel que guarda o valor do elemento
        for (int i = 0; i < index; i++) {
            auxiliaryNode = auxiliaryNode.next; //percorre a lista
        }
        newNode.next = auxiliaryNode.next; //o nodo criado recebe a referencia dos proximos elementos do nodo auxiliar que tem os index
        auxiliaryNode.next = newNode; //o proximo valor após o ultimo recebe o novo nodo
        auxiliaryNode = newNode; //o valor do index passa a ser o novo nodo
        count++;
    }

    /**
     * Insere um elemento na lista mantendo a ordem crescente.
     * @param element elemento a ser inserido
     */
    public void addIncreasingOrder(Integer element){
        //cria um nodo que vai guardar o elemento
        Node mainNode = new Node(element);

        //se a lista estiver vazia
        if (head == null) {
            head = mainNode;
            tail = mainNode;
            count++;
            return;
        } 
        //para inserir na primeira posição
        if (head.element >= element) {
            mainNode.next = head;
            head = mainNode;
            count++;
            return;
        }

        //cria uma variavel para antes e depois do valor que iremos inserir 
        Node previousNode = head;
        Node  afterNode = head.next;
        
        //while para percorre a lista
        while (afterNode != null && afterNode.element < element) {
            previousNode = afterNode; //o nodo anterior recebe o novo valor do nodo que percorre a lista a cada repetição do while
            afterNode = afterNode.next; //o nodo percorre a lista
        }

        mainNode.next = afterNode; //o proximo do nodo principal recebe o nodo após ele 
        previousNode.next = mainNode; //o proximo do anterior do nodo recebe o nodo
        count++;
        
    }

    /**
     * Remove a primeira ocorrencia do elemento na lista, se estiver presente.
     * @param element o elemento a ser removido
     * @return true se a lista contem o elemento especificado
     */
    public boolean remove(Integer element) {
        if (head.element.equals(element)) {
            head = head.next;
            count--;
            return true;
        }
       Node aux = this.head;
       Node ant = null;
       while (aux != null) {
        if (aux.element.equals(element)) {
            ant.next = aux.next;
            count--;
            return true;
        }
        ant = aux;
        aux = aux.next;
       }
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
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException ("Posição de index invalida");
        }
        Node removedNode = new Node(get(index));
        Node aux = this.head;
        if (index == 0) {
           head = head.next;
            
        }
        else{
            if (index == count-1) {
                for (int i = 0; i < count-2; i++) { //a lista percorre até o penultimo elemento
                    aux = aux.next; //o aux.next vai até o ultimo
                    }
                    aux.next = null; //o ultimo elemento recebe null
                    tail = aux; //e o tail recebe o penultimo elemento
                    
            }

            else{
                Node anterior = null; //referencia para o nodo anterior ao removido 
                int posicao = 0; //posição que usaremos para comparar com o index
                while (aux != null) { //percorre a lista até o ultimo elemento
                    if (posicao == index) { //verifica se a posição é igual ao index
                        anterior.next = aux.next; //se for o proximo do anterior recebe o proximo do pós, pulando a referencia do removido
                    }
                    anterior = aux; //enquanto não achou o anterior recebe o valor do aux
                    aux = aux.next; //e o aux recebe um novo valor andando sobre a lista
                    posicao++;
                }
            }

        }

        count--; // decerementa o count
        return removedNode.element; 
    }

    /**
     * Retorna o indice da primeira ocorrencia do elemento na lista, ou -1 se a
     * lista nao contem o elemento.
     * @param element o elemento a ser buscado
     * @return o indice da primeira ocorrencia do elemento na lista, ou -1 se a
     * lista nao contem o elemento
     */
    public int indexOf(Integer element) {
        Node auxNode = this.head; //nodo que percorre a lista

        for (int i = 0; i < count; i++) { //percorre toda a lista
            if (auxNode.element.equals(element)) { //verifica se o elemento naquela posição é igual ao elemento que estou procurando
                return i; //se for, retorna a posição
            }
            auxNode = auxNode.next; // se não encontrar, caminha na lista 
        }
        return -1;
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
