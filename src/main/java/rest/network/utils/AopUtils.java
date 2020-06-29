package rest.network.utils;

import lombok.NonNull;
import lombok.experimental.UtilityClass;
import org.aspectj.lang.ProceedingJoinPoint;

@UtilityClass
public class AopUtils {

    public String getJoinPointName(@NonNull ProceedingJoinPoint joinPoint) {
        return joinPoint.getTarget().getClass().getName() + '.' + joinPoint.getSignature().getName();
    }
}
