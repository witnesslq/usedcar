package com.zxd.usedcar.service;

import org.springframework.stereotype.Service;

import com.zxd.usedcar.model.User;

@Service
public interface IUserService {
  User getUserById(int id);
}
