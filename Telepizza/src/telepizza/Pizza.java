/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telepizza;

/**
 *
 * @author alumno
 */
public class Pizza {
    private String sabor;
    private boolean masaFina;
    private double precio;

    public Pizza(String sabor, boolean masaFina, double precio) {
        this.sabor = sabor;
        this.masaFina = masaFina;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "sabor: " + sabor + " masaFina: " + masaFina + "precio: " + precio;
    }
    

    /**
     * @return the sabor
     */
    public String getSabor() {
        return sabor;
    }

    /**
     * @param sabor the sabor to set
     */
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    /**
     * @return the masaFina
     */
    public boolean isMasaFina() {
        return masaFina;
    }

    /**
     * @param masaFina the masaFina to set
     */
    public void setMasaFina(boolean masaFina) {
        this.masaFina = masaFina;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
