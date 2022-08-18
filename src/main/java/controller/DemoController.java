package controller;
import entity.Demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.DemoService;

import javax.annotation.Resource;

/**
 * 测试类
 */


@RestController
@RequestMapping("/demo")
public class DemoController {

    @Resource

    private DemoService demoService;

    /**
     * 测试保存方法
     *
     * @return
     */

    @RequestMapping("/save")

    public String save() {

        Demo dm = new Demo();
        dm.setId(1);
        dm.setName("赵四");
        demoService.save(dm);//保存数据


 return "ok.DemoController.save";

    }
}
