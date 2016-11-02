import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;

public class Lab5_skel {

    public static void main(String[] args) {
        //doCollatz();
        //Scanner keyboard = new Scanner(System.in);
        //doCommandLine(keyboard.next());
        System.out.println(toRobber("Hej på dig"));
        //System.out.println(toPigLatin("Hej på dig"));
        //doMi2Mu();
    }

    // -------------------------- 2 ------------------------------

    public static void doCommandLine(String a) {

        Scanner input = new Scanner(System.in);
        while(input.hasNext()) {

            switch (a) {
                case "p": {

                    System.out.print("> Input statement:");

                    String indata = new String(input.next());

                    System.out.print("p" + indata);

                }
                case "r": {

                    System.out.print("> Input statement:");

                    String indata = new String(input.next());

                    System.out.println("r: " + indata);
                    break;

                }
                case "q": {
                    System.out.println("(program avslutat)");
                    break;
                }
            }
        }

    }

    // -----------  1 --------------------------

    public static void doCollatz() {

    }

    // -----------------  3 ------------------------------


    public static String toRobber(String text) {

        char hu[] = text.toCharArray();
        System.out.println(hu);
        String robber = new String ();
        for(int i = 0; i < text.length(); i = i + 1 ){

        if (!isVowel(Character.toString(hu[i]))) {
            robber = robber + Character.toString(hu[i]) + "o" + Character.toString(hu[i]);
        }
        else
            robber = robber + hu[i];
       }

        return robber;
    }


    // ----------------- 4  ------------------------------
    public static boolean isVowel(String str) {

        if(str == "a" || str == "o" || str == "u" || str == "å" || str == "e" ||
                str == "i" || str == "y" || str == "ä" || str == "ö" ||
                str == "A" || str == "O" || str == "U" || str == "Å" || str == "E" ||
                str == "I" || str == "Y" || str == "Ä" || str == "Ö")
        return true;
        else
        return false;
    }

    // ----------------- 5  ------------------------------

    public static String toPigLatin(String text) {
        return null;// Just for now
    }

    // -------------------- 6 -------------------------

    public static void doMi2Mu() {

    }

    public static String rule1(String s) {
        return null;// Just for now
    }

    public static String rule2(String s) {
        return null;// Just for now
    }

    public static String rule3(String s) {
        return null;// Just for now
    }

    public static String rule4(String s) {
        return null;// Just for now
    }
}
