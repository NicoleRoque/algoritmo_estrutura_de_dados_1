public class AppDoubleLinkedListOfInteger {
    public static void main(String[] args) {
        DoubleLinkedListOfInteger listaDupla = new DoubleLinkedListOfInteger();
        DoubleLinkedListOfInteger listaDupla2 = new DoubleLinkedListOfInteger();
        
        System.out.println("As duas listas são iguais " + listaDupla.equals(listaDupla2));
        System.out.println("Quantas vezes um determinado número aparece na lista " + listaDupla.countOccurrences(0));
        listaDupla.clear(); //limpar os elementos da lista 
        System.out.println("A lista esta vazia? " + listaDupla.isEmpty());
        System.out.println( "A quantidade de elementos na lista é:  " + listaDupla.size());
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

