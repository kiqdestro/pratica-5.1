/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author kiqdestro
 */
public class ProdMatrizesIncompativeisException extends MatrizesIncompativeisException{

    public ProdMatrizesIncompativeisException(Matriz m1, Matriz m2) {
        
        super(m1, m2, "Matrizes de"+ m1.getMatriz().length +"x"+m1.getMatriz()[0].length+ " e "
                + m2.getMatriz().length+"x"+m2.getMatriz()[0].length + " não podem ser multiplicadas" );  
    }
    //@Override
     
}