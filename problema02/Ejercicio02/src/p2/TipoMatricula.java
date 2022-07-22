/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import java.util.ArrayList;
import p1.Matricula;
import p1.MatriculaCampamento;
import p1.MatriculaColegio;

/**
 *
 * @author reroes
 */
public class TipoMatricula {
    
    ArrayList<Matricula> listaMatriculas;
    private double promedioMatriculas; 

    public ArrayList<Matricula> obtenerListaMatriculas() {
        return listaMatriculas;
    }

    public void establecerListaMatriculas(ArrayList<Matricula> n) {
        this.listaMatriculas = n;
    }
    
    public void establecerPromedioTarifas(){
        
        double suma = 0;
        
        for (int i = 0; i < listaMatriculas.size() ; i++) {
            
            suma = suma + listaMatriculas.get(i).obtenerTarifa();
            
        }
        
        promedioMatriculas = suma;
              
    }
    
    public double obtenerPromedioTarifas(){
        return promedioMatriculas;
    }
    
    @Override
    public String toString() {
        
        String cadena = String.format("Lista Matriculas\n");
        
        for (int i = 0; i < listaMatriculas.size() ; i++) {
            
            cadena = String.format("%s"
                    + "%.2f\n",cadena,
                    listaMatriculas.get(i).obtenerTarifa());
            
        }
        
        cadena = String.format("%s"
                + "Promedio matriculas: %.2f",
                cadena,
                obtenerPromedioTarifas());
        
        return cadena;
        
    }
}
