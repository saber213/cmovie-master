package com.jxau.wmy.mapper;


import com.jxau.wmy.pojo.Watch;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface WatchMapper {

    /**
     * 查看所有清单
     *
     * @return
     */
    @Select("select * from watch")
    List<Watch> getAll();

    /**
     * 添加到列表
     *
     * @param watch
     * @return
     */
    @Insert("insert into `watch`(user_id, movie_id, create_time) values(#{userId},#{movieId},#{createTime})")
    int addWatch(Watch watch);

    /**
     * 从列表中删除
     *
     * @param movieId
     * @return
     */
    @Delete("delete from `watch` where movie_id=#{movieId}")
    int deleteWatch(Integer movieId);

    /**
     * 判断电影是否存在个人列表中
     *
     * @param userId
     * @param movieId
     * @return
     */
    @Select("select * from watch where user_id=#{userId} and movie_id=#{movieId}")
    Watch getWatchByIds(Integer userId, Integer movieId);
}
