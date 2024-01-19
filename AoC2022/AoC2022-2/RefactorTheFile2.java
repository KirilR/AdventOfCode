import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class RefactorTheFile2 {
   

    public int Refactor(String input) throws IOException {
        BufferedReader bufReader = new BufferedReader(new StringReader(input));
        int result = 0;
        int tempres = 0;
        String line;
        while ((line = bufReader.readLine()) != null) {
            char firstCharacter = line.charAt(0); // Access the first character
            
            char secondCharacter = line.charAt(2);
            if (firstCharacter == 'A') {
                if (secondCharacter == 'X') tempres = 3;
                else if (secondCharacter == 'Y') tempres = 1 + 3;
                else if (secondCharacter == 'Z') tempres = 2+6;
                
            }
            if (firstCharacter == 'B') {
                if (secondCharacter == 'X') tempres = 1;
                else if (secondCharacter == 'Y') tempres = 3 + 2;
                else if (secondCharacter == 'Z') tempres = 6 + 3;
            }
            if (firstCharacter == 'C') {
                if (secondCharacter == 'X') tempres = 2;
                else if (secondCharacter == 'Y') tempres = 3 + 3;
                else if (secondCharacter == 'Z') tempres = 6 + 1;

            }
            result+=tempres;
            tempres=0;
        }
        return result;
    }


}
