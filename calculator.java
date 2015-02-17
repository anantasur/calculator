class Calculator{

  public static int sum(int a, int b) {
    return a+b;
  }

  public static int difference(int a, int b) {
    return b-a;
  }

  public static int multiplication(int a, int b) {
    return a*b;
  }

  public static int division(int a, int b) {
    return b/a;
  }

  public static int operation(int a, int b, char operator){
    if(operator=='+') return sum(a,b);
    if(operator=='-') return difference(a,b);
    if(operator=='*') return multiplication(a,b);
    if(operator=='/') return division(a,b);
    return 0;
  }

  public static void main(String[] args) {
    System.out.println("Enter the first digit:");
    int digit1 = Integer .parseInt(System.console().readLine());

    System.out.println("Enter the second digit:");
    int digit2 = Integer.parseInt(System.console().readLine());

    String op = System.console().readLine();

  }

}
