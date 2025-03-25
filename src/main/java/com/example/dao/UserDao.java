package com.example.dao;

import com.example.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface UserDao extends JpaRepository<User, Long> {
    //根据用户名模糊查询
    @Query(value = "select u from user u where u.name like %?1%",nativeQuery = true)
    Page<User> findNameLike(String name, PageRequest request);
}
