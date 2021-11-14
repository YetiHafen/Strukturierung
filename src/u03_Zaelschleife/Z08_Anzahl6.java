package u03_Zaelschleife;

import util.Zufall;

public class Z08_Anzahl6 {

    public static void main(String[] args) {
        int sechser = 0;

        for(int i = 0; i < 30; i++) {
            int z = Zufall.wuerfeln();
            System.out.print(z + (i == 29 ? "\n" : " "));
            sechser += z == 6 ? 1 : 0;
        }

        System.out.println(sechser);
    }
}
