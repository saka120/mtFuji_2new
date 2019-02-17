package syouhizei;

public class kadai_1L3returnversion6 {

    public static void main(String[] args) {

        int num1 = 1500;

        double num2 = 0;

        mainMethod(num1, num2);

       // num2 = taxMethod(num1, num2);
     //   num2 = tax(num1, num2);
          num2 = tax(num1);
         
        
        System.out.print((int) (num1 + num2) + "円 (消費税は" + (int) num2 + "円) です。");

    }

    public static void mainMethod(int num1, double num2) {

        System.out.print(num1 + "円の商品の税込価格は");

    }

  //  public static int taxMethod(int num1, double num2) {
    
      public static int tax(int num1) {    
        

        int result = (int) (num1 * 0.08);

        return result;

    }

    
    
}
