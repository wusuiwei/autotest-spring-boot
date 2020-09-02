package com.baidu.cases;

import io.github.wusuiwei.entity.UserEntity;
import io.github.wusuiwei.dao.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class JPATest {
    @Autowired
    UserRepository userRepository;

    @Test
    public void test() {
        userRepository.save(new UserEntity());
    }
}
