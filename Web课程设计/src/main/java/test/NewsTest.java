package test;


import dao.NewsMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.NewsService;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application.xml"})
public class NewsTest {
    @Autowired
    NewsMapper newsMapper;
    @Autowired
    NewsService newsService;

    @Test
    public void testGet(){
        newsService.getColumns();

    }

}
