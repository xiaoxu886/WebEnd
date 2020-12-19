package controller;


        import vo.msg;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RestController;
        import service.NewsService;

        import java.util.Map;

@RestController
public class NewsController {
    @Autowired
    NewsService newsService;

    @GetMapping("/getColumns.do")
    public msg getColumns(){
        Map<Integer, Object> columnsList = newsService.getColumns();
        return msg.success().add("columnList",columnsList);
    }
    @GetMapping("/getSection.do")
    public msg getSectionContent(Integer id){
        Map<Integer, Object> sectionContentList = newsService.getSectionContent(id);
        return msg.success().add("sectionContentList",sectionContentList);
    }
}
