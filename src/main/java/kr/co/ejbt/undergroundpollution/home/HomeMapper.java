package kr.co.ejbt.undergroundpollution.home;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HomeMapper {

    List<Home> list();
}
