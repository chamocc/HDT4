/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
public class ListDoble<E> extends AbstractList<E>{
    
    
    //Codigo tomado de material visto en clase
    //codigo tomado comienza aquí
    //======================================================================
    protected int count;
    protected DoubleLinkedNode<E> head;
    protected DoubleLinkedNode<E> tail;

    public ListDoble()
    // post: constructs an empty list
    {
       head = null;
       tail = null;
       count = 0;
    }


    public void addFirst(E value)
    // pre: value is not null
    // post: adds element to head of list
    {
       // construct a new element, making it head
       head = new DoubleLinkedNode<E>(value, head, null);
       // fix tail, if necessary
       if (tail == null) tail = head;
       count++;
    }
    //Codigo tomado termina aqui
    //====================================================================

    @Override
    public int size() {
        return count;
    }

    @Override
    public E getFirst() {
        return head.value();
    }

    @Override
    public E removeFirst() {
        E val=head.value();
        DoubleLinkedNode<E> nextHead=head.next();
        head=nextHead;
        count--;
        return val;
    }
    
}
