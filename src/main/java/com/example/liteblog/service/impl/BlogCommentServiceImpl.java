package com.example.liteblog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.liteblog.domain.BlogComment;
import com.example.liteblog.service.BlogCommentService;
import com.example.liteblog.mapper.BlogCommentMapper;
import org.springframework.stereotype.Service;

/**
* @author HZX
* @description 针对表【blog_comment】的数据库操作Service实现
* @createDate 2023-12-19 00:34:37
*/
@Service
public class BlogCommentServiceImpl extends ServiceImpl<BlogCommentMapper, BlogComment>
    implements BlogCommentService{

}




