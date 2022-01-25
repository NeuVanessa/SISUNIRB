package sisunirb;

import java.util.ArrayList;

public class Escola extends Professor {

    public static void main(String[] args) {

        //Professores Horistas
        ArrayList<ProfHorista> horista = new ArrayList();
        ProfHorista horista1 = new ProfHorista("Vanessa Lopes", 001, 22, 40, 875);
        horista.add(horista1);
        ProfHorista horista2 = new ProfHorista("Marcos Paulo", 002, 32, 60, 875);
        horista.add(horista2);
        ProfHorista horista3 = new ProfHorista("Monaliza Fifi", 003, 40, 35, 875);
        horista.add(horista3);

        //Professores Regine
        ArrayList<ProfRegime> regime = new ArrayList();
        ProfRegime regime1 = new ProfRegime("Fábio Fonseca", 001, 46, 1200.00);
        regime.add(regime1);
        ProfRegime regime2 = new ProfRegime("Igor Pimenta", 002, 32, 1200.00);
        regime.add(regime2);

        try {
            System.out.println("PROFESSORES HORISTAS");
            System.out.println("DEMOSTRATIVO DE PAGAMENTO");
            //Percorrendo o Array de professores e resgatando os dados
            for (ProfHorista i : horista) {
                System.out.println("==== HORISTAS ====");
                System.out.println("Nome Completo:" + i.getFullname());
                System.out.println("Idade:" + i.getAge());
                System.out.println("Matricula:" + i.getMat());
                System.out.println("Salário Base Total de 35/h Semanal:" + i.getSalarioHora());
                i.horasTrabalhadas();
            }
            System.out.println("==============================================");
            System.out.println("PROFESSORES REGIME FECHADO");
            System.out.println("DEMOSTRATIVO DE PAGAMENTO");

            for (ProfRegime i : regime) {
                System.out.println("==== REGIME ====");
                System.out.println("Nome Completo:" + i.getFullname());
                System.out.println("Idade:" + i.getAge());
                System.out.println("Matricula:" + i.getMat());
                System.out.println("Salário:" + i.getSalario());
                ;
            }
        } catch (Exception e) {
            System.out.println("PADAWAN OCORREU UM ERRO AQUI O: " + e);

        } finally {
            System.out.println("TERMINA AQUI: ");

        }
    }

    public Escola(String fullname, int mat, int age) {
        super(fullname, mat, age);
    }
}
