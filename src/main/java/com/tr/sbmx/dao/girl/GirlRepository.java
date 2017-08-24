package com.tr.sbmx.dao.girl;

import com.tr.sbmx.entity.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * JpaRepository 传入对象和对象Id的类型作为参数
 */
public interface GirlRepository extends JpaRepository<Girl, Integer> {

    /**
     * 按 age 查询
     * @param age
     * @return
     */
    public List<Girl> findByAge(Integer age);

}
