package practice.interviewQuestions.forceDeadlock;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class DetectDeadlock {
    public static void detectDeadlock() {
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        long[] deadlockedThreads = threadMXBean.findDeadlockedThreads();

        if (deadlockedThreads != null) {
            System.out.println("Deadlock detected!");
            ThreadInfo[] threadInfos = threadMXBean.getThreadInfo(deadlockedThreads);

            for (ThreadInfo threadInfo : threadInfos) {
                System.out.println("Thread " + threadInfo.getThreadName() + " is blocked on " + threadInfo.getLockName());
            }
        } else {
            System.out.println("No deadlock detected.");
        }
    }

    public static void main(String[] args) {
        detectDeadlock();
    }
}
