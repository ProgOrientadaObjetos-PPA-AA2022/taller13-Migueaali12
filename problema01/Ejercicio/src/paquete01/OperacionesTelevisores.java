
package paquete01;

import java.util.ArrayList;


public class OperacionesTelevisores {
    
    ArrayList<Televisor> listaTelevisores;
    double precioT;
    String marcasVendidas;
    double teleMasCaro;

    public void establecerListaTelevisores(ArrayList<Televisor> n) {
        this.listaTelevisores = n;
    }
    
    public void establecerPrecioTotalTVs(){
        double s = 0;
        for (int i = 0; i < listaTelevisores.size(); i++) {
            s = s + listaTelevisores.get(i).obtenerPrecio();           
        }
        precioT = s;
        
    }
    
    public void establecerTeleMasCaro(){
        
        double masCaro = listaTelevisores.get(0).obtenerPrecio();
        
        for (int i = 0; i < listaTelevisores.size(); i++) {
            
            if (masCaro < listaTelevisores.get(i).obtenerPrecio()) {
                masCaro = listaTelevisores.get(i).obtenerPrecio();               
            }
        }
        teleMasCaro = masCaro;       
    }
    
    public void establecerListaMarcasVendidas(){
        String s = "";
        for (int i = 0; i < listaTelevisores.size(); i++) {
            s = String.format("%s%s\n", s, listaTelevisores.get(i).obtenerMarca());
        }
        marcasVendidas = s;
    }
    
    public double obtenerPrecioTotalTV() {
        return precioT;
    }
    
    public double obtenerTeleMasCaro() {
        return teleMasCaro;
    }
    
    public String obtenerListaVendidos() {
        return marcasVendidas;
    }

    public ArrayList<Televisor> obtenerListaTelevisores() {
        return listaTelevisores;
    }
    
    
    
}
