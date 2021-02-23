package com.fvclass.demoproject.mapper;

import com.fvclass.demoproject.domain.Video;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * @author fv
 */
@Repository
public class VideoMapper {


    private static Map<Integer,Video> videoMap = new HashMap<>();
    static {
        videoMap.put(1,new Video(1,"java基础课程"));
        videoMap.put(2,new Video(2,"HTML5基础课程"));
        videoMap.put(3,new Video(3,"MySQL基础课程"));
        videoMap.put(4,new Video(4,"Python基础课程"));
        videoMap.put(5,new Video(5,"C++基础课程"));
    }

    public List<Video> listVideo(){

        List<Video> list = new ArrayList<>();
        list.addAll(videoMap.values());

        return  list;
    }
}
