
package animal;
import java.io.Serializable;
/**
 *
 * @author nuria
 */
public class Animal  implements Serializable{

   
    private String especie;
    private String  raza;
    private float peso;
    private int nombre;

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public Animal(String especie, String raza, float peso, int nombre) {
        this.especie = especie;
        this.raza = raza;
        this.peso = peso;
        this.nombre = nombre;
    }
    
    
}
