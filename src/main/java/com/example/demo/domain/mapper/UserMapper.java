package com.example.demo.domain.mapper;

import com.example.demo.domain.entity.UserEntity;

import java.util.List;

/**
 * @author JIAOJIAO
 */
public interface UserMapper {

    List<UserEntity> getAll();

    UserEntity getOne(Long id);

    void insert(UserEntity user);

    void update(UserEntity user);

    void delete(Long id);

}
