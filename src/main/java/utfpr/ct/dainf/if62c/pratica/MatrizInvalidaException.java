/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author a1654314
 */
public class MatrizInvalidaException extends Exception{
    private final int m, n;
    
    public MatrizInvalidaException(int m, int n){
        super(String.format(
        "Matriz de %dx%d não pode ser criada",
        m,n));
        
        this.m = m;
        this.n = n;
    }
   
    public int getNumLinhas(){
        return m;
    }
    
    public int getNumColunas(){
        return n;
    }
    
}
