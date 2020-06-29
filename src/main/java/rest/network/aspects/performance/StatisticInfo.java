package rest.network.aspects.performance;

import lombok.Data;

@Data
public class StatisticInfo {
    private Long calls;
    private Long totalTime;
    private Long worstTime;

    public StatisticInfo() {
        totalTime = 0L;
        calls = 0L;
        worstTime = 0L;
    }

    public void addCallTime(long timeInMills) {
        if (timeInMills > worstTime) {
            worstTime = timeInMills;
        }
        totalTime += timeInMills;
        ++calls;
    }

    public long getAverageTime() {
        return totalTime / calls;
    }
}
