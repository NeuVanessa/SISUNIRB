package fita;

import fita.DadosFita;
import java.util.ArrayList;

public class Main extends DadosFita {

    //A logica da fita eu coloquei da seguinte forma caso algum dado listado abaixo recaba o setCodigo = 0 Essa fita não aparece no array
    //já que esse nado não existe e não foi cadastrado, e só aparece os dados que tem id 2,3.... se setar o código para 1 a fita é adicionada
    public static void main(String[] args) {
        ArrayList<DadosFita> f = new ArrayList();

        System.out.println("==== Aluguel de fita casete Anos 1950 ====\n");

        DadosFita dados1 = new DadosFita();
        dados1.setCodigo(1);//Necessário mudar para zero caso essa fita não esteja ainda cadastrada....
        dados1.setTituloFita("Sade ‎– Diamond Life");
        dados1.setAluguel(1.28);
        dados1.setDescricao("Descrição: Initial releases in North America ");
        f.add(dados1);

        DadosFita dados2 = new DadosFita();
        dados2.setCodigo(2);
        dados2.setTituloFita("Bailão do Peão 2");
        dados2.setAluguel(23.17);
        dados2.setDescricao("Descrição: Polydor – 537 391-2, PolyGram – 537 391-2");
        f.add(dados2);

        DadosFita dados3 = new DadosFita();
        dados3.setCodigo(3);
        dados3.setTituloFita("Pink Floyd ‎– Wish You Were Here");
        dados3.setAluguel(5.51);
        dados3.setDescricao("Descrição: Prog Rock");
        f.add(dados3);

        for (int i = 0; i < f.size(); i++) {

            if (f.get(i).getCodigo() == 0) {
                //Se a fita tive ro valor de zero retorna esse sout
                System.out.println("Nenhuma fita nova cadastrada");

            } else if (f.get(i).getCodigo() == 1) {
                int setCodigo;
                setCodigo = 1;
                System.out.println("Novo Código: " + setCodigo);
                System.out.println(f.get(i).getTituloFita());
                System.out.println(f.get(i).getAluguel());
                System.out.println(f.get(i).getDescricao());
                System.out.println(setCodigo);

            } else if (f.get(i).getAluguel() > 5.0) {
                System.out.println("==== ESSA FITA É ORIGINAL ====\n");
                System.out.println(f.get(i).getCodigo());
                System.out.println(f.get(i).getTituloFita());
                System.out.println(f.get(i).getAluguel());
                System.out.println(f.get(i).getDescricao());

            } else if (f.get(i).getAluguel() < 5.0) {
                System.out.println("==== ESSA FITA É PIRATA ====\n");
                System.out.println(f.get(i).getCodigo());
                System.out.println(f.get(i).getTituloFita());
                System.out.println(f.get(i).getAluguel());
                System.out.println(f.get(i).getDescricao());

            }
        }

    }
}
