package com.jxau.wmy.mapper;

import com.jxau.wmy.pojo.Review;
import com.jxau.wmy.pojo.ReviewVo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ReviewMapper {

    /**
     * 添加评论
     *
     * @param review
     * @return
     */
    @Insert("insert into `review`(content,movie_id,user_id,create_time)" +
            " values(#{content},#{movieId},#{userId},#{createTime})")
    int addReview(Review review);

    /**
     * 获取所有评论
     *
     * @return
     */
    @Select("select * from `review`")
    List<Review> getAll();

    /**
     * 获取某电影的评论
     *
     * @param movieId
     * @return
     */
    @Select("SELECT r.*,nickname FROM `review` r LEFT JOIN `user` u on user_id=u.id where movie_id=#{movieId} order by r.create_time DESC")
    List<ReviewVo> getMovieReview(Integer movieId);
}
