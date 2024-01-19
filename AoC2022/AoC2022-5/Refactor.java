import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
//Both solutions are here as two different methods
public class Refactor {

    ArrayList<Stack<Character>> ListOfstacks = new ArrayList<>();
    StringBuilder sb = new StringBuilder();

    public String Refactor(String input) throws IOException {
        BufferedReader bufReader = new BufferedReader(new StringReader(input));
        System.out.println(input);
        String line;
        String[] temp;
        String result = " ";

        int howMuchToMove = 0;
        int fromWhereToMove = 0;
        int toWhereToMove = 0;
        while ((line = bufReader.readLine()) != null) {
            temp = line.split(" ");
            howMuchToMove = Integer.parseInt(temp[1]);
            fromWhereToMove = Integer.parseInt(temp[3]);
            toWhereToMove = Integer.parseInt(temp[5]);
            mover(howMuchToMove, fromWhereToMove, toWhereToMove);

        }

        System.out.println(ListOfstacks);
        for (int i = 0; i < ListOfstacks.size(); i++) {
            sb = sb.append(ListOfstacks.get(i).peek());
        }
        result = sb.toString();
        System.out.println("Final view " + result);
        return result;
    }
    public String Refactor2(String input) throws IOException {
        BufferedReader bufReader = new BufferedReader(new StringReader(input));
        System.out.println(input);
        String line;
        String[] temp;
        String result = " ";

        int howMuchToMove = 0;
        int fromWhereToMove = 0;
        int toWhereToMove = 0;
        while ((line = bufReader.readLine()) != null) {
            temp = line.split(" ");
            howMuchToMove = Integer.parseInt(temp[1]);
            fromWhereToMove = Integer.parseInt(temp[3]);
            toWhereToMove = Integer.parseInt(temp[5]);
            if(howMuchToMove==1) mover(howMuchToMove, fromWhereToMove, toWhereToMove);
            else moverWholeStacks(howMuchToMove,fromWhereToMove,toWhereToMove);

        }

        System.out.println(ListOfstacks);
        for (int i = 0; i < ListOfstacks.size(); i++) {
            sb = sb.append(ListOfstacks.get(i).peek());
        }
        result = sb.toString();
        System.out.println("Final view " + result);
        return result;
    }


    public void FillStacks(String input) throws IOException {
        BufferedReader bufReader = new BufferedReader(new StringReader(input));
        String line;
        int broika = 0;
        char[] temp;
        char[] chast;


        String[] arr = input.split("\n");
        String[] nonEmptyLines = Arrays.stream(arr)
                .map(String::trim)
                .filter(linea -> !linea.isEmpty())
                .toArray(String[]::new);
        String lastLine = nonEmptyLines[nonEmptyLines.length - 1];

        temp = lastLine.toCharArray();

        broika = Character.getNumericValue(temp[temp.length - 1]);

        for (int i = 0; i < broika; i++) {
            Stack<Character> stack = new Stack<>();
            ListOfstacks.add(stack);
        }

        

        while ((line = bufReader.readLine()) != null) {
            if (line.length() > 0) System.out.println(line);
            chast = line.toCharArray();
            for (int i = 0; i < chast.length; i++) {
                if (i == 1 && Character.isAlphabetic(chast[i])) ListOfstacks.get(i - 1).push(chast[i]);
                if (i > 1 && ((i - 1) % 4 == 0) && Character.isAlphabetic(chast[i]))
                    ListOfstacks.get(i / 4).push(chast[i]);

            }


        }
       
        for (int j = 0; j < ListOfstacks.size(); j++) {
            reverseStack(ListOfstacks.get(j));

        }
        System.out.println(ListOfstacks);
    }

    public static <T> void reverseStack(Stack<T> stack) {
        if (stack.isEmpty()) {
            return;
        }
        // Remove bottom element from stack
        T bottom = popBottom(stack);

        // Reverse everything else in stack
        reverseStack(stack);

        // Add original bottom element to top of stack
        stack.push(bottom);
    }

    private static <T> T popBottom(Stack<T> stack) {
        T top = stack.pop();
        if (stack.isEmpty()) {
            // If we removed the last element, return it
            return top;
        } else {
            // We didn't remove the last element, so remove the last element from what remains
            T bottom = popBottom(stack);
            // Since the element we removed in this function call isn't the bottom element,
            // add it back onto the top of the stack where it came from
            stack.push(top);
            return bottom;
        }
    }

    private void mover(int A, int B, int C) {
        char tempa = '\u0000';
        for (int i = 0; i < A; i++) {
            tempa = ListOfstacks.get(B - 1).pop();
            ListOfstacks.get(C - 1).push(tempa);
        }
    }

    private void moverWholeStacks(int A, int B, int C){
        ArrayList<Character> parts = new ArrayList<Character>();
        char tempa = '\u0000';
        for(int i=0;i<A;i++){
            tempa=ListOfstacks.get(B-1).peek();
            parts.add(tempa);
            ListOfstacks.get(B-1).pop();
        }
        for(int j=parts.size()-1;j>=0;j--) {
            ListOfstacks.get(C-1).push(parts.get(j));
            }
        }
}

