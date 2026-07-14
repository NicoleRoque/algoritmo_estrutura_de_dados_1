import java.util.ArrayList;
import java.util.List;

/**
 * Implementação de uma fila utilizando arranjo (vetor).
 *
 * @author Nicole Ernesto Roque
 */
public class QueueArray {

    // Atributos
    private Integer fila[];   // Armazena os elementos da fila
    private int count;        // Quantidade de elementos da fila
    private int primeiro;     // Índice do primeiro elemento
    private int ultimo;       // Índice da próxima posição disponível

    /**
     * Constrói uma fila com capacidade inicial de 20 elementos.
     */
    public QueueArray() {
       this.fila = new Integer[20];
       this.count = 0;
       this.primeiro = primeiro;
       this.ultimo = ultimo;
    }

    /**
     * Insere um elemento no final da fila.
     *
     * @param element Elemento a ser inserido.
     */
    public void enqueue(Integer element) {
         //verificar se a fila está cheia 
        if (count ==fila.length) {
            throw new RuntimeException("A fila já está cheia, não sera possível inserir");
        }
        //insere na ultima posição
        fila[ultimo] = element;
        //atualiza a ultima posição da fila 
        ultimo = (ultimo + 1) % fila.length;
        // Por exemplo: fila[] eh um vetor de 5 posicoes, indice 0 a 4
        // - Se ultimo estava na posicao 2: (2+1)/5, resto da divisao de inteiros eh 3
        // - Se ultimo estava na posicao 4: (4+1)/5, resto da divisao de inteiros eh 0 o ultimo retorna para o primeiro, a fila é circular

        //ataliza o count
        count++;
    }

    /**
     * Remove e retorna o primeiro elemento da fila.
     *
     * @return Elemento removido da fila.
     */
    public Integer dequeue() {
        if (count == 0 ){
            throw new RuntimeException("A fila esta vazia!");
        }
        //guarda o elemento que será removido
        Integer elementoRemovido = fila[primeiro];
        fila[primeiro] = null;
        primeiro = (primeiro + 1) % fila.length;
        //atualiza o count
        count--;
        return elementoRemovido;
    }

    /**
     * Retorna o primeiro elemento da fila sem removê-lo.
     *
     * @return Primeiro elemento da fila.
     */
    public Integer head() {
        return fila[primeiro];
    }

    /**
     * Retorna a quantidade de elementos presentes na fila.
     *
     * @return Número de elementos da fila.
     */
    public int size() {
        return count;
    }

    /**
     * Verifica se a fila está vazia.
     *
     * @return true se a fila estiver vazia; false caso contrário.
     */
    public boolean isEmpty() {
        if (count == 0) {
            return true;
        }
        return false;
    }

    /**
     * Remove todos os elementos da fila.
     */
    public void clear() {
        this.fila = new Integer[20];
        this.count = 0;
        this.primeiro = primeiro;
        this.ultimo = ultimo;
    }

    /**
     * Cria e retorna uma cópia da fila sem alterar a fila original.
     *
     * @return Uma nova fila contendo os mesmos elementos.
     */
    @Override
    public QueueArray clone() {
        QueueArray fila2 = new QueueArray(); //segunda fila
        Integer elemento; //guarda os elementos que serão removidos e incluido no for
        int tamanho = count; //guarda o valor de count, já que ele irá mudar a cada interação do for
        for (int i = 0; i <tamanho; i++){ //percorre a fila
            elemento = this.dequeue(); //remove o elemento e guarda na variavel
            this.enqueue(elemento); //insere na fila original novamente
            fila2.enqueue(elemento); //insere na fila 2
            
        }
        return fila2; //retorna a segunda fila
    }

    /**
     * Copia todos os elementos da fila recebida para o final de uma lista,
     * preservando o conteúdo original da fila.
     *
     * @param fila Fila de origem.
     * @return Lista contendo os elementos copiados.
     */
    public static List<Integer> copiarParaLista(QueueArray fila) {
        List<Integer> lista = new ArrayList<Integer>();
        int tamanho = fila.size();
        Integer elemento;
        for (int i = 0; i < tamanho; i++) {
            elemento = fila.dequeue();
            fila.enqueue(elemento);
            lista.add(elemento);
        }
        return lista;
    }

    /**
     * Concatena os elementos de duas filas em uma única lista,
     * preservando o conteúdo original das filas.
     *
     * @param fila1 Primeira fila.
     * @param fila2 Segunda fila.
     * @return Lista contendo a concatenação das duas filas.
     */
    public static List<Integer> concatenarFilas(QueueArray fila1, QueueArray fila2) {//ARRUMAR
        List<Integer> lista = new ArrayList<Integer>();
        int tamanho1 = fila1.count;
        Integer elemento1;
         for (int i = 0; i < tamanho1; i++) {
            elemento1= fila1.dequeue();
            fila1.enqueue(elemento1);
            lista.add(elemento1);
        }
        int tamanho2 = fila2.count;
        Integer elemento2;
        for (int i = 0; i < tamanho2; i++) {
            elemento2= fila2.dequeue();
            fila2.enqueue(elemento2);
            lista.add(elemento2);
        }

        return lista;
    }

    /**
     * Copia todos os elementos de uma pilha para uma fila,
     * preservando o conteúdo e a ordem original da pilha.
     *
     * @param fila Fila de destino.
     * @param pilha Pilha de origem.
     */
    public static void copiaParaFila(QueueArray fila, StackLinked pilha) {

    }

    @Override
public String toString() {
    String s = "[";
    int pos = primeiro;

    for (int i = 0; i < count; i++) {
        s += fila[pos];

        if (i < count - 1) {
            s += ", ";
        }

        pos = (pos + 1) % fila.length;
    }

    s += "]";
    return s;
}
}
