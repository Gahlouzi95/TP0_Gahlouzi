package tp0;
import java.util.Scanner;

/*
Ismaël Gahlouzi
BDML 2

/**
 *
 * @author isma
 */
public class TP0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Partie 1
        String prenom;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Bonjour, quel est votre prenom ?");
        prenom= sc.nextLine();
        System.out.print("Merci et à bientôt "+prenom+"\n");
        
        
        
        //Partie 2
       
        int nb; 
        int result; 
        int ind; 

        //nb=5;
        // Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer le nombre :");
        nb = sc.nextInt(); 

        result = 0;

        
        ind = 1;
        while (ind <= nb) {
            result = result + ind;
            ind = ind + 1; 
        }

        
        System.out.println();
        System.out.println("La somme des " + nb + " entiers est: " + result);
    
   
       
        
        //Partie 3
        // Scanner sc= new Scanner(System.in);
        System.out.print("Please enter the operator:\n" +
            "1) add\n" +
            "2) substract\n" +
            "3) multiply\n" +
            "4) divide\n" +
            "5) modulo\n");
        int operateur= sc.nextInt();
        
        if (operateur < 1 || operateur > 5) {
            System.out.println("Opérateur incorrect");
            System.exit(0);
        }
        System.out.println("Entrez la première valeur :");
        int operande1=sc.nextInt();
        System.out.println("Entrez la seconde valeur :");
        int operande2=sc.nextInt();
        
        if (operateur==1){
            int res=operande1+operande2;
            System.out.print("Le résultat de l'addition entre "+operande1+" et "+operande2+" est :"+res);
        }
        else if (operateur==2){
            int res=operande1-operande2;
            System.out.print("Le résultat de la soustraction entre "+operande1+" et "+operande2+" est :"+res);
        }
        else if (operateur==3){
            int res=operande1*operande2;
            System.out.print("Le résultat de la multiplication entre "+operande1+" et "+operande2+" est :"+res);
        }
        else if (operateur==4){
            int res=operande1/operande2;
            System.out.print("Le résultat de la division entre "+operande1+" et "+operande2+" est :"+res);
        }
        else {
            int res=operande1%operande2;
            System.out.print("Le résultat du modulo entre "+operande1+" et "+operande2+" est :"+res);
        }
    } 
}
