import java.util.Scanner;
public class BMAtividade7
{
    public static void main(String[] args){
        int x, y;
        System.out.print("\nInforme um numero: ");
        x = new Scanner(System.in).nextInt();
        
        while (x != 1){
            if(x%2==0){
                y = x/2;
            } else {
                y = 3 * x + 1;
            }
            System.out.print(""+y);
            x = y;
            
            if (x!=1) System.out.print(" -> ");
        }
    }
}
