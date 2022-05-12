package pl.sda.arp4;

public class Main {
    public static void main(String[] args) {
        // deklaracja pojedynczej wartości
        int a = 4;

        // deklaracja tablicy składającej się z 5 komórek
        // tablica zawsze wypełnia się zerami
        int[] tablica = new int[5];     // deklaracja zer
        int[] tablicaDeklaracja = new int[]{5, 10, 15, 20, 25};     // deklaracja wartości

        tablica[0] = 1;     // przypisanie do komórki 0 wartości 1
        tablica[1] = 2;     // przypisanie do komórki 1 wartości 2
        tablica[2] = 20;       // przypisanie do komórki 2 wartości 20
        tablica[3] = -30;       // przypisanie do komórki 3 wartości -30
        tablica[4] = 75;        // przypisanie do komórki 4 wartości 75

        for (int i = 0; i < tablica.length; i++) {
            System.out.println((i+1) +". " + tablica[i]);
        }
    }
}
