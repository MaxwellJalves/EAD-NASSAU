import java.util.List;
import java.util.ArrayList;

public class View {
   
    public static void main (String[] args){

        System.out.println(" ---------------------------------------------");
        System.out.println(" --------------EAD UNINABUCO------------------");
        System.out.println(" ---------------------------------------------");

        System.out.println(" ---------------------ALUNOS-----------------------");
        List <Alunos> a = new ArrayList <Alunos>();
        a.add(new Alunos("Maxwell","082.452.343-23",30,1.85,.90,true));
        a.add(new Alunos("Jose","022.832.383-23",30,1.85,.90,false));

        
        for(int i=0; i < a.size(); i++)
            System.out.println(a.get(i));
        //
        System.out.println(" ------------------------PACOTES---------------------");
        List <Pacotes> p = new ArrayList <Pacotes>();
        p.add(new Pacotes("Jose","022.832.383-23",30,1.85,.90,false,1));
        System.out.println(p.get(0));

    }
}
