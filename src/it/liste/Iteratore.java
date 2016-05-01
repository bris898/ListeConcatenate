package it.liste;

import java.util.Iterator;

/**
 * <p>Iteratore Class</p>
 *
 * Created by Andrea Brisotto and Matteo Formenti on 19/04/16.
 */
public class Iteratore<T> implements Iterator
{
    private List list;
    private Cell cell;

    /**
     * <p>Constructor for the iterator</p>
     *
     * @param lista Concatenated List
     */
    public Iteratore(List lista)
    {
        this.list = lista;
        cell = lista.first;
    }

    /**
     * Whether or not the list is empty
     * @return Is empty?
     */
    @Override
    public boolean hasNext()
    {
        return cell != null;
    }

    /**
     * Get the next item in the list
     * @return The next item
     */
    @Override
    public Object next()
    {
        T value = (T) cell.getObject();
        cell = cell.getNext();
        return value;
    }
}
