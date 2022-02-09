public class NumberToWords {
    public static void main (String[]args){
        numberToWords(1010);
    }
    
    public static void numberToWords (int number){
        if (number < 1){
            System.out.println ("Invalid Value");
        }
        
        else {
            
            String numberString = Integer.valueOf(number).toString();
        
            for (int i = 0; i < numberString.length(); i++){
                char ch = numberString.charAt(i);
                
                switch (ch){
                    case '1' : System.out.print ("One ");    break;
                    case '2' : System.out.print ("Two ");    break;
                    case '3' : System.out.print ("Three ");  break;
                    case '4' : System.out.print ("Four ");   break;
                    case '5' : System.out.print ("Five ");   break;
                    case '6' : System.out.print ("Six ");    break;
                    case '7' : System.out.print ("Seven ");  break;
                    case '8' : System.out.print ("Eight ");  break;
                    case '9' : System.out.print ("Nine ");   break;
                    case '0' : System.out.print ("Zero ");   break;
                }
            } 
        }
    }
}
