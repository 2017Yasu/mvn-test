package jp.aki.sample;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Logger logger = LogManager.getLogger(App.class);

        logger.info("info message.");
        logger.trace("trace message.");
        logger.debug("debug message.");
        logger.warn("warning message.");
        logger.error("error message.");

        // 変数をログに埋め込む例
        String greeting = "hello";
        String world = "world";
        logger.info("'{}', '{}'", greeting, world);    }
}
