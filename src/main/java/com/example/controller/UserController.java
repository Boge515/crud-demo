package com.example.controller;

import com.example.common.Result;
import com.example.entity.User;
import com.example.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    /*新增用户*/
    @PostMapping
    public Result add(@RequestBody User user){
        userService.save(user);
        return Result.success();
    }

    /*删除用户*/
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Long id){
        userService.delete(id);
        return Result.success();
    }

    @GetMapping("/{id}")
    public Result<User> findById(@PathVariable Long id){
        return Result.success(userService.findById(id));
    }

    // 分页查询用户
    @GetMapping("/page")
    public Result<Page<User>> findPage(@RequestParam(defaultValue = "1") Integer pageNum,
                                       @RequestParam(defaultValue = "10") Integer pageSize,
                                       @RequestParam(required = false) String name) {
        return Result.success(userService.findPage(pageNum, pageSize, name));
    }
}
