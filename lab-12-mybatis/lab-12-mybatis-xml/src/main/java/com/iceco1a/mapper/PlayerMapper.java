package com.iceco1a.mapper;

import com.iceco1a.bean.Player;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerMapper {
    /**
     * 查询所有的球员
     * @return
     */
    List<Player> getPlayerList();

    /**
     * 根据ID查询某一个球员
     * @param id
     * @return
     */
    Player getPlayerById(@Param("id") Long id);

    /**
     * 新增一个球员
     * @param player
     * @return
     */
    Integer addPlayer(Player player);

    //TODO
    Integer updatePlayer(@Param("id")Long id, Player player);

    Integer delPlayerById(@Param("id")Long id);
}
