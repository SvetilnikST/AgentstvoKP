
package me.svetilnik.dbService.DAO.interf;

import java.util.List;

public interface Dao<T> {
    /**
     * Base method for object saving (controls object inserting and updating).
     *
     * @param entity object to save
     */
    public void saveObject(T entity);
 
    /**
     * Base method for deleting a specified object
     *
     * @param entity a object to delete
     */
    public void deleteObject(T entity);
 
    /**
     * Base method for object deleting that bases on object class and id.
     *
     * @param id - an id (primary key) of the object
     */
    public void deleteObject(Number id);
 
    /**
     * Base method for extracting object that bases on object class and id. If
     * no object found returns null
     *
     * @param id the identifier (primary key) of the class
     * @return filled object
     */
    public T getObject(Number id);
 
    /**
     * Base method that used to extract all objects of concrete type. Like
     * record search in a table
     *
     * @return list of filled objects
     */
    public List<T> getAllObjects();
 
    /**
     * Get count of all objects of given type.
     *
     * @return count of objects
     */
    public int getAllObjectsCount();
 
    /**
     * The HQL, SQL or other request in the form of the prepared statement.
     *
     * @param request the request to database
     * @param values  values to put instead of "?"
     * @return list of objects that setisfy the criteria
     */
    public List<T> getObjects(String request, Object[] values);
}