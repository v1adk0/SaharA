package ru.v1adk0.sahara.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.v1adk0.sahara.Entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
}
