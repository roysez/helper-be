package com.helper.ua.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helper.ua.entities.Request;
import com.helper.ua.repositories.RequestRepository;


/**
 * Product service implement.
 */
@Service
public class RequestServiceImpl implements RequestService {

    @Autowired
    private RequestRepository requestRepository;

    @Override
    public Iterable<Request> listAllRequests() {
        return requestRepository.findAll();
    }

    @Override
    public Request getRequestById(final Integer id)
    {
        return requestRepository.findById(id).get();
    }

    @Override
    public Request saveRequest(final Request request)
    {
        return requestRepository.save(request);
    }

    @Override
    public void deleteRequest(final Integer id)
    {
        requestRepository.delete(getRequestById(id));
    }

    @Override
    public Request updateRequest(final Request request)
    {
        return requestRepository.save(request);
    }
}
