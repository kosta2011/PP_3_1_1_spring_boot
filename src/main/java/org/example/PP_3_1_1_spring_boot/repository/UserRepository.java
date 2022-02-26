package org.example.PP_3_1_1_spring_boot.repository;

import org.example.PP_3_1_1_spring_boot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UserRepository extends JpaRepository<User, Long> {
    @Modifying
    @Query(value = "update users set name = :name , last_name = :last_name where id = :id",nativeQuery = true)
    void updateUserById(@Param("id") Long id, @Param("name") String name, @Param("last_name") String lastName);



}
