package rest.network.aspects.performance;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;
import rest.network.utils.AopUtils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Aspect
@Slf4j
@Component
public class PerformanceLoggingAspect {
    private final Map<String, StatisticInfo> statisticInfoMap = new ConcurrentHashMap<>();

    @Pointcut("@annotation(PerformanceLog)")
    public void withAnnotation() { }

    @Around("withAnnotation()")
    public Object performanceLog(ProceedingJoinPoint pjp) throws Throwable {
        String methodName = AopUtils.getJoinPointName(pjp);
        final StopWatch watch = new StopWatch();

        log.info("##stat## method {} execution started", methodName);
        Object retVal = executeWithStopWatch(pjp, watch);
        StatisticInfo statistic = getStatistic(methodName, watch.getLastTaskTimeMillis());
        logStatistic(methodName, watch.getLastTaskTimeMillis(), statistic);

        return retVal;
    }

    private Object executeWithStopWatch(ProceedingJoinPoint pjp, StopWatch watch) throws Throwable {
        watch.start();
        Object retVal = pjp.proceed();
        watch.stop();
        return retVal;
    }

    private StatisticInfo getStatistic(String key, long lastTaskTimeMillis) {
        var info = statisticInfoMap.computeIfAbsent(key, method -> new StatisticInfo());
        info.addCallTime(lastTaskTimeMillis);

        return info;
    }

    private void logStatistic(String method, Long currentExecutionTime, StatisticInfo statistic) {
        log.info("##stat## method {} execution finished in {} ms, worst time {} ms, average time {} ms",
                method,
                currentExecutionTime,
                statistic.getWorstTime(),
                statistic.getAverageTime()
        );
    }
}
