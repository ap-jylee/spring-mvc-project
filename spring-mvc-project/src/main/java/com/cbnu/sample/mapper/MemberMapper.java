package com.cbnu.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.cbnu.sample.entity.Member;

public interface MemberMapper {
	
	List<Member> findAll();
	
	@Select("SELECT * FROM member WHERE id = #{id}")
	Member findOne(@Param("id") String id);

}
