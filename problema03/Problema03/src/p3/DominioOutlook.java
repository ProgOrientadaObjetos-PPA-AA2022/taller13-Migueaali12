/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

/**
 *
 * @author reroes
 */
public class DominioOutlook implements DominioCorreo{
    
    private String dominio;
    
    @Override
    public void establecerDominio(){
        dominio = "Outlook.com";
    }
    
    @Override
    public String obtenerDominio(){
        return dominio;
    }
    
    @Override
    public String toString() {
        
        String cadena = "Dominio Outlook\n";
        
        
        
        
        
        return cadena;
        
        
    }
}