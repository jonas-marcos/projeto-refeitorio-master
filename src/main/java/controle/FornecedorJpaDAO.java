package controle;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.Fornecedor;

/**
 *
 * @author Jônatas / Stephen
 */
public class FornecedorJpaDAO {
    
    private static FornecedorJpaDAO instance;
    protected EntityManager entityManager;
    
    public static FornecedorJpaDAO getInstance(){
        if (instance == null){
            instance = new FornecedorJpaDAO();
        }
        return instance;
    }
    
    public FornecedorJpaDAO() {
        this.entityManager = getEntityManager();
    }
    
    private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("sqlite-memory");
        if (entityManager == null) {
            entityManager = factory.createEntityManager();
        }
        return entityManager;
    }
    
    public void persist(Fornecedor fornecedor) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(fornecedor);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
    
    public void merge(Fornecedor fornecedor) {        
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(fornecedor);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
    
    public void remove(Fornecedor fornecedor) {
        try {
            entityManager.getTransaction().begin();
            fornecedor = entityManager.find(Fornecedor.class, fornecedor.getCnpj());
            entityManager.remove(fornecedor);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
}
