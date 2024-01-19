public class RefactorTheFile {
    String Apart = "";
    String Bpart = "";
    public int Refactor(String input) throws IOException {
        BufferedReader bufReader = new BufferedReader(new StringReader(input));
        String line;
        int temp = 0;
        int result = 0;
        char tempChar = '\0';

        while ((line = bufReader.readLine()) != null) {
            temp=0;
            Apart = line.substring(0,line.length()/2);
            Bpart = line.substring(line.length()/2,line.length());
            
            tempChar = CheckForMatches(Apart,Bpart);
            if(tempChar!='\0'){
                temp=giveValue(tempChar);
                
                result+=temp;
            }
        }
        System.out.println(result);
        return result;
    }

        public char CheckForMatches(String A,String B){
        char result = '\0';
        char[] First =A.toCharArray();
        char[] Second = B.toCharArray();

            for(int i = 0; i<First.length; i++){
                for(int j=0;j<Second.length;j++){
                    if(First[i]==Second[j]){
                        return First[i];

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


