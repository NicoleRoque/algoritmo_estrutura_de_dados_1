// Arquivo: App.java
public class AppBinarySearchTreeOfInteger {
    public static void main(String[] args) {
        BinarySearchTreeOfInteger arvore = new BinarySearchTreeOfInteger();

        System.out.println("--- Iniciando Teste da Árvore ---");

        // 1. Inserindo elementos bagunçados
        System.out.println("Inserindo: 50, 30, 70, 20, 40, 60, 80");
        arvore.add(50);
        arvore.add(30);
        arvore.add(70);
        arvore.add(20);
        arvore.add(40);
        arvore.add(60);
      //  arvore.add(80);

        // 2. Testando tentativa de duplicata (não deve alterar o count se sua lógica bloqueia)
        System.out.println("Tentando inserir duplicata (50)...");
        arvore.add(50); 

        arvore.exibirEmOrdem();
        
        /*System.out.println(arvore.contains(52));
        System.out.println(arvore.isEmpty());*/

        System.out.println(arvore.isExternal(80));
        System.out.println(arvore.isInternal(80));
        System.out.println(arvore.getBiggest());
        arvore.exibirEmOrdem();


    }
        
}
