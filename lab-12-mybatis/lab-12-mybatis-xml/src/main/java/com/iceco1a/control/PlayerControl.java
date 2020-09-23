package com.iceco1a.control;

import com.iceco1a.bean.Player;
import com.iceco1a.mapper.PlayerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
public class PlayerControl {

    @Autowired
    private PlayerMapper playerMapper;

    @GetMapping("/getplayerList")
    public List<Player> getPlayerList(){
        return playerMapper.getPlayerList();
    }

    @GetMapping("/player/get/{id}")
    public Player getPlayerById(@PathVariable("id")Long id){
        return playerMapper.getPlayerById(id);
    }

    @PostMapping("/palyer/post")
    public Integer addPlayer(@RequestBody Player player){
        return playerMapper.addPlayer(player);
    }

    @PutMapping("/player/put/{id}")
    public Integer updatePlayer(@PathVariable("id")Long id,@RequestBody Player player){
        return playerMapper.updatePlayer(id,player);
    }

    @DeleteMapping("/player/del/{id}")
    public Integer delPlayer(@PathVariable("id")Long id){
        return playerMapper.delPlayerById(id);
    }

}
