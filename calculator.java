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

  // public static int operation(int a, int b, String operator){
  //   (operator)
  // }

  public static void main(String[] args) {
    System.out.println("Enter the first digit:");
    int digit1 = Integer .parseInt(System.console().readLine());

    System.out.println("Enter the second digit:");
    int digit2 = Integer.parseInt(System.console().readLine());

    String op = System.console().readLine();
    System.out.println(op);

    System.out.println("sum :" + sum(digit1,digit2));
    System.out.println("difference : " +difference(digit1,digit2));
    System.out.println("multiplication : " +multiplication(digit1,digit2));
    System.out.println("division : " +division(digit1,digit2));


  }

}
