package tech.wetech.weshop.amqp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tech.wetech.weshop.po.Footprint;
import tech.wetech.weshop.service.FootprintService;

/**
 * 用户足迹Receiver
 *
 * @author cjbi@outlook.com
 */
@Component
@RabbitListener(queues = "${message.queue.footprint}")
public class FootprintReceiver {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private FootprintService footprintService;

    @RabbitHandler
    public void process(Footprint footprint) {
        logger.info("process footprint message,message is:{}", footprint);
        footprintService.create(footprint);
    }

}
