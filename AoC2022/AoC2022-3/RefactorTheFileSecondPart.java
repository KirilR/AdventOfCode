import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class RefactorTheFileSecondPart {

    public int Refactor(String input) throws IOException {
        BufferedReader bufReader = new BufferedReader(new StringReader(input));
        String line;
        int temp = 0;
        int result = 0;
        char tempChar = '\0';
        StringBuilder sb = new StringBuilder();
        int check = 0;
        while ((line = bufReader.readLine()) != null) {

            check++;
            sb.append(line+"@@@");
            if(check==3){
                String [] parts = sb.toString().split("@@@");
                System.out.println(parts[0]+" "+parts[1]+" "+parts[2]);
                tempChar=CheckForMatches(parts[0],parts[1],parts[2]);
                System.out.println(tempChar);
                System.out.println("Temp char value "+giveValue(tempChar));
                check=0;
                sb.setLength(0);
                if(tempChar!='\0'){
                    temp=giveValue(tempChar);
                    
                    result+=temp;
                    
                }
            }



        }
        System.out.println(result);
        return result;
    }

    public char CheckForMatches(String A,String B,String C){
        char result = '\0';
        char[] First =A.toCharArray();
        char[] Second = B.toCharArray();
        char[] Third = C.toCharArray();
        for(int i = 0; i<First.length; i++){
            for(int j=0;j<Second.length;j++){
                for(int q=0;q<Third.length;q++) {
                    if (First[i] == Second[j] && Second[j]==Third[q]) {
                        return First[i];

                    }
                }
            }
        }
        return result;
    }

    private int giveValue(char A){
        int result =0;
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        if(Character.isUpperCase(A)) result=26;
        A=Character.toLowerCase(A);
        for(int i=0;i<alphabet.length;i++) {
            if (A == alphabet[i]) {
                result += i + 1;
                return result;
            }
        }
        result=0;
        return result;

    }
}


