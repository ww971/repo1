import javax.swing.*;

public class Classtablica //utworzenie klasy publicznej{

  public static void main(String[] args) {
    double suma = 0; //ustalenie wartoœci pocz¹tkowej dla zmiennej suma
    int tablica[] = new int[5]; //utworzenie tablicy
    for (int i = 0; i < tablica.length; i++) {
      String tekst = JOptionPane.showInputDialog("podaj watosc pola tablicy");
      int liczba = Integer.parseInt(tekst);
      tablica[i] = liczba; //pêtla wype³niaj¹ca tablicê wartoœciami. Pêtla dzia³a do momentu wype³nienia wszystkich elementów tablicy
      suma = tablica[i] + suma; //zliczenie sumy liczb z tablicy
    }
    System.out.println("Suma liczb z tablicy wynosi " + suma); //wypisanie watoœci zmiennej suma
  }
}
