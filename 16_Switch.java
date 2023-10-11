/*Scrivi un programma che contenga un metodo che prende in ingresso un carattere e ne identifica
il tipo per un operazione di algebra (+ addizione - sottrazione * moltiplicazione / divisione).
Nel caso non riesca ad identificare il tipo di operazione dovrà restituire una stringa di errore.*/


public class myClass{
    public static void main(String[] args){
        
        char operation = '*' ;
        checkOp(operation);
    }
    
    
    public static void checkOp(char a){
        switch (a){
            case '*': 
                System.out.print("Multiplication");
                break;
            case '/': 
                System.out.print("Division");
                break;
            case '+': 
                System.out.print("Addition");
                break;
            case '-': 
                System.out.print("Subtraction");
                break;
            
            default: 
                System.out.print("Error");
        }
    }
    
}