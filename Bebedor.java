
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

    /**
     * Constructor para inicializar los atributos.
     */
    public Bebedor(float limite)
    {
       alcoholEnS = 0f;
       this.limite = limite;
       
    }

    /**
     *Mt para sumar los grados de alcohol  que se van acumulando con cada copa  tomada.
     */
    public void ponmeUnaCopa(Cubata copa)
    {
       alcoholEnS = alcoholEnS + copa.getAlcoholEnCopa();
       if(alcoholEnS >= limite){
           System.out.println("Otra copa??? \nNo, ya no tengo sed.  \n ");
       }
    }
}






















