
package practica7interes;
/**
 *
 * @author Diego Armanmdo
 */
public class Practica7Interes {
    public void interess(){
        double intere;
int capital=56;
int pericaldias=22;
int tdin=65;
intere=(capital*pericaldias*tdin/360*100);
System.out.println("El interes es: " + intere);
        
        }
    

 
    public static void main(String[] args) {
        System.out.println("Este programa saca el interes");
        Practica7Interes interess = new Practica7Interes();
        interess.interess();
        
    }
    
}
