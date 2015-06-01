package utfpr.ct.dainf.if62c.pratica;

/**
 * Representa uma matriz de valores {@code double}.
 * @author Wilson Horstmeyer Bogadao <wilson@utfpr.edu.br>
 */public class Matriz {
    
    // a matriz representada por esta classe
    private final double[][] mat;
    
    /**
     * Construtor que aloca a matriz.
     * @param m O número de linhas da matriz.
     * @param n O número de colunas da matriz.
     * @throws utfpr.ct.dainf.if62c.pratica.MatrizInvalidaException
     */
    public Matriz(int m, int n) throws MatrizInvalidaException {
        if(m<=0 || n<=0)
            throw new MatrizInvalidaException(m, n);
        
        
        mat = new double[m][n];
    }
    
    /**
     * Retorna a matriz representada por esta classe.
     * @return A matriz representada por esta classe
     */
    public double[][] getMatriz() {
        return mat;
    }
    
    /**
     * Retorna a matriz transposta.
     * @return A matriz transposta.
     * @throws utfpr.ct.dainf.if62c.pratica.MatrizInvalidaException
     */
    public Matriz getTransposta() throws MatrizInvalidaException {
        try{
        Matriz t = new Matriz(mat[0].length, mat.length);
             
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                t.mat[j][i] = mat[i][j];
            }
        }
        return t;
        } catch(MatrizInvalidaException e){
            System.err.println(e);
            return null;
        }
    }
    
    /**
     * Retorna a soma desta matriz com a matriz recebida como argumento.
     * @param m A matriz a ser somada
     * @return A soma das matrizes
     * @throws utfpr.ct.dainf.if62c.pratica.MatrizInvalidaException
     */
    public Matriz soma(Matriz m) throws SomaMatrizesIncompativeisException, MatrizInvalidaException {
            
       if(m.getMatriz().length != mat.length || m.getMatriz()[0].length != mat[0].length)
             throw new SomaMatrizesIncompativeisException(this, m);
             
       int i,j;
       
       Matriz Soma = new Matriz(mat.length, mat[0].length);
       
        for (i = 0; i < mat.length ; i++)
            for(j=0; j< mat[0].length; j++) {
                Soma.mat[i][j] = mat[i][j] + m.mat[i][j];
            
        }
        
        return Soma;
    }

    /**
     * Retorna o Produto desta matriz com a matriz recebida como argumento.
     * @param m A matriz a ser multiplicada
     * @return O Produto das matrizes
     * @throws utfpr.ct.dainf.if62c.pratica.MatrizInvalidaException
     */
    public Matriz prod(Matriz m) throws MatrizInvalidaException {
        
       if(m.getMatriz().length != mat.length || m.getMatriz()[0].length != mat[0].length)
            throw new ProdMatrizesIncompativeisException(this, m);
       
        int i, j, k;
       
       Matriz Produto = new Matriz(mat.length, m.mat[0].length);
       
        for (i=0; i < mat.length; i++)
            for (j = 0; j < m.mat[0].length; j++)
                for(k = 0 ; k < mat[0].length ; k++) {
                    Produto.mat[i][j] += mat[i][k] * m.mat[k][j];
                }
       
        return Produto;
        }
    

    /**
     * Retorna uma representação textual da matriz.
     * Este método não deve ser usado com matrizes muito grandes
     * pois não gerencia adequadamente o tamanho do string e
     * poderia provocar um uso excessivo de recursos.
     * @return Uma representação textual da matriz.
     */
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (double[] linha: mat) {
            s.append("[ ");
            for (double x: linha) {
                s.append(x).append(" ");
            }
            s.append("]");
        }
        return s.toString();
    }
    
}
