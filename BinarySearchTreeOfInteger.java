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

}