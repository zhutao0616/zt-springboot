package com.lfp.zt.sbweb.dao;

import com.lfp.zt.sbweb.model.User;

/**
 * Project: zt-springboot
 * Title:
 * Description:
 * Date: 2018/5/11
 * Copyright: Copyright (c) 2018
 * Company: qudian
 *
 * @author ZhuTao
 * @version 2.0
 */
public interface UserDao {

    int insert(User user);

    User get(Integer id);

}
