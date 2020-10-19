package com.jxau.wmy.mapper;

import com.jxau.wmy.pojo.Score;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ScoreMapper {
    /**
     * 添加评分
     * @param score
     * @return
     */
    @Insert("insert into score(movie_id,score,user_id) values(#{movieId},#{score},#{userId})")
    int addScore(Score score);

    /**
     * 根据用户id和电影id查询分数
     * @param userId
     * @param movieId
     * @return
     */
    @Select("select score from score where user_id = #{userId} and movie_id = #{movieId}")
    List<Score> getScoreByUserIdAndMovieId(Integer userId, Integer movieId);
}
