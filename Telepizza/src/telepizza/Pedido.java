/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telepizza;

import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class Pedido {
    private String nombre;
    private String telefono;
    private String direccion;
    private boolean domicilio;
    private ArrayList<Pizza> pizzas;

    public Pedido(String nombre, String telefono, String direccion, boolean domicilio) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.domicilio = domicilio;
        this.pizzas = new ArrayList<Pizza>();
    }

    @Override
    public String toString() {
        return "nombre=" + getNombre() + ", telefono=" + getTelefono() + ", direccion=" + getDireccion() + ", domicilio=" + isDomicilio() + ", pizzas=" + getPizzas();
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the domicilio
     */
    public boolean isDomicilio() {
        return domicilio;
    }

    /**
     * @param domicilio the domicilio to set
     */
    public void setDomicilio(boolean domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * @return the pizzas
     */
    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }

    /**
     * @param pizzas the pizzas to set
     */
    public void setPizzas(ArrayList<Pizza> pizzas) {
        this.pizzas = pizzas;
    }
    
    
    
    
}