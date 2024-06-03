public class Livro {

    private String name;
    private String author;
    private int publication;
    private int price;

    public Livro(String name, String author, int publication, int price) {
        this.name = name;
        this.author = author;
        this.publication = publication;
        this.price = price;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getAuthor() { return author; }

    public void setAuthor(String author) { this.author = author; }

    public int getPublication() { return publication; }

    public void setPublication(int publication) { this.publication = publication; }

    public int getPrice() { return price; }

    public void setPrice(int price) { this.price = price; }

    @Override
    public String toString() {
      return ("[Título: " + this.name + ", Autor: " + this.author + ", Publicação: " + this.publication + ", Preço: " + this.price + "]");
    }

}
