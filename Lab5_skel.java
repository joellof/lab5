import java.util.Scanner;

public class Lab5_skel {

    public static void main(String[] args) {

        //doCollatz(5, 10);
        //doCommandLine();
        //System.out.println(toRobber("Örebro"));
        //System.out.println(toPigLatin("My name is Eric"));
        rule3("MIIIUUIUIIUI");

        //doMi2Mu();
    }

    // -------------------------- 1 ------------------------------

    public static void doCollatz(int n, int m) {

        while(n < m){
            int i = n;
           System.out.print(i + " ");
            while (i != 1) {
                if (i % 2 == 0)
                    i = i / 2;
                else
                    i = 3 * i + 1;
                System.out.print(i + " ");
            }
            n = n+1;
            System.out.println();
        }
    }

    // -----------  2 --------------------------

    public static void doCommandLine() {
        Scanner input = new Scanner(System.in);
        boolean done = true;
        while(done) {

            switch (input.nextLine()) {
                case "p": {
                    System.out.print("> Input statement:");
                    String indata = new String(input.nextLine());
                    System.out.print("p: " + toRobber(indata));
                    break;
                }
                case "r": {
                    System.out.print("> Input statement:");
                    String indata = new String(input.nextLine());
                    System.out.println("r: " + toPigLatin(indata));
                    break;
                }
                case "q": {
                    System.out.println("(program avslutat)");
                    done = false;
                }
            }
        }
    }



    // -----------------  3 ------------------------------


    public static String toRobber(String text){
        char ch[] = text.toCharArray();
        String robber = new String ();
        for(int i = 0; i < text.length(); i = i + 1 ){
            if (!isVowel(Character.toString(ch[i]))) {
                robber = robber + Character.toString(ch[i]) + "o" + Character.toString(ch[i]);
            }
            else
                robber = robber + ch[i];
        }
        return robber;
    }

    // ----------------- 4  ------------------------------
    public static boolean isVowel(String str) {

        if (str.equals("a") || str.equals("o") || str.equals("u") || str.equals("å") || str.equals("e") ||
                str.equals("i") || str.equals("y") || str.equals("ä") || str.equals("ö") ||
                str.equals("A") || str.equals("O") || str.equals("U") || str.equals("Å") || str.equals("E") ||
                str.equals("I") || str.equals("Y") || str.equals("Ä") || str.equals("Ö")|| str.equals(" ") )
            return true;
        else
            return false;
    }

    // ----------------- 5  ------------------------------

    public static String toPigLatin(String text) {

        String[] ord = text.split("\\s+");
        String piglatin = new String ();
        for(int i = 0; i <= ord.length - 1; i = i + 1) {

           char ch[] = ord[i].toCharArray();
            if (isVowel(Character.toString(ch[0]))) {

                piglatin = piglatin +  ord[i] + "way ";
            }
            else {
                for (int n = 1; n <= ch.length - 1; n = n + 1) {
                    piglatin = piglatin  + Character.toString(ch[n]);
                }
                piglatin = piglatin + Character.toString(ch[0]) + "ay ";
            }
        }
        return piglatin;
    }

    // -------------------- 6 -------------------------

    public static void doMi2Mu() {

    }

    public static String rule1(String s) {

        char ch[] = s.toCharArray();
        if(Character.toString(ch[ch.length - 1]).equals("I"))
        s = s + "U";
        System.out.print(s);
        return s;// Just for now
    }
    public static String rule2(String s) {
        char ch[] = s.toCharArray();
        String p = new String();
        for(int n = 1; n<=ch.length-1; n = n + 1){
            p = p + Character.toString(ch[n]);
        }
        s = s + p;
        System.out.println(s);
        return s;
    }

    public static String rule3(String s) {

        char ch[] = s.toCharArray();
        //String p = new String();
        for(int n = 0; n < ch.length -1; n = n +1){

            if(n<ch.length-2){
            if(Character.toString(ch[n]).equals("I")) {
                if (Character.toString(ch[n + 1]).equals("I")) {
                    if (Character.toString(ch[n + 2]).equals("I")) {
                        s = s + "U";
                    }
                }
            }
                }
                    else
                        s = s + Character.toString(ch[n]);
                }
        System.out.println(s);
        return s;
            }

    public static String rule4(String s) {

        return null;// Just for now
    }
}
