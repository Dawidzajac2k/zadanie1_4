import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double wynik =0.0;
    char c='/';
    boolean check = true;
    System.out.println("1.Suma,2.Różnica,3.Iloczyn,4.Iloraz");
    System.out.println("Podaj opcje");
    System.out.print(">");
    int opcja = scanner.nextInt();
    while(opcja<1 || opcja>4)
      opcja = scanner.nextInt();
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    switch(opcja)
      {
        case 1: wynik=a+b; z='+'; break;
        case 2: wynik=a-b; z='-'; break;
        case 3: wynik=a*b; z='*'; break;
        case 4: if(b==0){ 
          System.out.println("DZIELENIE PREZ 0!"); 
          check=false;break;
        } 
          wynik=a/b; c='/'break;
        }
        if(check)
          System.out.println(a+""+z+""+b+"="+wynik);
          scanner.close();  
      }
    }
}