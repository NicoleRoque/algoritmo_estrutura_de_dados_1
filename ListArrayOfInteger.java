
import java.util.Arrays;
// Implementação de uma lista utilizando vetor
public class ListArrayOfInteger {
    //atributos 
    
    private Integer [] vetor;
    private int count;
   

    /**
     * Construtor da lista.
     * @param size tamanho inicial do vetor que armazenará os elementos
     */
    public ListArrayOfInteger(int size) {
        this.vetor = new Integer[size];
    }

    /**
     * Retorna a quantidade de elementos armazenados na lista.
     * @return tamanho total da lista
     */
    public int size(){
        return vetor.length;
    }

    /** 
     * Retorna a quantidade de elementos inclusos na lista.
    * @return números de elementos inseridos na lista 
    */
    public int count(){
        return this.count;
    }

    /**
     * Adiciona um elemento ao final da lista.
     * @param element elemento a ser adicionado
     */
    public void add(Integer element){
        if(count < vetor.length){ //verifica se tem espaço na lista 
          for(int i = 0; i<vetor.length; i++){ //percorre todo vetor
            if(vetor[i] == null){ //verifica se existe uma posição nula
                vetor[i] = element; //se existir adiciona o elemento
                count++; //incrementa o count
                break; //para o caminhamento do vetor, garante que o elemento seja adicionado apenas uma vez
            }
          }
        }
    }

    /**
     * Adiciona um elemento em uma posição específica da lista.
     * Os elementos a partir dessa posição são deslocados para a direita.
     * @param index posição onde o elemento será inserido
     * @param element elemento a ser inserido
     * @throws IndexOutOfBoundsException se (index < 0 || index > size())
     */
    public void add(int index, Integer element){
        if (index < 0 || index >= size()) { //index invalido
            throw new IndexOutOfBoundsException("Posição do index invalida "); //lança uma exceção
        }
        if (vetor[index] != null) { //se a posição que eu estou tentando inserir esta ocupada 
            throw new IllegalStateException(" Posição já ocupada, não é possível inserir "); //lança a exceção
        }
        vetor[index] = element; //adiciona o elemento na posição do index
        count++; //incrementa o count

    }

    /**
     * Retorna o elemento armazenado em uma determinada posição da lista.
     * @param index posição do elemento
     * @return o elemento armazenado na posição especificada
     * @throws IndexOutOfBoundsException se (index < 0 || index >= size())
     */
    public Integer get(int index){
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException(" Posição do index invalida");
        }
        return vetor[index];
    }

    /**
     * Substitui o elemento armazenado em uma determinada posição da lista.
     * @param index posição do elemento
     * @param element novo elemento
     * @return o elemento anteriormente armazenado na posição
     * @throws IndexOutOfBoundsException se (index < 0 || index >= size())
     */
    public Integer set(int index, Integer element){
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException(" Posição do index invalida");
        }
        Integer elementOld = vetor[index]; //cria uma variavel que vai receber o elemento anterior
        vetor[index] = element; //coloca o valor novo na posição
        return elementOld;
    }

    /**
     * Remove a primeira ocorrência do elemento informado.
     * @param element elemento a ser removido
     * @return true se o elemento foi encontrado e removido, false caso contrário
     */
    public boolean remove(Integer element){
        if (element == null) {
            throw new NullPointerException(" Este elemento não existe no vetor, e por isso, não pode ser removido ");
        }
        return false;
    }

    /**
     * Remove o elemento de uma determinada posição da lista.
     * @param index posição do elemento
     * @return o elemento removido
     * @throws IndexOutOfBoundsException se (index < 0 || index >= size())
     */
    public Integer removeByIndex(int index){
        return null;
    }

    /**
     * Verifica se a lista está vazia.
     * @return true se a lista não possui elementos, false caso contrário
     */
    public boolean isEmpty(){
        if (count == 0) { //se o count for zero a lista esta vazia
            return true; //retorna verdadeiro
        }
        return false;
    }

    /**
     * Verifica se a lista contém um determinado elemento.
     * @param element elemento a ser procurado
     * @return true se o elemento estiver na lista, false caso contrário
     */
    public boolean contains(Integer element){
        for(int i = 0; i < vetor.length; i++){
            if (vetor[i].equals(element)) {
                return true;
            }
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
     * Retorna o índice da primeira ocorrência de um elemento na lista.
     * @param element elemento a ser procurado
     * @return índice do elemento ou -1 caso não seja encontrado
     */
    public int indexOf(Integer element){
        for(int i = 0; i < vetor.length; i++){
            if (vetor[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Remove todos os elementos da lista.
     */
    public void clear(){

    }

    /**
     * Retorna um arranjo contendo os elementos entre duas posições da lista.
     * @param fromIndex posição inicial (inclusiva)
     * @param toIndex posição final (exclusiva)
     * @return um arranjo contendo os elementos do intervalo especificado
     * @throws IndexOutOfBoundsException se (fromIndex < 0 || toIndex > size())
     * @throws IllegalArgumentException se (fromIndex > toIndex)
     */
    public Integer[] subList(int fromIndex, int toIndex){
        return null;
    }

    /**
     * Inverte a ordem dos elementos armazenados na lista.
     */
    public void reverse(){
        int inicio = 0; //cria uma variavel para o inicio
        int fim = vetor.length - 1; //cria uma variavel para o fim
        while (inicio < fim) { //repete quanto o inicio for menor que o mfin
            int aux = vetor[inicio];
            vetor[inicio] = vetor[fim];
            vetor[fim] = aux;

            inicio++; //incrementa o começo
            fim--; //decrmenta o  final
        }
    }

    /**
     * Conta quantas vezes um determinado elemento aparece na lista.
     * @param element elemento a ser contado
     * @return quantidade de ocorrências do elemento
     */
    public int countOccurrences(int element){
        int contador = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].equals(element)) {
                contador ++;
            }
        }
        return contador;
    }

    /**
     * Insere um elemento na lista mantendo a ordem crescente.
     * @param element elemento a ser inserido
     */
    public void addIncreasingOrder(Integer element){

    }

    /**
     * Retorna uma nova lista contendo apenas os elementos comuns entre duas listas.
     * @param outraLista lista utilizada para realizar a intersecção
     * @return uma nova lista contendo a intersecção das listas
     */
    public ListArrayOfInteger intersec(ListArrayOfInteger outraLista){
        return null;
    }

    /**
     * Remove todas as ocorrências repetidas da lista,
     * mantendo apenas uma ocorrência de cada elemento.
     */
    public void unique(){

    }

    /**
     * Retorna uma nova lista contendo os elementos de duas listas
     * em ordem crescente.
     * @param outraLista segunda lista a ser mesclada
     * @return uma nova lista com os elementos das duas listas ordenados
     */
    public ListArrayOfInteger merge(ListArrayOfInteger outraLista){
       
        return null;
    }

    /**
     * Retorna uma representação da lista em formato de String.
     * @return String contendo todos os elementos da lista
     */
    @Override
    public String toString(){
        return "Elementos da lista  " + Arrays.toString(vetor) ;
    }
}