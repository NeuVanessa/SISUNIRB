package sisunirb;

public class ProfHorista extends Professor {

    private int horasAula;
    private float salarioHora;

    ProfHorista(String fullname, int mat, int age, int horasAula, float salarioHora) {
        super(fullname, mat, age);
        this.horasAula = horasAula;
        this.salarioHora = salarioHora;
    }

    public void horasTrabalhadas() {
        //Horas semanas na escola 35
        //Valor a Receber p/h 35 
        //Se o Horista trabalhar até 35 horas semanais ele irá receber 25 Reais a hora 
        //Se o Horista trabalahr + de 35 horas ele recebe um bonus de 10 Reais a Hora xD;
        if (getHorasAula() <= 35) {
            setSalarioHora(getHorasAula() * 25);
            System.out.println("Total de Horas Trabalhadas:" + horasAula);
            System.out.println("Slário Atualizado Horista:" + salarioHora);
        } else {
            setSalarioHora((35 * 25) + ((getHorasAula() - 35) * 10));
            System.out.println("Total de Horas Trabalhadas:" + horasAula);
            System.out.println("Salário Atualizado Horista: " + salarioHora);
        }
    }

    /**
     * @return the horasAula
     */
    public int getHorasAula() {
        return horasAula;
    }

    /**
     * @param horasAula the horasAula to set
     */
    public void setHorasAula(int horasAula) {
        this.horasAula = horasAula;
    }

    /**
     * @return the salarioHora
     */
    public float getSalarioHora() {
        return salarioHora;
    }

    /**
     * @param salarioHora the salarioHora to set
     */
    public void setSalarioHora(float salarioHora) {
        this.salarioHora = salarioHora;
    }
}
