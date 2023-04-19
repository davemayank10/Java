import java.lang.Exception;
import java.lang.String;

class ArgumentGreaterThanOne extends Exception{
    ArgumentGreaterThanOne(String e){
        super(e);
    }
}

public class Pra_30 {
    public static void main(String[] args) throws ArgumentGreaterThanOne{
        try {
            if (args.length > 1) {
                throw new ArgumentGreaterThanOne("Too many arguments provided.");
            }
            else{
                System.out.println("Successfully Run Without Exception.");
            }
        } 
        catch (ArgumentGreaterThanOne e) {
            System.out.println(e);
        }
    }
}

/*
Output:
  ->Exception Not Occured.
D:\Desktop\Java> java Pra_30 25
Successfully Run Without Exception.
  ->Exception Handled.
D:\Desktop\Java> java Pra_30 25 30
ArgumentGreaterThanOne: Too many arguments provided.
*/
