package fita;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Neu_Junior
 */
public class DadosFita {

    private int Codigo;
    private String tituloFita;
    private double aluguel;
    private String descricao;

    /**
     * @return the Codigo
     */
    public int getCodigo() {
        return Codigo;
    }

    /**
     * @param Codigo the Codigo to set
     */
    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    /**
     * @return the tituloFita
     */
    public String getTituloFita() {
        return tituloFita;
    }

    /**
     * @param tituloFita the tituloFita to set
     */
    public void setTituloFita(String tituloFita) {
        this.tituloFita = tituloFita;
    }

    /**
     * @return the aluguel
     */
    public double getAluguel() {
        return aluguel;
    }

    /**
     * @param aluguel the aluguel to set
     */
    public void setAluguel(double aluguel) {
        this.aluguel = aluguel;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
      
    public void horasTrabalhadas() {
    
    }
    public String toString() {
        return +this.getCodigo() + this.getTituloFita() + this.getAluguel() + this.getDescricao();
    }
}
