package com.tedu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.tedu.pojo.User;

public interface UserMapper {
	@Select("select id,name,birthday,address from user")
	public List<User> findObjects();
	@Insert("insert into user (name,birthday,address) values (#{user.name},#{user.birthday},#{user.address})")
	public void insertObjects(@Param ("user") User user);
	@Update("update user set name=#{user.name},birthday=#{user.birthday},address=#{user.address} where id=#{user.id}")
	public void updateObject(@Param("user")User user);
	@Delete("delete from user where id=#{id}")
	public void deleteObject(Integer id);
}
