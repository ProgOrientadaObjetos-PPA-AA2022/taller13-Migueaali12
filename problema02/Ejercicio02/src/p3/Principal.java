/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

import java.util.ArrayList;
import p1.Matricula;
import p1.MatriculaCampamento;
import p1.MatriculaColegio;
import p1.MatriculaEscuela;
import p1.MatriculaJardin;
import p1.MatriculaMaternal;
import p2.TipoMatricula;

/**
 *
 * @author reroes
 */
public class Principal {
    
    public static void main(String[] args) {
        
        TipoMatricula tipos = new TipoMatricula();
        
        ArrayList<Matricula> listaMatricula = new ArrayList<>();
        
        MatriculaCampamento mcamp = new MatriculaCampamento();
        mcamp.establecerTarifa();
        listaMatricula.add(mcamp);
        
        MatriculaColegio mcolegio = new MatriculaColegio();
        mcolegio.establecerTarifa();
        listaMatricula.add(mcolegio);
        
        MatriculaEscuela mescuela = new MatriculaEscuela();
        mescuela.establecerTarifa();
        listaMatricula.add(mescuela);
        
        MatriculaJardin mjardin = new MatriculaJardin();
        mjardin.establecerTarifa();
        listaMatricula.add(mjardin);
        
        MatriculaMaternal mmaternal = new MatriculaMaternal();
        mmaternal.establecerTarifa();
        listaMatricula.add(mmaternal);
        
        MatriculaMaternal mmaternal2 = new MatriculaMaternal();
        mmaternal2.establecerTarifa();
        listaMatricula.add(mmaternal2);
        
        tipos.establecerListaMatriculas(listaMatricula);
        tipos.establecerPromedioTarifas();
        System.out.printf("%s\n", tipos);
        
    }
}
