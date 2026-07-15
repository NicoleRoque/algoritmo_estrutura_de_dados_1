public class AppQueueArray {
    public static void main(String[] args) {
        QueueArray fila = new QueueArray();
         QueueArray fila2  = new QueueArray();
         StackLinked pilha = new StackLinked();


        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.push(40);
        pilha.push(50);

        fila2.enqueue(100);
        fila2.enqueue(200);
        fila2.enqueue(300);
        fila2.enqueue(400);

        fila.copiaParaFila(fila, pilha);//funcionando
        System.out.println(pilha);

      /*System.out.println("Retorna uma lista correspondente a união de duas filas " + fila.concatenarFilas(fila, fila2));//ARRUMAR

        System.out.println("retorna uma fila igual a que ela copiou sem mudar a original " + fila.clone());
        System.out.println("Retorna uma lista copia da fila sem alterar a fila"+ fila.copiarParaLista(fila));

        System.out.println(" Retorna o numero que removeu " + fila.dequeue());
        System.out.println(" Retorna o numero que removeu " + fila.dequeue());

        System.out.println("Retorna o primeiro elemento " + fila.head());

        System.out.println("Retorna o tamanho da fila "  + fila.size());

        System.out.println("Diz se a fila esta ou não vazia " + fila.isEmpty());*/

        //exibe todos os elementos da fila
       System.out.println(fila);
    }
}
