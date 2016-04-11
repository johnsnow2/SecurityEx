package ua.danni;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
//import ua.danni.hibernate.utils.HibernateSessionFactory;
import ua.danni.model.UserEntity;

/**
 * Created by Artem on 03.04.2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hibernate tutorial start");
        UserEntity user = new UserEntity();

       // Session session = HibernateSessionFactory.getSessionFactory().openSession();

       // Transaction tx = session.beginTransaction();
        int idUser = 1;
        String login = "admin";
      //  user =  session.get(UserEntity.class, 1);

        Hibernate.initialize(user);
//
     //  / if (session != null && session.isOpen()) {
         //   tx.commit();
        //    session.close();

        //}
        //System.out.println(user.toString());

    }
}
