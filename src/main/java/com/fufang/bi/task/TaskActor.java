package com.fufang.bi.task;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.fufang.bi.repository.TaskRepository;

import akka.actor.UntypedActor;

@Component
@Scope("prototype")
public class TaskActor extends UntypedActor {

    private static Logger logger = Logger.getLogger(TaskActor.class);

    @Autowired
    private TaskRepository taskDAO;

    @Override
    public void onReceive(Object message) throws Exception {

        Task result = taskDAO.save((Task) message);
        logger.debug("Created task " + result);
    }
}
