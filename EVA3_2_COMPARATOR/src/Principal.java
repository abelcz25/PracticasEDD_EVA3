
import java.util.Comparator;
import java.util.LinkedList;

/**
 *
 * @author Abel Johany Cazares Amparan
 *          18550400
 *
public class Principal {

    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Integer> lista = new LinkedList<Integer>();
        for (int i = 0; i < 15; i++) {
            lista.add((int)(Math.random() * 100) + 1);
            System.out.print("["+lista.get(i)+"]");
        }
        System.out.println("");
        
        Comparator c = new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                int resu;
                //CERO -->IGUAL
                //POSITIVO -->MAYOR
                //NEGATIVO -->MENOR
                Integer val1,val2;
                val1 = (Integer)o1;
                val2 = (Integer)o2;
                resu = val1 - val2;
                return resu;
            }      
        };
              
        lista.sort(c);
        System.out.println(lista);
        
        //ORDENAMIENTO LISTA DE STRING
        LinkedList<String> listaStr = new LinkedList<String>();
        listaStr.add("Hola");
        listaStr.add(" ");
        listaStr.add("Mundo");
        listaStr.add(" ");
        listaStr.add("Cruel");
        listaStr.add("!!");
        Comparator cmpStr = new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                String cade1 = (String) o1;
                String cade2 = (String) o2;
                char c1 = cade1.charAt(0);
                char c2 = cade2.charAt(0);
                
                return c1 - c2;           
            }
        };
        System.out.println(listaStr);
        listaStr.sort(cmpStr);
        System.out.println(listaStr);
    }
    
}
