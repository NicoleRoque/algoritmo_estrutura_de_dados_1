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
        arvore.add(80);

        // 2. Testando tentativa de duplicata (não deve alterar o count se sua lógica bloqueia)
        System.out.println("Tentando inserir duplicata (50)...");
        arvore.add(50); 

        System.out.println("\n--- Resultados ---");

        // 3. Verifica a contagem de elementos
        System.out.println("Total de elementos (esperado: 7): " + arvore.size());

        // 4. Exibe os elementos. Se o resultado for "20 30 40 50 60 70 80", o método funciona!
        System.out.print("Elementos em ordem crescente: ");
        arvore.exibirEmOrdem();
        
        // 5. Verificação visual simplificada
        if (arvore.size() == 7) {
            System.out.println("\n🎉 SUCESSO: O método add está funcionando corretamente!");
        } else {
            System.out.println("\n❌ ERRO: A contagem ou inserção falhou.");
        }
    }
}
