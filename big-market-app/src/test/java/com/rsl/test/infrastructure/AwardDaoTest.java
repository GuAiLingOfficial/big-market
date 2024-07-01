package com.rsl.test.infrastructure;

import com.alibaba.fastjson.JSON;
import com.rsl.infrastructure.persistent.dao.IAwardDao;
import com.rsl.infrastructure.persistent.po.Award;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ description:奖品持久化单元测试
 * @ author: rsl
 * @ create: 2024-07-01 17:51
 **/
@Slf4j  //为测试类生成 log 对象，方便记录日志
@RunWith(SpringRunner.class)    //用于指定测试运行器。SpringRunner 是 Spring 提供的一个测试运行器，为 Spring 测试框架提供支持
@SpringBootTest     //启动完整的SpringBoot应用上下文，进行集成测试
public class AwardDaoTest {
    @Resource
    private IAwardDao awardDao;

    @Test
    public void testQueryAwardList(){
        List<Award> list = awardDao.queryAwardList();
        log.info("测试结果：{}", JSON.toJSONString(list));
    }

}
