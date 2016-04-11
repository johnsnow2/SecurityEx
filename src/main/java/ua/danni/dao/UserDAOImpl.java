package ua.danni.dao;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.*;
import org.springframework.stereotype.Repository;

//import ua.danni.hibernate.utils.HibernateSessionFactory;
import ua.danni.model.CustomUser;
import ua.danni.model.Role;
import ua.danni.Role_enum;
import ua.danni.model.UserEntity;

@Repository
public class UserDAOImpl {

    public CustomUser loadUserByUsername(final String username) {
        UserEntity userEntity = new UserEntity();


        /*Session session = HibernateSessionFactory.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();


        Query query = session.createSQLQuery("SELECT password FROM epamex.user WHERE login='admin';");

        List list = query.list();
        list.get(0);


        tx.commit();
        session.close();
             user.setFirstName("admin");
        user.setLastName("admin");
        user.setUsername("admin");
        user.setPassword(list.get(0).toString());
*/

        //Write your DB call code to get the user details from DB,But I am just hard coding the user
        Role r = new Role();

        CustomUser user = new CustomUser();
       userEntity = getUserByLogin(username);
        Role_enum r_enum = Role_enum.getRole(userEntity);


        //Integer idUser = Integer.valueOf(id);
        user.setFirstName(String.valueOf(userEntity.getIdRole()));
        user.setLastName(String.valueOf(userEntity.getIdRole()));
        user.setUsername(userEntity.getLogin());
        user.setPassword(userEntity.getPassword());

        r.setName(r_enum.getName());//r_enum.getName()
        List<Role> roles = new ArrayList<Role>();
        roles.add(r);
        user.setAuthorities(roles);
        return user;
    }


 public UserEntity getUserByLogin(String login) {

        UserEntity user = new UserEntity();
        int idUser;
       // Session session = HibernateSessionFactory.getSessionFactory().openSession();

        //Transaction tx = session.beginTransaction();



   //  SQLQuery query = session.createSQLQuery("SELECT idUser FROM user where login='"+login+"';");

    // List<Integer> rows = query.list();


   //  idUser = rows.get(0);

      //  user =  session.get(UserEntity.class, idUser);

            Hibernate.initialize(user);

        //if (session != null && session.isOpen()) {
        //    tx.commit();
        //    session.close();

      //  }
        return user;
    }

}