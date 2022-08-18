package entity;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

/**
 *
 *
 * 测试实体类
 *
 */

@Table(name = "CUSTOMERS", catalog = "test")
@Entity //加入这个注解，Demo就会进行持久化了
public class Demo {

    @Id @GeneratedValue
    private int id; //主键

    private String name; //测试名称

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
