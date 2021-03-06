
import java.util.Scanner;

/**
 * @author Daniel Gerendas 13158
 * @author Edgar Chamo 13083
 * @since 1/08/2014
 */
public class StackFactory<E> {
    public Stack getStack(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese Implementacion del Stack: \n0: StackVector\n1: StackList\n2: StackArrayList\n");
        int param=entrada.nextInt();
        entrada.nextLine();
        switch (param){
            case 0:
                return new StackVector<E>();
            case 1:
                return new StackList<E>();
            case 2:
                return new StackArrayList<E>();
        }
        return null;
    }
}
