package com.csidigital.projet.management.service.impl;

import com.csidigital.projet.dao.entity.ClientReview;
import com.csidigital.projet.dao.repository.ClientReviewRepository;
import com.csidigital.projet.management.service.ClientReviewService;
import com.csidigital.projet.shared.dto.Request.ClientReviewDtoRequest;
import com.csidigital.projet.shared.dto.Response.ClientReviewDtoResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ClientReviewServiceImpl implements ClientReviewService {

    private final ClientReviewRepository clientReviewRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<ClientReviewDtoResponse> getAllClientReview() {
        List<ClientReview> clientReviews = clientReviewRepository.findAll();
        List<ClientReviewDtoResponse> clientReviewList = new ArrayList<>();

        for (ClientReview clientReview : clientReviews) {
            ClientReviewDtoResponse clientReviewResponse = modelMapper.map(clientReview, ClientReviewDtoResponse.class);
            clientReviewList.add(clientReviewResponse);
        }

        return clientReviewList;

    }

    @Override
    public ClientReviewDtoResponse getClientReviewById(Long id) {
        ClientReview clientReview = clientReviewRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("ClientReview with id " + id + " not found"));
        ClientReviewDtoResponse clientReviewDtoResponse = modelMapper.map(clientReview, ClientReviewDtoResponse.class);
        return clientReviewDtoResponse;

    }

    @Override
    public ClientReviewDtoResponse CreateClientReview(ClientReviewDtoRequest clientReviewDtoRequest) {
        ClientReview clientReview = modelMapper.map(clientReviewDtoRequest, ClientReview.class);
        ClientReview ClientReviewSaved = clientReviewRepository.save(clientReview);
        return modelMapper.map(ClientReviewSaved, ClientReviewDtoResponse.class);

    }

    @Override
    public ClientReviewDtoResponse updateClientReview(ClientReviewDtoRequest clientReviewDtoRequest, Long id) {
        ClientReview clientReview = clientReviewRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("ClientReview with id: " + id + " not found"));
        modelMapper.map(clientReviewDtoRequest, clientReview);
        ClientReview updatedClientReview = clientReviewRepository.save(clientReview);
        return modelMapper.map(updatedClientReview, ClientReviewDtoResponse.class);

    }


    @Override
    public void deleteClientReviewById(Long id) {

        clientReviewRepository.deleteById(id);
    }
}
