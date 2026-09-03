import java.util.LinkedList;

public class BinarySearchTreeOfInteger{
    //final significa que o elemento é constante e não pode ser alterado
    //é o static cria apenas uma cópia da variável na memoria, se um objeto altera o valor, todos os outros veem a mudança.
    private static final class Node{
        public Node father;
        public Node left;
        public Node right;
        public Integer element;

        public Node(Integer element){
            father = null;
            left = null;
            right = null;
            this.element = element;
        }
    }

    private Integer count; //contador 
    private Node root;  //raiz da arvore 

    /**
     * Metodo construtor.
     */
    public BinarySearchTreeOfInteger() {
        count = 0;
        root = null;
    }

    /**
     * Remove todos os elementos da arvore.
     */
    public void clear() {
        count = 0;
        root = null;
    }

    /**
     * Verifica se a arvore esta vazia ou nao.
     * @return true se a arvore esta vazia e false caso contrario
     */
    public boolean isEmpty() {
        return (root == null);
    }

     /**
     * Retorna o total de elementos da arvore.
     */
    public int size() {
        return count;
    }

    /**
     * Retorna o elemento armazenado na raiz da arvore.
     * Lanca excessao se a arvore estiver vazia.
     * @return elemento da raiz
     */
    public Integer getRoot() {
        if (root == null) {
         throw new IllegalArgumentExcepcion("A arvore está vazia ");
        }
        return root.element;
    }

    // Procura recursivamente pelo nodo que contem o elemento 
    // informado, a partir do nodo alvo especificado
    private Node searchNodeRef(Integer element, Node target) {
        Node noAtual = root;
        if (target == null) {
            return null;
        }
        else if (target.element == element) {
            return target;
        }

        
        return null;
    }
    
    /**
     * Retorna o valor armazenado no filho esquerdo do nodo 
     * que contem o elemento passado por parametro.
     * @param element a ser localizado na arvore
     * @return valor do filho esquerdo do nodo correspondente 
     * ao elemento, ou null caso o nodo nao possua filho esquerdo
     * @throws NoSuchElementException() se element nao for 
     * encontrado na arvore
     */
    public Integer getLeft(Integer element) {

        return null;
    }

     /**
     * Retorna o valor armazenado no filho direito do nodo 
     * que contem o elemento passado por parametro.
     * @param element a ser localizado na arvore
     * @return valor do filho direito do nodo correspondente 
     * ao elemento, ou null caso o nodo nao possua filho direito
     * @throws NoSuchElementException() se element nao for 
     * encontrado na arvore
     */    
    public Integer getRight(Integer element) {
        return null;
    }

    /**
     * Retorna o valor armazenado no pai do nodo que contem
     * o elemento passado por parametro.
     * @param element a ser localizado na arvore
     * @return valor do pai do nodo correspondente ao elemento, 
     * ou null caso o nodo nao possua pai
     * @throws NoSuchElementException() se element nao for 
     * encontrado na arvore
     */    
    public Integer getParent(Integer element) {
        return null;
    }
}