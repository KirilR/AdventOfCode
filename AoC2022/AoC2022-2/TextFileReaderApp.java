import java.io.IOException;

public class TextFileReaderApp {

    public static void main(String[] args) throws IOException {
        TextFileReader reader = new TextFileReader();
        String filePath = "AdventOfCode2.txt"; //file path

        String fileContent = reader.readFile(filePath);
        //System.out.println("File Content:");
        System.out.println(fileContent);
        RefactorTheFile Appa = new RefactorTheFile();
        RefactorTheFile2 Appa2 = new RefactorTheFile2();
        int res = Appa.Refactor(fileContent);
        int res2 = Appa2.Refactor(fileContent);
        System.out.println(res2);
    }
}
