
/**
 * Write a description of class Cubate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cubate
{
    // At para guardar el nombre de la copa.
    private String nombreC;
    //At para guardar el valor de alcohol de cada copa.
    private float alcoholC;

    /**
     * Constructor for objects of class Cubate para inicializar los atributos con valores pasados por parámetro
     */
    public Cubate(String nombreC, float alcoholC)
    {
       this.nombreC = nombreC;
       this.alcoholC = alcoholC;
    }

    /**
     * Mt. para poder asignar el nombre de la copa.
     */
    public void setNombreC(String n){
        nombreC = n;
    }
    
    /**
     * Mt. para poder asignar la cantidad de alcohol en la copa.
     */
    public void setAlcoholEnCopa(float al){
        alcoholC = al;
    }
    
    /**
     * Mt para retornar el valor del nombre de la copa.
     */
    public String getNombreCopa(){
        return nombreC;
    }
    
    /**
     * Mt para retornar el valor de alcohol en la copa.
     */
    public float getAlcoholEnCopa(){
        return alcoholC;
    }
}















