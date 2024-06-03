import java.util.Scanner;

public class terminal {
    public static void main(String[] args) throws Exception {
        CatalogoLivros catalogo = new CatalogoLivros();
        String name, author;
        int publication, price, anoFinal, anoInicial;
        Boolean flag = true;
        System.out.println("Bem-vindo ao gerenciador de catálogo!");
        while (flag) {
            System.out.println("ADICIONAR(1) REMOVER(2) PESQUISA-AUTOR(3) PESQUISA-PUBLICAÇÃO(4) NET-WORTH(5) IMPRIMIR(6) FECHAR(7)");
            Scanner leitorTerminal = new Scanner(System.in);
            int option = leitorTerminal.nextInt();
            try {
                switch (option) {
                    case 1 -> {
                        System.out.println("ADICIONAR");
                        System.out.println("Insira o nome:");
                        name = leitorTerminal.nextLine().trim();
                        leitorTerminal.next();
                        System.out.println("Insira o autor:");
                        author = leitorTerminal.next();
                        System.out.println("Insira o ano de publicação:");
                        publication = leitorTerminal.nextInt();
                        leitorTerminal.next();
                        System.out.println("Insira o preço:");
                        price = leitorTerminal.nextInt();
                        leitorTerminal.next();
                        catalogo.adicionarLivro(name, author, publication, price);
                        System.out.println("Adição concluída.");
                    }
                    case 2 -> {
                        System.out.println("REMOVER");
                        System.out.println("Remoção é feita por título. Insira o título:");
                        name = leitorTerminal.nextLine();
                        leitorTerminal.nextLine();
                        catalogo.removerLivro(name);
                        System.out.println("Remoção concluída.");
                    }
                    case 3 -> {
                        System.out.println("PESQUISA-AUTOR");
                        System.out.println("Insira o nome do autor:");
                        author = leitorTerminal.nextLine();
                        leitorTerminal.nextLine();
                        System.out.println(catalogo.pesquisarPorAutor(author));
                        System.out.println("Pesquisa concluída.");
                    }
                    case 4 -> {
                        System.out.println("PESQUISA-PUBLICAÇÃO");
                        System.out.println("Insira o ano inicial:");
                        anoInicial = leitorTerminal.nextInt();
                        leitorTerminal.nextLine();
                        System.out.println("Insira o ano final:");
                        anoFinal = leitorTerminal.nextInt();
                        leitorTerminal.nextLine();
                        System.out.println(catalogo.pesquisarPorPublicacao(anoInicial, anoFinal));
                    }
                    case 5 -> {
                        System.out.println("NET-WORTH");
                        System.out.println("Valor total do catálogo: " + catalogo.netWorth());
                    }
                    case 6 -> {
                        System.out.println("IMPRIMIR");
                        System.out.println(catalogo.toString());
                    }
                    case 7 -> {
                        System.out.println("FECHANDO...");
                        leitorTerminal.close();
                        flag = false;
                    }
                }
            } catch (CatalogoVazio e) {
                System.out.println("ERRO: Catálogo vazio. Insira uma obra.");
            }
        }
    }
}