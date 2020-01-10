package eg1;

import org.apache.log4j.Logger;

public class HelloLogger {
	
	final static Logger log = Logger.getLogger(HelloLogger.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("Hey Debug");
		log.info("Hey Info");
		log.warn("Hey Warn");
		log.error("Hey Error");
		log.fatal("Hey Fatal");
	}

}
