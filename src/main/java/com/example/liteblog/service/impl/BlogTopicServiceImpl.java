package com.example.liteblog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.liteblog.domain.BlogTopic;
import com.example.liteblog.service.BlogTopicService;
import com.example.liteblog.mapper.BlogTopicMapper;
import org.springframework.stereotype.Service;

/**
* @author HZX
* @description 针对表【blog_topic】的数据库操作Service实现
* @createDate 2023-12-19 00:34:37
*/
@Service
public class BlogTopicServiceImpl extends ServiceImpl<BlogTopicMapper, BlogTopic>
    implements BlogTopicService{

}




