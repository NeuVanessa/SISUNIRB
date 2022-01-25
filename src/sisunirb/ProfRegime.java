/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisunirb;

/**
 *
 * @author Neu_Junior
 */
public class ProfRegime extends Professor {
     private double salario;
     
    public ProfRegime(String fullname, int mat, int age,double salario) {
        super(fullname, mat, age);
        this.fullname = fullname;
        this.salario = salario;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
