
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] temp = str.split(" ");
        Stack<String> stack = new Stack<>();
        for(int i = 0;i<temp.length;i++){
            stack.push(temp[i]);
        }
        for(int i = 0;i<temp.length;i++){
            System.out.print(stack.pop());
            if(i!=temp.length-1){
                System.out.print(" ");
            }
        }
    }
}
