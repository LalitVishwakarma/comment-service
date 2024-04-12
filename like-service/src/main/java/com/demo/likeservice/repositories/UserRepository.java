package com.demo.likeservice.repositories;


import com.demo.likeservice.entity.ServiceUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<ServiceUser, Long> {
}
