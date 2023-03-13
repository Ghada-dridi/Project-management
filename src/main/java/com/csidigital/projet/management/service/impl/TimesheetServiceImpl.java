package com.csidigital.projet.management.service.impl;

import com.csidigital.projet.management.service.TimesheetService;
import com.csidigital.projet.shared.dto.Request.TimesheetDtoRequest;
import com.csidigital.projet.shared.dto.Response.TimesheetDtoResponse;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TimesheetServiceImpl implements TimesheetService {
    @Override
    public List<TimesheetDtoResponse> getAllTimesheets() {
        return null;
    }

    @Override
    public TimesheetDtoResponse getTimesheetById(Long id) {
        return null;
    }

    @Override
    public TimesheetDtoResponse createTimesheet(TimesheetDtoRequest timesheetDtoRequest) {
        return null;
    }

    @Override
    public TimesheetDtoResponse updateTimesheet(Long id, TimesheetDtoRequest timesheetDtoRequest) {
        return null;
    }

    @Override
    public void deleteTimesheetById(Long id) {

    }
}
