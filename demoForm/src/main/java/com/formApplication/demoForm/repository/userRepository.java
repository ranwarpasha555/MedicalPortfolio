package com.formApplication.demoForm.repository;

import com.formApplication.demoForm.Entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<UserDetails,Integer>{
}
