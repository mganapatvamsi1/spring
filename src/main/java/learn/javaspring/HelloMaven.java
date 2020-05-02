package learn.javaspring;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
public class HelloMaven {

//    public final static Logger log = LoggerFactory.getLogger(HelloMaven.class);

    public static void main(String[] args) {
        log.error("error logs");
        log.warn("testing warn logs");
        log.info("hey i started logging finally");
        log.debug("hello maven ");
//        System.out.println("Hello Maven") ;
    }

}
