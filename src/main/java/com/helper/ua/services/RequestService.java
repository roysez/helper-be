package com.helper.ua.services;

import com.helper.ua.entities.Request;


public interface RequestService {

    Iterable<Request> listAllRequests();

    Request getRequestById(Integer id);

    Request saveRequest(Request request);

    void deleteRequest(Integer id);

    Request updateRequest(final Request request);
}
