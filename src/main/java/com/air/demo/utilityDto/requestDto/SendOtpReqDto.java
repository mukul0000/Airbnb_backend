package com.air.demo.utilityDto.requestDto;

import lombok.Data;

@Data
public class SendOtpReqDto {

    private String otpViaValue;

    private String phoneCodeId;

    private int roleId;

}
