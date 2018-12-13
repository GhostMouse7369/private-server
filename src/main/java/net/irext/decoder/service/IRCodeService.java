package net.irext.decoder.service;

import net.irext.decoder.businesslogic.CollectCodeLogic;
import net.irext.decoder.model.IRCode;
import net.irext.decoder.response.ServiceResponse;
import net.irext.decoder.response.Status;
import org.springframework.web.bind.annotation.*;

/**
 * Filename:       IRCodeService
 * Revised:        Date: 2018-12-08
 * Revision:       Revision: 1.0
 * <p>
 * Description:    IRext Code Collector Service
 * <p>
 * Revision log:
 * 2018-12-08: created by strawmanbobi
 */
@RestController
@RequestMapping("/irext/collect")
public class IRCodeService {

    public IRCodeService() {
    }

    @PostMapping("/collect_code")
    public ServiceResponse collectCode(@RequestBody IRCode irCode) {
        CollectCodeLogic.getInstance(irCode).collectCodeWorkUnit();
        ServiceResponse serviceResponse = new ServiceResponse();
        serviceResponse.setStatus(new Status());
        return serviceResponse;
    }
}