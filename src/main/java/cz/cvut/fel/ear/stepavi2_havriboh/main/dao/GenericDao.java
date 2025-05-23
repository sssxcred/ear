package cz.cvut.fel.ear.stepavi2_havriboh.main.dao;


import java.util.Collection;
import java.util.List;

/**
 * Base interface for data access objects.
 *
 * @param <T>
 */
public interface GenericDao<T> {

    /**
     * Finds entity instance with the specified identifier.
     *
     * @param id Identifier
     * @return Entity instance or {@code null} if no such instance exists
     */
    T find(Integer id);

    /**
     * Finds all instances of the specified class.
     *
     * @return List of instances, possibly empty
     */
    List<T> findAll();

    /**
     * Persists the specified entity.
     *
     * @param entity Entity to persist
     */
    void persist(T entity);

    /**
     * Persists the specified instances.
     *
     * @param entities Entities to persist
     */
    void persist(Collection<T> entities);

    /**
     * Updates the specified entity.
     *
     * @param entity Entity to update
     * @return The updated instance
     */
    T update(T entity);

    /**
     * Removes the specified entity.
     *
     * @param entity Entity to remove
     */
    void remove(T entity);

    /**
     * Checks whether an entity with the specified id exists (and has the type managed by this DAO).
     *
     * @param id Entity identifier
     * @return {@literal true} if entity exists, {@literal false} otherwise
     */
    boolean exists(Integer id);
}
