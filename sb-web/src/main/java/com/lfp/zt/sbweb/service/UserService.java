package com.lfp.zt.sbweb.service;

import com.lfp.zt.sbweb.model.User;

import java.util.List;

/**
 * Project: zt-springboot
 * Title:
 * Description:
 * Date: 2018/5/14
 * Copyright: Copyright (c) 2018
 * Company: qudian
 *
 * @author ZhuTao
 * @version 2.0
 */
public interface UserService {

    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);

}
