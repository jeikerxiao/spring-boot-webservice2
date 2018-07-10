package com.jeiker.service;

import com.jeiker.dto.User;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by Administrator on 2018/7/10 0010.
 */
@WebService
public interface UserService {

    @WebMethod
    String getName(@WebParam(name = "userId") String userId);

    @WebMethod
    User getUser(String userId);
}