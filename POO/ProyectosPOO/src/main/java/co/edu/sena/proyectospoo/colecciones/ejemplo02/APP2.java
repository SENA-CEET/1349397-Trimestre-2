package co.edu.sena.proyectospoo.colecciones.ejemplo02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Enrique on 1/06/2017.
 */
public class APP2 {
    public static void main(String[] args) {
        Aprendiz a1 = new Aprendiz("CC","12345", "Miguel Alberto Rosado");
        Aprendiz a2 = new Aprendiz("CC","123454", "Miguel Alberto Rosado");
        Aprendiz a3= new Aprendiz("CC","12345", "Miguel Alberto Rosado");

        List<Aprendiz> lista = new ArrayList<>();
        lista.add(a1);
        lista.add(a2);
        lista.add(a3);

        for (Aprendiz a : lista) {
            System.out.println(a.getTipoDocumento());
            System.out.println(a.getNumeroDocumento());
            System.out.println(a.getNombre());
        }
        System.out.println("----------------------------");
        Set<Aprendiz> conjunto = new HashSet<>();
        conjunto.add(a1);
        conjunto.add(a2);
        conjunto.add(a3);

        for (Aprendiz a:conjunto
             ) {
            System.out.println(a.getTipoDocumento());
            System.out.println(a.getNumeroDocumento());
            System.out.println(a.getNombre());

        }
        System.out.println("--------------------------");

        lista.remove(new Aprendiz("CC", "12345","Miguel Alberto Rosado"));

        for (Aprendiz a : lista) {
            System.out.println(a.getTipoDocumento());
            System.out.println(a.getNumeroDocumento());
            System.out.println(a.getNombre());
        }


        List<Aprendiz> listaBorrar=new ArrayList<>();
        for (Aprendiz a:lista
             ) {
            if(a.equals(a1)){
                listaBorrar.add(a);

            }
        }

        for (Aprendiz a:listaBorrar
             ) {
            lista.remove(a);
        }

        System.out.println("------------------");
        for (Aprendiz l:lista
             ) {
            System.out.println(l.getTipoDocumento());
            System.out.println(l.getNumeroDocumento());
            System.out.println(l.getNombre());
        }




    }
}
