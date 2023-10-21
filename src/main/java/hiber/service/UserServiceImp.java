package hiber.service;

import hiber.dao.UserDao;
import hiber.model.Car;
import hiber.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserServiceImp implements UserService {

//   @Autowired
//   private UserDao userDao;

    private UserDao userDao;

    public UserServiceImp() {
    }

    @Autowired
    public UserServiceImp(UserDao userDao) {
        super();
        this.userDao = userDao;
    }

    @Transactional
    @Override
    public void add(User user) {
        userDao.save(user);
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> listUsers() {
        List<User> list = new ArrayList<>();
        userDao.findAll().forEach(list::add);
        return list;
    }

//    @Override
//    @Transactional
//    public List<User> getUser(String carModel, int carSeries) {
//        return userDao.getUser(carModel, carSeries);
//    }

}
