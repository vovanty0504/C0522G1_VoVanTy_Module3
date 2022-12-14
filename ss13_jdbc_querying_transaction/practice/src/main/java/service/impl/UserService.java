package service.impl;

import module.User;
import repository.IUserRepository;
import repository.impl.UserRepository;
import service.IUserService;

import java.sql.SQLException;
import java.util.List;

public class UserService implements IUserService {
    private IUserRepository userRepository = new UserRepository();

    @Override
    public List<User> findByAll() {
        return userRepository.findByAll();
    }

    @Override
    public boolean add(User user) {
        return userRepository.add(user);
    }

    @Override
    public User selectUser(int id) {
        return userRepository.selectUser(id);
    }

    @Override
    public boolean update(User user) {
        return userRepository.update(user);
    }

    @Override
    public boolean deleteUser(int id) {
        return userRepository.deleteUser(id);
    }


    @Override
    public List<User> sortByName() {
        return userRepository.sortByName();
    }

    @Override
    public List<User> findByCountry(String name) {
        return userRepository.findByCountry(name);
    }

    @Override
    public User getUserById(int id) {
        return userRepository.getUserById(id);
    }

    @Override
    public boolean insertUserStore(User user) throws SQLException {
      return userRepository.insertUserStore(user);
    }
}
