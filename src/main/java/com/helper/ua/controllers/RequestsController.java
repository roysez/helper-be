package com.helper.ua.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.helper.ua.entities.Request;
import com.helper.ua.services.RequestService;


/**
 * Product controller.
 */
@RestController
public class RequestsController
{

    @Autowired
    private RequestService requestService;

    @GetMapping(value = "/requests")
    public Iterable<Request> getAllRequests() {
        return requestService.listAllRequests();
    }

    @GetMapping(value = "/requests/{id}")
    public Request getRequestById(@PathVariable Integer id) {
        return requestService.getRequestById(id);
    }

    @PostMapping(value = "/requests")
    public void createRequest(@RequestBody Request request) {
        requestService.saveRequest(request);
    }

    @DeleteMapping(value = "/requests/{id}")
    public void deleteRequest(@PathVariable Integer id){
        requestService.deleteRequest(id);
    }

    @PutMapping(value = "/requests/{id}")
    public Request updateRequest(@RequestBody Request request) {
       return requestService.updateRequest(request);
    }

}
