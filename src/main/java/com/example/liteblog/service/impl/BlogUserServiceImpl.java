package com.example.liteblog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.liteblog.domain.BlogUser;
import com.example.liteblog.service.BlogUserService;
import com.example.liteblog.mapper.BlogUserMapper;
import org.springframework.stereotype.Service;

/**
* @author HZX
* @description 针对表【blog_user】的数据库操作Service实现
* @createDate 2023-12-19 00:34:37
*/
@Service
public class BlogUserServiceImpl extends ServiceImpl<BlogUserMapper, BlogUser>
    implements BlogUserService{

}




