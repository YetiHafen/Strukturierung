package u03_Zaelschleife;

public class Z02_GeradeZahlen {

    public static void main(String[] args) {
        for(int i = 0; i < 20; i++) {
            System.out.print(i % 2 == 0 ? i + "\n" : "");
        }
    }
}
