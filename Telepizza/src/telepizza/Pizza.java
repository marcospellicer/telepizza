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
    private boolean grande;
    private double precio;

    public Pizza(String sabor, boolean masaFina, boolean grande) {
        this.sabor = sabor;
        this.masaFina = masaFina;
        this.grande = grande;
        this.precio = 0;
    }
    

    public void calcularPrecio(){
     precio=10;
        if(!masaFina){
            precio+=3;
            if(grande){
                precio+=10;
            }
        }else{
           if(grande){
                precio+=10;
            } 
        }
    }
    private String traducir(){
        String a="";
        if(masaFina){
           a=" | Masa Fina "; 
        }else{
           a=" | Masa Clasica ";
        }
        if(grande){
           a+="| Grande | " ;
        }else{
           a+="| Pequeña | " ; 
        }
        return a;
    }

    @Override
    public String toString() {
        return "sabor: " + getSabor() +traducir()+ "precio: " + getPrecio()+"€"+"\n" ;
    }
    
    public String mostrar() {
        return "sabor: " + getSabor() +traducir()+ "precio: " + getPrecio()+"€"+"\n" ;
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

    /**
     * @return the grande
     */
    public boolean isGrande() {
        return grande;
    }

    /**
     * @param grande the grande to set
     */
    public void setGrande(boolean grande) {
        this.grande = grande;
    }
    
    
}
