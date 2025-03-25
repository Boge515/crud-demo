package com.example.service;

import com.example.dao.UserDao;
import com.example.entity.User;
import jakarta.annotation.Resource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Resource
    private UserDao userDao;

    /*
    * 新增或修改*/
    public void save(User user) {
        userDao.save(user);

    }

    /*
    * 删除*/
    public void delete(Long id) {
        userDao.deleteById(id);
    }

    /*根据id查找
    * */
    public User findById(Long id) {
        return userDao.findById(id).orElse(null);
    }

    //根据名字模糊查询
    public Page<User> findPage(Integer pageNum,Integer pageSize,String name) {
        Sort sort = Sort.by(Sort.Direction.DESC, "creat_time");//根据创建时间降序排序
        PageRequest request = PageRequest.of(pageNum-1, pageSize,sort);//分页查询
        return userDao.findNameLike(name,request);
    }
}
