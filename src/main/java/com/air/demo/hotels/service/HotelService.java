package com.air.demo.hotels.service;

import com.air.demo.hotels.dto.request.AddPropertyDto;
import com.air.demo.utilityDto.responseDto.ResponseDto;
import org.springframework.stereotype.Service;

@Service
public interface HotelService {

     ResponseDto addHotels(AddPropertyDto addPropertyDto);
}