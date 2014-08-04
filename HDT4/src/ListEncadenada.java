/**
 * @author Daniel Gerendas 13158
 * @author Edgar Chamo 13083
 * @since 1/08/2014
 */
public class ListEncadenada<E> extends AbstractList<E> {

    //codigo tomado de material visto en clase
    //Codigo tomado comienza aqui
    //==============================================
    private int count;
    private Node<E> head;
    
    public ListEncadenada()
   // post: generates an empty list
   {
      head = null;
      count = 0;
   }
   
   public int size()
   // post: returns number of elements in list
  {
    return count;
  }
  
    /**
     *
     * @param v valor a guardar
     */
   public void addFirst(E v)
  // post: value is added to beginning of list
  {
     // note order that things happen:
     // head is parameter, then assigned
     head = new Node<E>(v, head);
     count++;
  }
  
  public E removeFirst()
  // pre: list is not empty
  // post: removes and returns value from beginning of list
 {
     Node<E> temp = head;
     head = head.next(); // move head down list
     count--;
     return temp.value();
  }
  
  public E getFirst()
  // pre: list is not empty
  // post: returns first value in list
  {
      return head.value();
  }
  
  //========================================================
  //Aqui termina codigo tmado

}
