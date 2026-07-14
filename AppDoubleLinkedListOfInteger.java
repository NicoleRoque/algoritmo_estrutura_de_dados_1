import java.util.Arrays;

public class AppDoubleLinkedListOfInteger {
    public static void main(String[] args) {
        DoubleLinkedListOfInteger listaDupla = new DoubleLinkedListOfInteger();
        DoubleLinkedListOfInteger listaDupla2 = new DoubleLinkedListOfInteger();
        listaDupla.add(10);
        listaDupla.add(20);
        listaDupla.add(30);
        listaDupla.add(40);
        listaDupla.add(50);
        listaDupla.add(60);
        listaDupla.add(70);
        //lista 2
        listaDupla2.add(40);
        listaDupla2.add(50);
        listaDupla2.add(60);
        listaDupla2.add(70);

        System.out.println(listaDupla);

        System.out.println("Retorna o elemento que foi trocado na lista " + listaDupla.set(6, 200));//funcionando
        System.out.println("Retorna o elemento de um determinado index: " + listaDupla.get(6));//funcionando
        System.out.println("O elemento esta na posição: " + listaDupla.indexOf(10)); //funcionando
        System.out.println(" Verifica se determinado elemento está na lista " + listaDupla.contains(10)); //funcionando
        System.out.println(java.util.Arrays.toString(listaDupla.subList(3, 5))); //funcionando
        System.out.println("As duas listas são iguais " + listaDupla.equals(listaDupla2)); //funcionando
        System.out.println("Quantas vezes um determinado número aparece na lista " + listaDupla.countOccurrences(10));//arrumar
        listaDupla.clear(); //funcionando
        System.out.println("A lista esta vazia? " + listaDupla.isEmpty()); //funcionando
        System.out.println( "A quantidade de elementos na lista é:  " + listaDupla.size()); //funcionando
        }
            /**
             * Método que recebe duas listas de inteiros por parâmetro, l1 e l2,
             * e retorna o maior valor que aparece simultaneamente nas duas listas.
             * Caso as listas não possuam valores em comum, o método retorna zero.
             * Não podem ser usados os atributos da lista, isto é,
             * apenas os seus métodos podem ser chamados.
             *
             * @param l1 lista a ser verificada
             * @param l2 lista a ser verificada
             * @return Integer maior valor que aparece simultaneamente nas duas listas
             */
            public static Integer getBiggestComunValue(DoubleLinkedListOfInteger l1,
                                                    DoubleLinkedListOfInteger l2) {
                return 0;
            }

            /**
             * Método que recebe uma lista de inteiros por parâmetro e retorna
             * uma cópia desta lista sem elementos repetidos.
             * Caso a lista não possua valores repetidos,
             * o método retorna uma cópia da lista.
             * Não podem ser usados os atributos da lista, isto é,
             * apenas os seus métodos podem ser chamados.
             *
             * @param lista1 lista a ser verificada
             * @return DoubleLinkedListOfInteger lista sem elementos repetidos
             */
            public static DoubleLinkedListOfInteger getUnique(DoubleLinkedListOfInteger lista1) {
                return null;
            }
        
    }

