package Others;

class Palindrome {

    public static void main(String[] args) {
        // funkcja wywoluje sie dla liczb od 10*10 do 99*99
        for (int i = 100; i < 9801; i++) if (isPalindrome(i)) System.out.println(i);
    }

    private static boolean isPalindrome(int numb) {
        // dzialania sa na typie int, ze wzgledu na niedokladnosc zapisu cyfr po przecinku
        // float i double. przydzielam dla iteracji zmienna n, by wyeliminowac wszystkie
        // liczby, ktorych ostatnia cyfra to 0, gdyz beda takie, ktore przejda pozytywnie
        // ten algorytm, bo int obcina cyfry po przecinku, ale zadne nie sa palindromami,
        // bo pierwsza cyfra zaczyna sie od 1. eliminuje je dzielac je przez 10 i sprawdzajac,
        // czy reszta z dzielenia, czyli ostatnia cyfra, wynosi 0.
        int n = numb;
        int a = 0;

        while (a < n) {
            a = 10 * a + n % 10;
            n /= 10;
            if ( a==n && (numb%10) != 0 ) return true;
        }
        return false;
    }
}