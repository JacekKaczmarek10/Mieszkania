package pl.kaczmarek.mieszkania.users.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.kaczmarek.mieszkania.users.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {



}
