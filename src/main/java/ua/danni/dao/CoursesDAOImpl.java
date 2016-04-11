package ua.danni.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
//import ua.danni.hibernate.utils.HibernateSessionFactory;
import org.springframework.transaction.annotation.Transactional;
import ua.danni.model.CoursesEntity;
import ua.danni.service.CourseList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artem on 09.04.2016.
 * import javax.transaction.Transactional;
 * @Transactional
 */

@Repository
@Transactional
public class CoursesDAOImpl implements CourseList {


    @PersistenceContext
    private EntityManager entityManager;

    //Session session = HibernateSessionFactory.getSessionFactory().openSession();
    @Override
    public List<CoursesEntity> loadCoursesAdm() {
        List<CoursesEntity> coursesList = new ArrayList<CoursesEntity>();

            //Query query = session.createQuery("from CoursesEntity");

            //List list = query.list();


       // coursesList = list;

            return coursesList;

    }

    @Override
    public boolean deleteCourse(int idcourse) {
     //  Query query =  session.createQuery("delete CoursesEntity where idCourses = :param");
     //  query.setParameter("param", idcourse);
     //  int result = query.executeUpdate();




       return true;//result > 0;

    }
}
