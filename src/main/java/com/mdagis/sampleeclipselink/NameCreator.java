
package com.mdagis.sampleeclipselink;

import java.util.concurrent.ThreadLocalRandom;
import org.kohsuke.randname.RandomNameGenerator;

/**
 *
 * @author agis
 */
public class NameCreator {
    
    public static String createRandomName(){
        
        int randomNum = ThreadLocalRandom.current().nextInt(0, 1000 + 1);
        RandomNameGenerator rnd = new RandomNameGenerator(randomNum);
        return rnd.next();
        
    }
    
}
