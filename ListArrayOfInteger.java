
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
        if (index < 0 || index > size()) { //index invalido
            throw new IndexOutOfBoundsException("Posição do index invalida "); //lança uma exceção
        }
        for (int i = count - 1; i >= index; i--) { //percorre a lista do final até a posição igual ao index, decrementando
            vetor[i + 1] = vetor[i]; //muda os elementos de posição 
        }
        vetor[index] = element; //insere o elemento no local
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
        Integer index = indexOf(element); //cria uma variavel com o index do elemento
        if (index == -1) { //se o elemento for invalido
            return false;  //retorne falso
        }
        for (int i = index; i < count - 1; i++) { //percorre do index até count-1
            vetor[i] = vetor[i + 1]; //todos os elementos andam uma casa pra trás
        }
        vetor[count - 1] = null; //count-1 recebe null
        count--; //decrementa o count
        return true; //retorna verdadeiro
    }

    /**
     * Remove o elemento de uma determinada posição da lista.
     * @param index posição do elemento
     * @return o elemento removido
     * @throws IndexOutOfBoundsException se (index < 0 || index >= size())
     */
    public Integer removeByIndex(int index){
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException(" Posição inválida");
        }
        Integer elementOld = vetor[index]; //guarda o valor do index
        for (int i = index; i < count - 1; i++) { //o for percorre da posição até uma posição antes do count
            vetor[i] = vetor[i + 1]; //os elementos do vetor andam uma casa
        }
        vetor[count - 1] = null; //a ultima posição recebe null
        count--; //decrementa o count
        return elementOld; //retorna o elemento removido
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
        for(int i = 0; i < count; i++){
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
        return containsRecursivoAux(element, 0);
    }

    /**
     * Método auxiliar recursivo utilizado na busca de um elemento.
     * @param element elemento a ser procurado
     * @param i posição atual da busca
     * @return true se o elemento for encontrado, false caso contrário
     */
    private boolean containsRecursivoAux(Integer element, int i){
        if (i == count) {
            return false;
        }

        if(vetor[i].equals(element)){
            return true;
        }

        return containsRecursivoAux(element, i + 1);
        
    }

    /**
     * Retorna o índice da primeira ocorrência de um elemento na lista.
     * @param element elemento a ser procurado
     * @return índice do elemento ou -1 caso não seja encontrado
     */
    public int indexOf(Integer element){
        for(int i = 0; i < count; i++){
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
        for (int i = 0; i < count; i++) {
            vetor[i] = null;
        }
        count = 0;
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
        if (fromIndex < 0 || toIndex > size()) {
            throw new IndexOutOfBoundsException(" O valor dos indexs não são válidos ");
        }
        if (fromIndex > toIndex) {
            throw new IllegalArgumentException(" O index inicial é maior que o final, valores invalidos");
        }

        Integer secondList [] = new Integer[toIndex - fromIndex];
        
        for (int i = 0; i < secondList.length; i++) {
                secondList[i] = vetor[fromIndex];
                fromIndex ++;
        }
        return secondList;
    }

    /**
     * Inverte a ordem dos elementos armazenados na lista.
     */
    public void reverse(){
        int inicio = 0; //cria uma variavel para o inicio
        int fim = count - 1; //cria uma variavel para o fim
        while (inicio < fim) { //repete quanto o inicio for menor que o mfin
            Integer aux = vetor[inicio];
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
        for (int i = 0; i < count; i++) {
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
        if (count == vetor.length) {
            throw new IllegalStateException("A lista está cheia.");
        }
       int posicaoDesejada = 0;
       while (posicaoDesejada < count && vetor[posicaoDesejada] < element) {
            posicaoDesejada++;
       }
       for (int i = count - 1; i >= posicaoDesejada; i--) {
            vetor[i + 1] = vetor [i];
       }
       vetor[posicaoDesejada] = element;
       count++;
    }

    /**
     * Retorna uma nova lista contendo apenas os elementos comuns entre duas listas.
     * @param outraLista lista utilizada para realizar a intersecção
     * @return uma nova lista contendo a intersecção das listas
     */
    public ListArrayOfInteger intersec(ListArrayOfInteger outraLista){ 
        int tamanho;
        if(this.count() > outraLista.count()){
            tamanho = outraLista.count();
        }
        else
            tamanho = this.count();

        ListArrayOfInteger thirdList = new ListArrayOfInteger(tamanho);
        for(int i = 0; i < this.count(); i++){
            if(outraLista.contains(get(i))){
                thirdList.add(get(i));
            }
        }
        return thirdList;
    }

    /**
     * Remove todas as ocorrências repetidas da lista,
     * mantendo apenas uma ocorrência de cada elemento.
     */
    public void unique(){
       int j = 0;
       while(j < count) {
            while(countOccurrences(get(j)) > 1) {
                remove(get(j));
                
            }
        }     
    }

    /**
     * Retorna uma nova lista contendo os elementos de duas listas
     * em ordem crescente.
     * @param outraLista segunda lista a ser mesclada
     * @return uma nova lista com os elementos das duas listas ordenados
     */
    public ListArrayOfInteger merge(ListArrayOfInteger outraLista){
       ListArrayOfInteger thirdList = new ListArrayOfInteger(this.count + outraLista.count);
        for (int i = 0; i < count; i++) {
            thirdList.add(get(i));
        }
        for (int i = 0; i < outraLista.count(); i++) {
            thirdList.add(outraLista.get(i));
        }
        for (int i = 0; i < thirdList.count() - 1; i++) {
            int min = i;

            for (int j = i + 1; j < thirdList.count(); j++) {
                if (thirdList.get(min) > thirdList.get(j) ) {
                    min = j;
                }   
            }
            Integer aux = thirdList.get(i);
            thirdList.set(i,thirdList.get(min));
            thirdList.set(min, aux);
        }
        return thirdList;
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