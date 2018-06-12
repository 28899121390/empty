package com.baizhi.service;

import com.baizhi.entity.Admin;


/**
 * Created by skl on 2018/5/29.
 */
public interface AdminService {
    public Admin login(Admin admin);
    public void modfiy(Admin admin);
}
