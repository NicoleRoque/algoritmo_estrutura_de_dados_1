public class AppQueueArray {
    public static void main(String[] args) {
        QueueArray fila = new QueueArray();
         QueueArray fila2Array  = new QueueArray();


        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);
        fila.enqueue(40);

         fila.enqueue(100);
        fila.enqueue(200);
        fila.enqueue(300);
        fila.enqueue(400);

        System.out.println("Retorna uma lista correspondente a união de duas filas " + fila.concatenarFilas(fila, fila2Array));//ARRUMAR

      /*System.out.println("retorna uma fila igual a que ela copiou sem mudar a original " + fila.clone());
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
