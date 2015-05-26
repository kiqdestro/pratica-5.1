/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author a1658930
 */
public class MatrizInvalidaException extends Exception {
    
    private final Matriz m;

    MatrizInvalidaException(Matriz m) {
        super(String.format(
        "Matriz %dx%d não pode ser criada",
                m.getMatriz().length, m.getMatriz()[0].length))
    }
    
    
    public int getNumLinhas(int numLinhas) {
        return numLinhas;
    }
    
    public int getNumColunas (int numColunas) {
        return numColunas;
    }
}
