package com.bt.ms.im.util;

import org.springframework.stereotype.Component;


import com.bt.ms.im.entity.ProductOrderCreateRequest;

@Component
public class RequestValidator {

    public void validateTrackingHeader(String apIGWTrackingHeader) {
        // Check if the APIGW-Tracking-Header is present and not empty
        if (apIGWTrackingHeader == null || apIGWTrackingHeader.isEmpty()) {
            throw new IllegalArgumentException("APIGW-Tracking-Header is required.");
        }
        // You can add more validation logic if needed
    }

    public void validateRequestParameters(ProductOrderCreateRequest productordercreaterequest) {
        // Validate request parameters from the request body
        // For example, you can check if required fields are present and have valid values
        if (productordercreaterequest == null) {
            throw new IllegalArgumentException("Request body is required.");
        }
        // You can add more validation logic for the request body
    }
}
