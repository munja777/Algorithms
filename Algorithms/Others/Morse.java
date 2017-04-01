package Others;

import java.util.Scanner;

class Morse {

    public static void main(String[] args) {

        String[] abc = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
                "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
                "W", "X", "Y", "Z", " "};

        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
                "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
                "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
                "-.--", "--..", " "};

        Scanner input = new Scanner(System.in);
        System.out.println("Wpisz slowo do translacji. Uzyj tylko liter i znakow alfabetu Morse'a");
        String string = input.nextLine();
        char[] word = string.toUpperCase().toCharArray();


        // usuwam znaki niedozwolone, w razie, jakby uzytkownik je wpisal, aby uniknac bledu
        // znaki bede sprawdzal po kodach ASCII
        // zwykly alfabet w dalszej czesci kodu w komentarzach bede oznaczal ABC
        for (int i = 0; i < word.length; i++)
            if ((((int) word[i] < 65) || ((int) word[i] > 90)) &&
                    (((int) word[i] != 45) && ((int) word[i] != 46)))  word[i] = ' ';


        // o ile slowo rozpoczyna spacja, to sprawdzam ile jest spacji,
        // do napotkania innego znaku dozwolonego
        int a = 0;
        int counter = 0;

        for (char aWord : word)
            if (aWord == ' ') a++;
            else break;

        // sprawdzenie, czy uzytkownik nie wpisal samych spacji
        if (a == word.length) {
            System.out.println("Wprowadziles same spacje");
            a--;
        }

        // od pierwszego napotkanego znaku sprawdzam, czy jest to ABC
        if ( ((int) word[a] > 64) && ((int) word[a] < 91) ) {

            // usuwam reszte niedozwolonych znakow (w tym wypadku kropke i myslnik)
            for (int i = 0; i < word.length; i++)
                if (((int) word[i] == 45) || ((int) word[i] == 46)) word[i] = ' ';

            // wywoluje funkcje zamiany na Morse'a
            toMorse(word, morse);
        }


        // od pierwszego napotkanego znaku sprawdzam, czy jest to alfabet Morse'a
        if ( ((int) word[a] == 45) || ((int) word[a] == 46) ) {

            // usuwam reszte niedozwolonych znakow (w tym przypadku ABC)
            for (int i = 0; i < word.length; i++)
                if (((int) word[i] > 64) && ((int) word[i] < 91)) word[i] = ' ';

            // wywoluje funkcje zamiany na Morse'a
            toAbc(word, morse, abc);
        }

    }



    // funkcja zamiany z ABC na alfabet Morse'a
    private static void toMorse(char[] words, String[] morse) {

        int lastSpace = 0;

        for (char word : words) {

            // kazda litere zamieniam na kod ASCII, a nastepnie odejmuje 65, aby otrzymac
            // numeracje alfabetu zaczynajac od A = 0, dodatkowo usuwam niepotrzebne spacje
            if (word == ' ') {
                if (lastSpace == 0) System.out.print(" ");
                lastSpace++;
            }
            else {
                System.out.print(morse[(int) word - 65] + ' ');
                lastSpace = 0;
            }
        }
    }


    // funkcja zamiany z alfabetu Morse'a na ABC
    private static void toAbc (char[] words, String[] morse, String[] abc) {

        // wracam z powrotem do String, aby moc uzyc .split, i dziele go na kawalki
        String sum = new String(words);
        String[] parts = sum.split(" ");

        // porownuje dany kawalek z kazda litera alfabetu Morse'a i wypisuje
        // na ekran litere o tym samym numerze, co litera alfabetu Morse'a
        for (String part : parts) {
            for (int j = 0; j < morse.length; j++)
                if (part.equals(morse[j])) System.out.print(abc[j]);
        }
    }

}
