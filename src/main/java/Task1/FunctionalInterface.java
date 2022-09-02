package Task1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@java.lang.FunctionalInterface
public interface FunctionalInterface {
    Logger LOGGER = LogManager.getLogger(FunctionalInterface.class);

    Integer method1(Integer i);

    default void defaultMethod1() {
        LOGGER.info("defaultMethod1");
    }

    default void defaultMethod2() {
        LOGGER.info("defaultMethod2");

    }

    static void staticMethod1() {
        LOGGER.info("staticMethod1");
    }

    static void staticMethod2() {
        LOGGER.info("staticMethod2");

    }
}
