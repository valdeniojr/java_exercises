package activities3.question06;

public class App {
    static void main(String[] args) {
        String text = null;

        try {
            int size = text.length();
            System.out.println("Tamanho do texto: " + size);
        } catch (NullPointerException e) {
            System.out.println("Não foi possível obter o tamanho: o valor não foi definido.");
        }
    }
}
