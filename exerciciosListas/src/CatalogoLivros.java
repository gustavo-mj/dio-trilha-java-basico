import java.util.ArrayList;
import java.util.List;

class CatalogoLivros {

    private final List<Livro> catalogue;

    public CatalogoLivros() {
        this.catalogue = new ArrayList<>();
    }

    public void adicionarLivro(String name, String author, int publication, int price) {
        catalogue.add(new Livro(name, author, publication, price));
    }

    public void removerLivro(String name) {
        List<Livro> removerLivros = new ArrayList<>();
        if (!catalogue.isEmpty()) {
            for (Livro l : catalogue) {
                if (l.getName().equalsIgnoreCase(name)) {
                    removerLivros.add(l);
                }
            }
            catalogue.removeAll(removerLivros);
        }
    }

    public List<Livro> pesquisarPorAutor(String author) throws CatalogoVazio {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!catalogue.isEmpty()) {
            for (Livro l : catalogue) {
                if (l.getAuthor().equalsIgnoreCase(author)) {
                    livrosPorAutor.add(l);
                }
            }
            return livrosPorAutor;
        } else {
          throw new CatalogoVazio();
        }
      }

    public List<Livro> pesquisarPorPublicacao(int anoInicial, int anoFinal) throws CatalogoVazio {
        List<Livro> livrosPorPublicacao = new ArrayList<>();
        if (!catalogue.isEmpty()) {
            for (Livro l : catalogue) {
                if (l.getPublication() >= anoInicial && l.getPublication() <= anoFinal) {
                    livrosPorPublicacao.add(l);
                }
            }
            return livrosPorPublicacao;
        } else {
            throw new CatalogoVazio();
        }
    }

    public int netWorth() throws CatalogoVazio {
        int total = 0;
        if(!catalogue.isEmpty()) {
            for (Livro l : catalogue) {
                total += l.getPrice();
            }
            return total;
        } else {
            throw new CatalogoVazio();
        }
    }

    @Override
    public String toString() {
        String output = "";
        for (Livro l : catalogue) {
            output += l.toString();
        }
        return ("Catálogo de livros: " + output);
    }

}