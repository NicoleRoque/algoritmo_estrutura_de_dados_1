import java.util.LinkedList;

/**
 * Classe de arvore binaria de pesquisa de numeros inteiros.
 */
public class BinarySearchTreeOfInteger {

    private static final class Node { //classe nodo, ela é final porque não pode ser herdada

        public Node father; //nodo pai
        public Node left; //filho da esquerda
        public Node right; //filho da direita
        public Integer element; //elemento de dentro do nodo

        public Node(Integer element) { //metodo construtor da classe nodo, inicializa os elementos com null
            this.father = null;
            this.left = null;
            this.right = null;
            this.element = element;
        }
    }

    // Atributos
    private int count; // contagem do número de nodos
    private Node root; // referência para o nodo raiz

    /**
     * Metodo construtor.
     */
    public BinarySearchTreeOfInteger() {//testar
        // Inicializa a árvore, o this serve para se referir ao objeto atual que esta referenciando o método construtor 
        this.count = 0;
        this.root = null;
    }

    /**
     * Remove todos os elementos da arvore.
     */
    public void clear() {//testar
       count = 0;
       root = null;

    }

    /**
     * Verifica se a arvore esta vazia ou nao.
     * @return true se a arvore esta vazia e false caso contrario
     */
    public boolean isEmpty() {//testar
        // Verifica se a raiz é nula, se for retorna true 
        return (root == null);
    }

    /**
     * Retorna o total de elementos da arvore.
     * @return quantidade de elementos
     */
    public int size() { //testar
        // Retorna a quantidade de nodos
        return count;
    }

    /**
     * Retorna o elemento armazenado na raiz da arvore.
     * @return elemento da raiz
     */
    public Integer getRoot() {//testar
        // Verifica se a árvore está vazia
        if (isEmpty()) {
            throw IllegalArgumentException ("A raiz esta vazia");
        }
        else
        // Retorna o elemento da raiz
        return root.element;
    }

    // obj1.compareTo(obj2)
    // se obj1 == obj2, retorna 0
    // se obj1 > obj2, retorna um numero maior que 0
    // se obj1 < obj2, retorna um numero menor que 0

    /**
     * Insere um elemento na arvore de forma  recursiva.
     * @param element elemento a ser inserido
     */
    public void add(Integer element) {
        this.root = addRec(this.root, element);
    }

    /**
     * Insere um elemento na arvore de forma recursiva.
     * @param element elemento a ser inserido
     */
    public Node addRec(Node n, Integer element) {
        // Se o nó atual for nulo, encontramos o lugar vazio!
        // Criamos o novo nó e incrementamos o contador aqui.
        if(n == null){
            count++;
             return new Node(element);
    }
         // 2. PASSO RECURSIVO: Compara com o nó ATUAL 'n'
        else if(element > root.element){
             // Vai para a direita e conecta o resultado de volta no lado direito
            n.right = addRec(n.right, element);;
        }
        else if (element < root.element){
            // Vai para a esquerda e conecta o resultado de volta no lado esquerdo
            n.left = addRec(n.left, element);;
        }

        // Se element == n.element, não faz nada
         // Retorna o próprio nó 'n' para manter a árvore conectada
        return n;
    }

    /**
     * Retorna o valor armazenado no filho esquerdo do nodo
     * que contem o elemento passado por parametro.
     * @param element a ser localizado na arvore
     * @return valor do filho esquerdo do nodo correspondente
     * ao elemento, ou null caso o nodo nao possua filho esquerdo
     */
    public Integer getLeft(Integer element) {
        // Localiza o nodo que contém o elemento
        // Verifica se possui filho esquerdo
        return null;
    }

    /**
     * Retorna o valor armazenado no filho direito do nodo
     * que contem o elemento passado por parametro.
     * @param element a ser localizado na arvore
     * @return valor do filho direito do nodo correspondente
     * ao elemento, ou null caso o nodo nao possua filho direito
     */
    public Integer getRight(Integer element) {
        // Localiza o nodo que contém o elemento
        // Verifica se possui filho direito
        return null;
    }

    /**
     * Retorna o valor armazenado no pai do nodo que contem
     * o elemento passado por parametro.
     * @param element a ser localizado na arvore
     * @return valor do pai do nodo correspondente ao elemento,
     * ou null caso o nodo nao possua pai
     */
    public Integer getParent(Integer element) {
        // Localiza o nodo que contém o elemento
        // Verifica se possui pai
        return null;
    }

    /**
     * Verifica se o elemento informado está presente na árvore.
     * @param element elemento a ser procurado
     * @return true se o elemento estiver presente na arvore e
     * false caso contrário
     */
    public boolean contains(Integer element) {
        // Procura o elemento na árvore
        return false;
    }

    // Procura recursivamente pelo nodo que contem o elemento
    // informado, a partir do nodo alvo especificado
    private Node searchNodeRef(Integer element, Node target) {
        // Compara o elemento com o nodo atual
        // Continua a busca pela esquerda ou direita
        return null;
    }

    /**
     * Remove da Arvore o nodo que contem o elemento informado.
     * @param element elemento a ser removido da Arvore
     * @return true se o elemento foi removido com sucesso e
     * false caso o elemento nao esteja presente na arvore
     */
    public boolean remove(Integer element) {
        // Localiza o nodo
        // Trata os casos de remoção
        // Atualiza as referências e o contador
        return false;
    }

    // Retorna o menor elemento da subarvore do nodo
    // passado por parametro.
    private Node smallest(Node n) {
        // Caminha pelos filhos esquerdos
        return null;
    }

    /**
     * Substitui o elemento armazenado em um nodo da arvore.
     * @param old elemento atualmente armazenado no nodo
     * @param element novo elemento que sera armazenado
     * @return elemento anteriormente armazenado no nodo,
     * ou null caso o elemento informado nao seja encontrado
     */
    public Integer set(Integer old, Integer element) {
        // Localiza o nodo
        // Substitui o elemento
        return null;
    }

    /**
     * Verifica se o nodo que contem o elemento informado eh
     * um nodo externo (folha), ou seja, nao possui filhos.
     * @param element elemento a ser localizado na arvore
     * @return true se o nodo for externo e false caso contrario
     */
    public boolean isExternal(int element) {
        // Localiza o nodo
        // Verifica se não possui filhos
        return false;
    }

    /**
     * Verifica se o nodo que contem o elemento informado eh
     * um nodo interno (galho).
     * @param element elemento a ser localizado na arvore
     * @return true se o nodo for interno e false caso contrario
     */
    public boolean isInternal(int element) {
        // Localiza o nodo
        // Verifica se possui pelo menos um filho
        return false;
    }

    /**
     * Retorna uma lista com todos os elementos da arvore na ordem do
     * caminhamento pre-fixado.
     * @return lista com todos os elementos da arvore.
     */
    public LinkedList<Integer> positionsPre() {
        // Visita a raiz
        // Visita a subarvore da esquerda
        // Visita a subarvore da direita
        return null;
    }

    private void positionsPreAux(Node n, LinkedList<Integer> lista) {
        // Visita a raiz
        // Visita a subarvore da esquerda
        // Visita a subarvore da direita
    }

    /**
     * Retorna uma lista com todos os elementos da arvore na ordem do
     * caminhamento pos-fixado.
     * @return lista com todos os elementos da arvore.
     */
    public LinkedList<Integer> positionsPos() {
        // Visita a subarvore da esquerda
        // Visita a subarvore da direita
        // Visita a raiz
        return null;
    }

    private void positionsPosAux(Node n, LinkedList<Integer> lista) {
        // Visita a subarvore da esquerda
        // Visita a subarvore da direita
        // Visita a raiz
    }

    /**
     * Retorna uma lista com todos os elementos da arvore na ordem do
     * caminhamento central.
     * @return lista com todos os elementos da arvore.
     */
    public LinkedList<Integer> positionsCentral() {
        // Visita a subarvore da esquerda
        // Visita a raiz
        // Visita a subarvore da direita
        return null;
    }

    private void positionsCentralAux(Node n, LinkedList<Integer> lista) {
        // Visita a subarvore da esquerda
        // Visita a raiz
        // Visita a subarvore da direita
    }

    /**
     * Retorna uma lista com todos os elementos da arvore na ordem do
     * caminhamento em largura (por niveis).
     * @return lista com todos os elementos da arvore.
     */
    public LinkedList<Integer> positionsWidth() {
        // Instancia a lista
        // Instancia a fila
        // Coloca a raiz na fila
        // Enquanto a fila não estiver vazia:
        //   Retira um nodo
        //   Visita o nodo
        //   Coloca os filhos na fila
        return null;
    }

    /**
     * Retorna uma string com todos os elementos da arvore na ordem do
     * caminhamento central.
     * @return string com todos os elementos da arvore.
     */
    public String strTraversalCentral() {
        // Chama o método auxiliar
        return null;
    }

    private String strTraversalCentral(Node n) {
        // Visita a subarvore da esquerda
        // Visita a raiz
        // Visita a subarvore da direita
        return null;
    }

    // ============================================================
    // MÉTODOS SOLICITADOS NA QUESTÃO
    // ============================================================

    /**
     * Retorna o maior elemento armazenado na árvore.
     * @return maior elemento da árvore
     */
    public Integer getBiggest() {
        // Localiza o maior nodo da árvore
        // O maior elemento está no caminho mais à direita
        return null;
    }

    /**
     * Retorna a quantidade de folhas da árvore.
     * @return quantidade de folhas
     */
    public int countLeaves() {
        // Percorre a árvore
        // Conta os nodos que não possuem filhos
        return 0;
    }

    /**
     * Retorna uma cópia da árvore.
     * @return cópia da árvore
     */
    public BinarySearchTreeOfInteger clone() {
        // Cria uma nova árvore
        // Percorre a árvore atual
        // Insere os mesmos elementos na nova árvore
        return null;
    }

    /**
     * Verifica se duas árvores possuem a mesma estrutura
     * e os mesmos elementos nas mesmas posições.
     * @param outraABP árvore a ser comparada
     * @return true se as árvores forem iguais e false caso contrário
     */
    public boolean equals(BinarySearchTreeOfInteger outraABP) {
        // Compara as estruturas das árvores
        // Compara os elementos de cada posição
        return false;
    }

    /**
     * Verifica se a árvore é própria.
     * Uma árvore própria possui todos os seus nodos com 0 ou 2 filhos.
     * @return true se a árvore for própria e false caso contrário
     */
    public boolean isPropria() {
        // Percorre a árvore
        // Verifica se cada nodo possui 0 ou 2 filhos
        return false;
    }
}