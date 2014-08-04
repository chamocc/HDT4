/**
 * @author Daniel Gerendas 13158
 * @author Edgar Chamo 13083
 * @since 1/08/2014
 */
import java.util.*;
public class StackVector <E> extends AbstractStack <E> {
    protected Vector<E> data;
    private int index=0;
    
    public StackVector()
    //post: construye un nuevo stack vacio
    {
        data=new Vector<E>();
    }
    
    @Override
    public void push(E item) {
        //pre:
        //post: se agrga un elemento al stack
        data.add(index,item);
        index++;
    }

    @Override
    public E pop() {
        //pre: hay algo en el stack
        //post: se extrae el primer elemento del stack
        if (data.isEmpty() == true)
        {
            return null;
        }
        else {     
        E elemento;
        index--;
        elemento = data.elementAt(index);
        data.removeElementAt(index);
        return elemento;
        }
    }

    @Override
    public E peek() {
        //pre: hay algo en el stack
        //post: se lee el primer elemento en el stack
         if (data.isEmpty() == true)
        {
            return null;
        }
        else {  
        return data.elementAt(index-1);
         }
    }


    @Override
    public int size() {
        //pre:
        //post: regresa la cantidad de datos presentes en el stack
        return data.size();
    }

    
}
