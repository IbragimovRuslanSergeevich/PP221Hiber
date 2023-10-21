package hiber.dao;

import hiber.model.Car;
import hiber.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.stereotype.Repository;
//
//import javax.persistence.Query;
//import javax.persistence.TypedQuery;
//import java.util.List;
//
//
//
//@Repository
//public class UserDaoImp implements UserDao {
//
//
//    //@Autowired
//    //private SessionFactory sessionFactory;
//
//    @Autowired
//    private LocalContainerEntityManagerFactoryBean lcemfb;
//
//    @Override
//    public void add(User user) {
//        lcemfb.getCurrentSession().save(user);
//lcemfb.jp
//    }
//
//    @Override
//    @SuppressWarnings("unchecked")
//    public List<User> listUsers() {
//        TypedQuery<User> query = lcemfb.getCurrentSession().createQuery("from User");
//        return query.getResultList();
//    }
//
//    @Override
//    public List<User> getUser(String carModel, int carSeries) {
//        Session session = lcemfb.getCurrentSession();
//        Query query = session.createQuery("from User where car.model = :carModel and car.series = :carSeries");
//        query.setParameter("carModel", carModel);
//        query.setParameter("carSeries", carSeries);
//        List listCar = query.getResultList();
//        return query.getResultList();
//    }
//
//}
