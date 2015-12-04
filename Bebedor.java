
/**
 * Write a description of class Bebedor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bebedor
{
    // At para guardar los grados de alcohol acumulados
    private float alcoholEnS;
    //At para guardar el valor del límite de alcohol
    private float limite;
    //At. para almacenar el nombre del bebedor.
    private String nombreB;

    /**
     * Constructor para inicializar los atributos.
     */
    public Bebedor(float limite, String nombreB)
    {
       alcoholEnS = 0f;
       this.limite = limite;
       this.nombreB = nombreB;
       
    }

    /**
     *Mt para sumar los grados de alcohol  que se van acumulando con cada copa  tomada.
     */
    public void ponmeUnaCopa(Cubata copa)
    {
       alcoholEnS = alcoholEnS + copa.getAlcoholEnCopa();
       if(alcoholEnS >= limite){
           System.out.println("Otra copa??? \nNo, ya se me ha quitado la sed de golpe y porrazo.  \n ");
       }
    }
    
    /**
     * Mt para preguntar al bebedor y conocer su estado dependiendo del alcohol que ha tomado.
     */
    public void preguntas(String cadena1){
       //alcoholEnS = alcoholEnS + copa.getAlcoholEnCopa();
       
       if( (alcoholEnS > limite) || (cadena1.contains(nombreB))){
           System.out.print( "¡¡¡ " +cadena1.toUpperCase() + " ¡¡¡");
       }
       else if( (alcoholEnS < limite) ){
           if( (cadena1.length() % 2 == 0)){
               System.out.println("Si. ");
           }
           else{
               System.out.println("No. ");
           }
       }
    }

}
