package service;

import entity.Demo;
import entity.DemoRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;


/**
 * 提供Demo服务类
 */
@Service
public class DemoService {

    @Resource
    private DemoRepository demoRepository;

    @Transactional

    public void save(Demo demo) {

        demoRepository.save(demo);


    }

}
