package com.example.liteblog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.liteblog.domain.BlogPost;
import com.example.liteblog.service.BlogPostService;
import com.example.liteblog.mapper.BlogPostMapper;
import org.springframework.stereotype.Service;

/**
* @author HZX
* @description 针对表【blog_post】的数据库操作Service实现
* @createDate 2023-12-19 00:34:37
*/
@Service
public class BlogPostServiceImpl extends ServiceImpl<BlogPostMapper, BlogPost>
    implements BlogPostService{

}




