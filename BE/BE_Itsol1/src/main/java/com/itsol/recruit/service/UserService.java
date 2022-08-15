package com.itsol.recruit.service;

import com.itsol.recruit.entity.Role;
import com.itsol.recruit.entity.User;
import jdk.nashorn.internal.ir.Optimistic;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface UserService{

    public List<User> getAllUser();

    public User findById(Long id);

    public User findUserByUserName(String userName);

    public User findUserByPhone(String phone);

    public boolean isExistedUser(String userName);

    public boolean isExistedUserByEmail(String Email);

    public User findUserByEmail(String email);

    void sendConfirmUserRegistrationViaEmail(String email);

    void activeAccount(Long id);
    void save (User user);
    Set<Role> findByCode(String code);

    Page<User> getJE(Pageable pageable);

    List<User> getContactJE();

    User deactive(Long id);
}
