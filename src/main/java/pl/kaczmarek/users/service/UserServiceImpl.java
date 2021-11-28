package pl.kaczmarek.users.service;


import org.springframework.stereotype.Service;
import pl.kaczmarek.users.dao.UserRepository;
import pl.kaczmarek.users.model.UserEntity;

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
        UserEntity user = UserEntity.getInstance();
        user.setFirstName(imie);
        user.setLastName(nazwisko);
        user.setEmail(email);
        user.setPhone(phone);
        userRepository.save(user);
    }


}
