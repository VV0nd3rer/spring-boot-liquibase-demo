package kverchi.learning.dao.impl;

import kverchi.learning.dao.InformationDao;
import kverchi.learning.domain.Information;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Created by Liudmyla Melnychuk on 10.10.2017.
 */
@Repository
public class InformationDaoImpl implements InformationDao {
    final static Logger logger = Logger.getLogger(InformationDaoImpl.class);
    @Autowired
    protected EntityManagerFactory entityManagerFactory;
    @Override
    public List<Information> getAllRecords() {
        EntityManager entityManager = null;
        List<Information> objList = null;
        try {
            entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            CriteriaBuilder builder = entityManager.getCriteriaBuilder();
            CriteriaQuery<Information> criteriaQuery = builder.createQuery(Information.class);
            Root<Information> obj = criteriaQuery.from(Information.class);
            criteriaQuery.select(obj);
            TypedQuery<Information> query = entityManager.createQuery(criteriaQuery);
            objList = query.getResultList();
            entityManager.getTransaction().commit();
        } catch(PersistenceException e) {
            logger.error("DBException: message -> " +  e.getMessage() + " cause -> " + e.getCause());
        } finally {
            if (entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
        }
        return objList;
    }
}
