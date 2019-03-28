package com.spring.cloud.server.factory;

import com.spring.cloud.server.entity.Actor;

/**
 * 静态工厂
 */
public class ActorFactory {

    public static Actor getActor1(int id){
        Actor actor=new Actor();
        actor.setId(id);
        actor.setAge(11);
        actor.setName("222");
        return actor;
    }

}
