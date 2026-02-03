package com.jiwanshu.ecom.service;

import com.jiwanshu.ecom.payload.OrderDTO;

public interface OrderService {
    OrderDTO placeOrder(String emailId, Long addressId, String paymentMethod, String pgName, String pgPaymentId, String pgStatus, String pgResponseMessage);
}
