package com.nobroker.Controller;

import com.nobroker.payload.OwnerPlanDto;
import com.nobroker.service.OwnerPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class OwnerPlanController {

    @Autowired
    private OwnerPlanService ownerPlanService;

    public OwnerPlanController(OwnerPlanService ownerPlanService) {
        this.ownerPlanService = ownerPlanService;
    }
    @PostMapping
    public ResponseEntity<String> createOwnerPlan(@RequestBody OwnerPlanDto ownerPlanDto){

        OwnerPlanDto allPlan = ownerPlanService.createOwnerPlans(ownerPlanDto);

        return new ResponseEntity<>("save successful" , HttpStatus.CREATED);

    }

}
