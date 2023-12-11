package com.summerbn.movies_be_spring.repository;

import com.summerbn.movies_be_spring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
