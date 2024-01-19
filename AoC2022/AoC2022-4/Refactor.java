import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class Refactor {

    public int Refactor(String input) throws IOException {
        BufferedReader bufReader = new BufferedReader(new StringReader(input));
        String line;
        String Apart = "";
        String Bpart = "";
        String[] arra;
        int PrimeGorno = 0;
        int PrimeDolno = 0;
        int secondGorno = 0;
        int secondDolno = 0;
        int countera = 0;
        boolean B = false;
        boolean C = false;
        boolean D = false;
        boolean E = false;

        while ((line = bufReader.readLine()) != null) {
            String [] temp1;
            String [] temp2;
            arra = line.split(",");
            
           temp1 = arra[0].split("-");
           temp2 = arra[1].split("-");
           
		   

            if(Integer.parseInt(temp1[1])==Integer.parseInt(temp2[1])&&(Integer.parseInt(temp2[1])-Integer.parseInt(temp2[0])>(Integer.parseInt(temp1[1])-Integer.parseInt(temp1[0])))){
                  PrimeGorno = Integer.parseInt(temp2[1]);
                  PrimeDolno = Integer.parseInt(temp2[0]);
                  secondGorno = Integer.parseInt(temp1[1]);
                  secondDolno = Integer.parseInt(temp1[0]);
                  System.out.println(line +" vliza v purvia if ///Prime Gornoto e "+PrimeGorno+" prime dolnoto e "+PrimeDolno);
                  System.out.println("second dolno = "+secondDolno+" second gorno= "+secondGorno);
                  
            } else if (Integer.parseInt(temp1[1])<Integer.parseInt(temp2[1])){

                   PrimeGorno = Integer.parseInt(temp2[1]);
                   PrimeDolno = Integer.parseInt(temp2[0]);
                   secondGorno = Integer.parseInt(temp1[1]);
                   secondDolno = Integer.parseInt(temp1[0]);
                   System.out.println(line +" vliza v elseifa ///Prime Gornoto e "+PrimeGorno+" prime dolnoto e "+PrimeDolno);
                   System.out.println("second dolno = "+secondDolno+" second gorno= "+secondGorno);
                   
           }
           else {

                   PrimeGorno = Integer.parseInt(temp1[1]);
                   PrimeDolno = Integer.parseInt(temp1[0]);
                   secondGorno = Integer.parseInt(temp2[1]);
                   secondDolno = Integer.parseInt(temp2[0]);
                   System.out.println(line +" vliza v posledia else ///Prime Gornoto e "+PrimeGorno+ " prime dolnoto e "+PrimeDolno);
                   System.out.println("second dolno = "+secondDolno+" second gorno= "+secondGorno);
                   
                   System.out.println("casea");
           }
            
                B = (PrimeGorno>secondGorno&&PrimeDolno<secondDolno);
                C = (PrimeGorno==secondGorno&&PrimeDolno<secondDolno);
                D = (PrimeDolno==secondDolno&&PrimeGorno>secondGorno);
                E = (PrimeDolno==secondDolno&&PrimeGorno==secondGorno);
                System.out.println("tuk");

            
           
            if(B||C||D||E){
                System.out.println("dobaviam");
                countera++;
            }

        }
        System.out.println(countera);
        return countera;


    }

    
}
