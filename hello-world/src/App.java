public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String nome = "Gustavo";
        String sobrenome = "Monteiro";
        String nomeCompleto = nomeCompleto(nome, sobrenome);
        
        System.out.println(nomeCompleto);

    }
    public static String nomeCompleto(String nome, String sobrenome) {
        return nome.concat(" ").concat(sobrenome);
    }
}