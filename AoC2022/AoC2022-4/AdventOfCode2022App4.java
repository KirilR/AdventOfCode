import java.io.IOException;

public class AdventOfCode2022App4 {

    public static void main(String[] args) throws IOException {
        TextFileReader reader = new TextFileReader();
        String filePath = "AdventOfCode20224.txt"; //file path
        
        String fileContent = reader.readFile(filePath);
        Refactor Appa = new Refactor();
        RefactorSecondPart Appa2 = new RefactorSecondPart();
        
        Appa2.Refactor(fileContent);


    }
}
