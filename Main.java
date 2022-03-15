import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int kalkulator;
    double l1;
    double l2;

    System.out.println ("Wybierz program: 1-dodawanie, 2-odejmowanie, 3-mnożenie, 4-dzielenie");
    Scanner to = new Scanner (System.in);
    kalkulator = to.nextInt();
    
    switch(kalkulator){
        
      case 1:
        double wynik;
        System.out.println("Suma");
          System.out.println("Podaj 2 liczby aby obliczyć sumę");
        Scanner first = new Scanner (System.in);
        l1 = first.nextDouble();
        Scanner second = new Scanner (System.in);
         l2 = second.nextDouble();
        wynik = l1 +l2;
        System.out.println("wynik to " + wynik);

        break;
        
          case 2:
        double wynik2 ;
        System.out.println("Różnica");
          System.out.println("Podaj 2 liczby aby obliczyć różnicę");
        Scanner first1 = new Scanner (System.in);
        l1 = first1.nextDouble();
        Scanner second2 = new Scanner (System.in);
         l2 = second2.nextDouble();
        wynik = l1 - l2;
        System.out.println("wynik to " + wynik);

        break;

      case 3:
         double wynik3 ;
        System.out.println("Mnożenie");
          System.out.println("Podaj 2 liczby aby obliczyć mnożenie");
        Scanner first2 = new Scanner (System.in);
        l1 = first2.nextDouble();
        Scanner second3 = new Scanner (System.in);
         l2 = second3.nextDouble();
        wynik = l1 * l2;
        System.out.println("wynik to " + wynik);

        break;

      case 4:
        double wynik4 ;
        System.out.println("Dzielenie");
          System.out.println("Podaj 2 liczby aby obliczyć dzielenie");
        Scanner first3 = new Scanner (System.in);
        l1 = first3.nextDouble();
        Scanner second4 = new Scanner (System.in);
         l2 = second4.nextDouble();
        if(l2 !=0)
        {
        wynik4 = l1 / l2;
          System.out.println("wynik to " + wynik4);}
        else System.out.println("nie dziel przez 0");

        break;
        
        
        


      
        
    }
    
  }
}