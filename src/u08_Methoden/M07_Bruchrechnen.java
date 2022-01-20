package u08_Methoden;

import util.Eingabe;


public class M07_Bruchrechnen {

    public static void main(String[] args) {
        String bruch1text = Eingabe.readString("Bruch1: ");
        String bruch2text = Eingabe.readString("Bruch2: ");

        int[] bruch1 = leseBruch(bruch1text);
        int[] bruch2 = leseBruch(bruch2text);

        System.out.println("Addiert       : " + bruchToString(add(bruch1, bruch2)));
        System.out.println("Subtrahiert   : " + bruchToString(subtract(bruch1, bruch2)));
        System.out.println("Multipliziert : " + bruchToString(multiply(bruch1, bruch2)));
        System.out.println("Dividiert     : " + bruchToString(devide(bruch1, bruch2)));

    }

    public static int[] add(int[] bruch1, int[] bruch2) {
        int nenner = bruch1[1] * bruch2[1];
        int factor1 = nenner / bruch1[1];
        int factor2 = nenner / bruch2[1];

        int[] ret = new int[2];

        ret[0] = bruch1[0] * factor1 + bruch2[0] * factor2;
        ret[1] = nenner;

        return kuerzen(ret);
    }

    public static int[] subtract(int[] bruch1, int[] bruch2) {
        int nenner = bruch1[1] * bruch2[1];
        int factor1 = nenner / bruch1[1];
        int factor2 = nenner / bruch2[1];

        int[] ret = new int[2];

        ret[0] = bruch1[0] * factor1 - bruch2[0] * factor2;
        ret[1] = nenner;

        return kuerzen(ret);
    }

    public static int[] multiply(int[] bruch1, int[] bruch2) {
        int[] ret = new int[2];

        ret[0] = bruch1[0] * bruch2[0];
        ret[1] = bruch1[1] * bruch2[1];
        return kuerzen(ret);
    }

    public static int[] devide(int[] bruch1, int[] bruch2) {
        int[] ret = new int[2];

        ret[0] = bruch1[0] * bruch2[1];
        ret[1] = bruch1[1] * bruch2[0];
        return kuerzen(ret);
    }

    public static int[] leseBruch(String bruch) {
        String[] bruchparts = bruch.split("/");
        int[] ret = new int[2];

        for(int i = 0; i < ret.length; i++)
            ret[i] = Integer.parseInt(bruchparts[i]);

        return ret;
    }

    public static int[] kuerzen(int[] bruch) {
        int ggt = M03_Brueche.ggt(bruch[0], bruch[1]);
        int[] ret = new int[2];
        ret[0] = bruch[0] / ggt;
        ret[1] = bruch[1] / ggt;

        if(ret[1] < 0 && ret[0] >= 0) {
            ret[1] = -ret[1];
            ret[0] = -ret[0];
        }
        return ret;
    }

    public static String bruchToString(int[] bruch) {
        return bruch[0] + "/" + bruch[1];
    }
}
