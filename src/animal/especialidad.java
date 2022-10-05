/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author nuria
 */
public class especialidad {
    private String nombreespecialidad;
    private float salario_medio;
    private  float extra_peligrosidad;

    public especialidad(String nombreespecialidad, float salario_medio, float extra_peligrosidad) {
        this.nombreespecialidad = nombreespecialidad;
        this.salario_medio = salario_medio;
        this.extra_peligrosidad = extra_peligrosidad;
    }

    public String getNombreespecialidad() {
        return nombreespecialidad;
    }

    public void setNombreespecialidad(String nombreespecialidad) {
        this.nombreespecialidad = nombreespecialidad;
    }

    public float getSalario_medio() {
        return salario_medio;
    }

    public void setSalario_medio(float salario_medio) {
        this.salario_medio = salario_medio;
    }

    public float getExtra_peligrosidad() {
        return extra_peligrosidad;
    }

    public void setExtra_peligrosidad(float extra_peligrosidad) {
        this.extra_peligrosidad = extra_peligrosidad;
    }
    
    
    
}
