package ua.danni.service;

import org.springframework.stereotype.Service;
import ua.danni.dao.CoursesDAOImpl;
import ua.danni.model.CoursesEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Artem on 09.04.2016.
 */
@Service
public interface CourseList {
//1
    public List<CoursesEntity> loadCoursesAdm();

    public boolean deleteCourse(int idcourses);
}
