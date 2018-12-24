package net.irext.decoder.businesslogic;

import org.springframework.stereotype.Controller;

/**
 * Filename:       CollectCodeLogic
 * Revised:        Date: 2018-12-08
 * Revision:       Revision: 1.0
 * <p>
 * Description:    IRext Code Collector Collect Code Logic
 * <p>
 * Revision log:
 * 2018-12-08: created by strawmanbobi
 */
@Controller
public class DecodeLogic {

    private static DecodeLogic decodeLogic;

    public static DecodeLogic getInstance() {
        if (null == decodeLogic) {
            decodeLogic = new DecodeLogic();
        }
        return decodeLogic;
    }

    public DecodeLogic() {

    }

    public int[] decode() {
        return null;
    }
}