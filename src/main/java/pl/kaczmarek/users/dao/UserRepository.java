package pl.kaczmarek.users.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.kaczmarek.users.model.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {



}