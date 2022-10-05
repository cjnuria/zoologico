/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author nuria
 */
public class cuidados {

    public cuidados(String tipoComida, String habitad, float CostePromedio, float cantidadcomidaKg, int periocidadComidaDias, Animal animal) {
        this.tipoComida = tipoComida;
        this.habitad = habitad;
        this.CostePromedio = CostePromedio;
        this.cantidadcomidaKg = cantidadcomidaKg;
        this.periocidadComidaDias = periocidadComidaDias;
        this.animal = animal;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public String getHabitad() {
        return habitad;
    }

    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }

    public float getCostePromedio() {
        return CostePromedio;
    }

    public void setCostePromedio(float CostePromedio) {
        this.CostePromedio = CostePromedio;
    }

    public float getCantidadcomidaKg() {
        return cantidadcomidaKg;
    }

    public void setCantidadcomidaKg(float cantidadcomidaKg) {
        this.cantidadcomidaKg = cantidadcomidaKg;
    }

    public int getPeriocidadComidaDias() {
        return periocidadComidaDias;
    }

    public void setPeriocidadComidaDias(int periocidadComidaDias) {
        this.periocidadComidaDias = periocidadComidaDias;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    private String tipoComida;
    private String habitad;
    private float CostePromedio;
    private float cantidadcomidaKg;
    private int periocidadComidaDias;
    Animal animal; // llamada a la clase animal 
    
    
    
    
}
