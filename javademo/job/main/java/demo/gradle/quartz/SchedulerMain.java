package demo.gradle.quartz;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;

import static org.quartz.JobBuilder.newJob;
import static org.quartz.SimpleScheduleBuilder.repeatSecondlyForever;
import static org.quartz.TriggerBuilder.newTrigger;

public class SchedulerMain {

    public static void main(String[] args) throws Exception {
        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
        scheduler.start();
        JobDetail jobDetail = newJob(HelloJob.class).build();
        Trigger trigger = newTrigger()
                .startNow()
                .withSchedule(repeatSecondlyForever(2))
                .build();
        scheduler.scheduleJob(jobDetail, trigger);
    }
}
