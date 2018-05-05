package cn.likaihai.com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import cn.likaihai.com.pojo.User;

@CacheConfig(cacheNames="baseCache")
public interface UserMapper {

	@Select("SELECT * FROM usertest WHERE username = #{username}")
	@Cacheable
	List<User> findUserByName(@Param("username") String username);
	
	@Insert("INSERT INTO usertest(age,username) value(#{age},#{name})")
	int insertUser(@Param("age") Integer age, @Param("name") String name);
}
