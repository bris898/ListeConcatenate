package it.liste;

/**
 * <p>Cell Class</p>
 * This class contains the object
 * Created by Andrea Brisotto and Matteo Formenti on 19/04/16.
 */
public class Cell<T>
{
    private T thisElement;
    private Cell next = null;

    /**
     * Constructor for a cell without next pointer
     * @param thisElement The value
     */
    public Cell(T thisElement)
    {
        this.thisElement = thisElement;
    }

    /**
     * Constructor for a cell with next pointer
     * @param thisElement The value
     * @param next The next cell
     */
    public Cell(T thisElement, Cell next)
    {
        this.thisElement = thisElement;
        this.next = next;
    }

    /**
     * Get the value
     * @return The value
     */
    public T getObject()
    {
        return thisElement;
    }

    /**
     * Get the next cell
     * @return The next cell
     */
    public Cell getNext()
    {
        return next;
    }

    /**
     * Setter for the next cell property
     * @param next The next cell
     */
    public void setNext(Cell next)
    {
        this.next = next;
    }
}
