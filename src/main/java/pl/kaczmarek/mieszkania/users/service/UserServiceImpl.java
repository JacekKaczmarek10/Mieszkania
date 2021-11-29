package pl.kaczmarek.mieszkania.users.service;


import org.springframework.stereotype.Service;
import pl.kaczmarek.mieszkania.users.dao.UserRepository;
import pl.kaczmarek.mieszkania.users.model.User;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public void add_user(){


    }

    @Override
    public void add_user(String imie, String nazwisko, String email, String phone) {
        User user = User.getInstance();
        user.setFirstName(imie);
        user.setLastName(nazwisko);
        user.setEmail(email);
        user.setPhone(phone);
        userRepository.save(user);
    }


}
