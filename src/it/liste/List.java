package it.liste;

import java.util.Iterator;

/**
 * <p>List Class</p>
 *
 * Created by Andrea Brisotto and Matteo Formenti on 19/04/16.
 */
public class List<T> implements Iterable<T>
{
    public Cell first;
    private Cell last;

    /**
     * Returns the size of the list
     * @return The size
     */
    public int size()
    {
        if (first == null)
            return 0;

        Cell c = first;
        int n = 1;
        while (c.getNext() != null)
        {
            c = c.getNext();
            n++;
        }
        return n;
    }

    /**
     * Whether or not the list is empty
     * @return Is empty?
     */
    public boolean isEmpty()
    {
        return first == null;
    }

    /**
     * Check if the list contains The object o
     * @param o The object
     * @return True if found, otherwise false
     */
    public boolean contains(Object o)
    {
        for (T object = (T) first.getObject(); object != null; object = (T) first.getNext().getObject())
            if (object.equals(o))
                return true;
        return false;
    }

    /**
     * Add an object to the tail
     * @param o The object
     * @return True if all ok, otherwise false
     */
    public boolean add(T o)
    {
        try
        {
            if (first == null)
            {
                first = new Cell(o);
                last = first;
            }
            else
            {
                if (first == last)
                {
                    first.setNext(new Cell(o));
                    last = first.getNext();
                }
                else
                {
                    last.setNext(new Cell(o));
                    last = last.getNext();
                }
            }
        }
        catch (Exception e)
        {
            return false;
        }
        return true;
    }

    /**
     * Add an object to a specific position
     * @param o The object
     * @param index The position
     * @return True if all ok, otherwise false
     */
    public boolean add(T o, int index)
    {
        try
        {
            if (index == 0)
            {
                Cell tmp = first.getNext();
                first = new Cell(o, tmp);
            }
            else
            {
                Cell tmp = first;
                for (int i = 0; i < index; i++)
                {
                    if (i == index-1)
                    {
                        Cell tmpNext = tmp.getNext();
                        tmp.setNext(new Cell(o, tmpNext));
                    }
                    tmp = tmp.getNext();
                }
            }
        }
        catch (Exception e)
        {
            return false;
        }
        return true;
    }

    /**
     * Remove the object O
     * @param o The object to remove
     * @return True if ok, otherwise false
     */
    public boolean remove(Object o)
    {
        try
        {
            if (o.equals(first.getObject()))
                first = first.getNext();
            else
            {
                for (Cell cell = first.getNext(); cell.getNext() != null; cell = cell.getNext())
                {
                    if (cell.getNext().getObject().equals(o))
                    {
                        cell.setNext(cell.getNext().getNext());
                    }
                }
            }
            return true;
        }
        catch (Exception e)
        {return false;}
    }

    /**
     * Add all the elements in the list
     * @param objects Array of items
     * @return True if ok, otherwise false
     */
    public boolean addAll(Object... objects)
    {
        for (Object object : objects)
        {
            try
            {
                add((T) object);
            }
            catch (Exception e)
            {
                return false;
            }
        }
        return true;
    }

    /**
     * Retrieves the Iterator
     * @return The iterator
     */
    @Override
    public Iterator iterator()
    {
        return new Iteratore<T>(this);
    }
}