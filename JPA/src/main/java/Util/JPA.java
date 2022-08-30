package Util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPA {
    private static EntityManagerFactory factory;

    static {
        factory = Persistence.createEntityManagerFactory("Init");
    }

    public static EntityManager getEntityManager() {
        return factory.createEntityManager();
    }
}