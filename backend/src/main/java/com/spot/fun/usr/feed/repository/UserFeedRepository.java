package com.spot.fun.usr.feed.repository;

import com.spot.fun.adm.feed.dto.AdminFeedRequestDTO;
import com.spot.fun.usr.feed.dto.FeedDTO;
import com.spot.fun.usr.feed.dto.FeedRequestDTO;
import com.spot.fun.usr.feed.entity.Feed;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UserFeedRepository extends JpaRepository<Feed, Long> {

  @Query("SELECT f FROM Feed f WHERE f.delYn = false " +
          "AND (:#{#feed.lastId}=0 or f.idx < :#{#feed.lastId})"
//            "AND (:#{#feed.searchValue} is NULL or :#{#feed.searchValue}='' or f.content LIKE %:#{#feed.searchValue}%)"
  )
  List<Feed> findFeedsOrderByIdxDesc(@Param("feed") FeedRequestDTO feedRequestDTO, Pageable pageable);

  Optional<Feed> findByIdxAndDelYnFalse(Long idx);

  @Query("SELECT f FROM Feed f WHERE f.delYn = false " +
          "AND f.user.idx = :#{#feed.userIdx} " +
          "AND (:#{#feed.lastId}=0 or f.idx < :#{#feed.lastId})")
  List<Feed> findFeedsByUserIdxOrderByIdxDesc(@Param("feed") FeedRequestDTO feedRequestDTO, Pageable pageable);

  Long countByUserIdxAndDelYnFalse(Long userIdx);


  @Query("SELECT new com.spot.fun.usr.feed.dto.FeedDTO(" +
          "f.idx, " +
          "f.content, " +
          "f.delYn, " +
          "f.regDate, " +
          "u.userId) " +
          "FROM Feed f " +
          "LEFT JOIN f.user u " +
          "WHERE 1=1 " +
          "AND (:#{#feed.searchValue} is NULL or :#{#feed.searchValue}='' or f.content LIKE %:#{#feed.searchValue}%) ")
  List<FeedDTO> findFeedListByAdminCustom(@Param("feed")AdminFeedRequestDTO adminFeedRequestDTO, Pageable pageable);
  Optional<Feed> findByIdx(Long idx);
}
