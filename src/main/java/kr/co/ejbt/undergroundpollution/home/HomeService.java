package kr.co.ejbt.undergroundpollution.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeService {

    @Autowired
    HomeMapper homeMapper;

    public List<Home> list() {
        return homeMapper.list();
    }
}
