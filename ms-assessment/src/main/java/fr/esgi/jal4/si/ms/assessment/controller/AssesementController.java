package fr.esgi.jal4.si.ms.assessment.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.esgi.jal4.si.ms.assessment.AssesementService;
import fr.esgi.jal4.si.ms.assessment.Resrequest;


@RestController
@RequestMapping("/api/text")
public class AssesementController {
	
	@Resource AssesementService textService;

    @RequestMapping(method = RequestMethod.POST, value = "/concat")
    public String concat(@RequestBody Resrequest request) {
        return textService.stringconcacte(request);
    }
}
