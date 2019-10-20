import java.util.Scanner;

class AlphabetAnimals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] lastWord = scan.nextLine().split("");
        String lastLetter = lastWord[lastWord.length - 1];

        String[] validWords = new String[Integer.parseInt(scan.nextLine())];
        // Reads list of valid words
        for (int i = 0; i < validWords.length; i++) {
            validWords[i] = scan.nextLine();
        }
        String okWord = "";
        boolean okWordSet = false;
        for (int i = 0; i < validWords.length; i++) {
            String firstLetter = validWords[i].substring(0, 1);
            boolean eliminate = true;
            if (firstLetter.equals(lastLetter)) {
                if (!okWordSet) {
                    okWord = validWords[i];
                    okWordSet = true;
                }
                char lastLetterOfValidWord = validWords[i].charAt(validWords[i].length() - 1);
                for (int k = 0; k < validWords.length; k++) {
                    if (validWords[k].charAt(0) == (lastLetterOfValidWord) && !(validWords[k].equals(validWords[i]))) {
                        eliminate = false;
                        break;
                    }

                }
                if (eliminate) {
                    System.out.println(validWords[i] + "!");
                    System.exit(0);
                }
            }
        }
        if (okWordSet) {
            System.out.println(okWord);
        } else {
            System.out.println("?");
        }
    }
}