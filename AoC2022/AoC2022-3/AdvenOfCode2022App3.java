import java.io.IOException;

public class AdvenOfCode2022App3 {

    public static void main(String[] args) throws IOException {
        TextFileReader reader = new TextFileReader();
        String filePath = "C:\\Users\\Pavel\\Documents\\Kiro\\AdventOfCode3.2022.txt"; //file path
        String fileTempPath = "C:\\Users\\Pavel\\Documents\\Kiro\\AdventOfCode3Temp.2022.txt";
        String fileContent = reader.readFile(filePath);
        String tempFileContent = reader.readFile(fileTempPath);
        
        RefactorTheFile Appa = new RefactorTheFile();
        Appa.Refactor(fileContent);
        RefactorTheFileSecondPart Appa2 = new RefactorTheFileSecondPart();
        Appa2.Refactor(fileContent);

    }
}

