package com.tr.sbmx.service.girl;

import com.tr.sbmx.dao.girl.GirlRepository;
import com.tr.sbmx.entity.Girl;
import com.tr.sbmx.enums.ResultEnum;
import com.tr.sbmx.exception.MyException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author taorun
 * 2017/8/4 上午10:14
 */

@Service
public class GirlService {

    @Resource
    private GirlRepository girlRepository;

    @Transactional // 事务注解，该方法若报错，都不执行，即三条数据都不会插入。
    public void insertThree() {
        Girl girl1 = new Girl();
        girl1.setAge(20);
        girl1.setName("Lucy");
        girlRepository.save(girl1);

        Girl girl2 = new Girl();
        girl2.setAge(20);
        girl2.setName("Taylor");
        girlRepository.save(girl2);

        Girl girl3 = new Girl();
        girl3.setAge(20);
        girl3.setName("Amy");
        girlRepository.save(girl3);
    }

    public void getAge(Integer id) throws Exception {
        Girl girl = girlRepository.findOne(id);
        if (girl.getAge() <= 12) {
            throw new MyException(ResultEnum.ERROR_CHILD);
        } else if (girl.getAge() > 12 && girl.getAge() < 18) {
            throw new MyException(ResultEnum.ERROR_TEENAGER);
        }
    }

}
