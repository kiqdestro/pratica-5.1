import utfpr.ct.dainf.if62c.pratica.Matriz;

/**
 * IF62C Fundamentos de Programação 2
 * Exemplo de programação em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica51 {

    public static void main(String[] args) {
        
        Matriz mat1 = new Matriz(3, 3);
        Matriz mat2 = new Matriz(3, 3);
       
        double[][] m1 = mat1.getMatriz();
        double[][] m2 = mat2.getMatriz();
       
        m1[0][0] = 6.0;
        m1[0][1] = 6.0;
        m1[0][2] = 6.0;
        m1[1][0] = 6.0;
        m1[1][1] = 6.0;
        m1[1][2] = 6.0;
        m1[2][0] = 6.0;
        m1[2][1] = 6.0;
        m1[2][2] = 6.0;
       
        m2[0][0] = 3.0;
        m2[0][1] = 3.0;
        m2[0][2] = 3.0;
        m2[1][0] = 3.0;
        m2[1][1] = 3.0;
        m2[1][2] = 3.0;
        m2[2][0] = 3.0;
        m2[2][1] = 3.0;
        m2[2][2] = 3.0;
        
        System.out.println("Matriz original 1 : " + mat1);
        System.out.println("Matriz original 2 : " + mat2);
        
        Matriz S = mat1.soma(mat2);
        System.out.println("A soma é: " + S);
        
        Matriz P = mat1.prod(mat2);
        System.out.println("O produto é:" + P);
      
    }
}