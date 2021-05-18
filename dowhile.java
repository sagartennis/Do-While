import java.util.*;
// Print first n integers starting from 0 in the reverse order using the do-while loop.
public class dowhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        do {
            System.out.println(i);
            i--;
        }while (i>=0);

        

    }
}
