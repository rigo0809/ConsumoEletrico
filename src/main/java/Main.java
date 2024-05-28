public class Main {
  public static void main(String[] args) {
System.out.println ("Potencia e Consumo Eletrico");
      
      System.out.println("");

System.out.println("Exercício");
      
      System.out.println("");

    System.out.println("      Formula     ");
    System.out.println(" Potencia x Tempo ");
    System.out.println(" ---------------- ");
    System.out.println("       1000       ");

    System.out.println("");

      System.out.println("Valor da Potencia");
    int Potencia = 200 ;
    System.out.println(Potencia);

    System.out.println("");
      
        System.out.println("Valor do Tempo");
    int Tempo = 5 ;
    System.out.println(Tempo);//

    System.out.println("");

        System.out.println("Valor durante o mês");
    int Mensalmente = 30 ;
    System.out.println(Mensalmente);

    System.out.println("");
      
        System.out.println("Resultado do Tempo durante o mês");
    int ValorTempo = Mensalmente * Tempo ;
    System.out.println(ValorTempo);

    System.out.println("");
      
        System.out.println("Valor da Conta Quase Final");
int Resultado = ValorTempo * Potencia ; 
    System.out.println(Resultado);

  System.out.println("");
      
        System.out.println("Valor da Conta Final");
    int valorFormula = 1000;

int ResultadoFinal = Resultado / valorFormula ;
    System.out.println(ResultadoFinal);
     System.out.println("O resultado dessa conta vai ser 30watts");

}
}