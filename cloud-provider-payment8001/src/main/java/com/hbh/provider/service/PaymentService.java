package com.hbh.provider.service;

import com.hbh.commom.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * Author:Binvor
 * Date:2020/6/17
 * Des:
 */
public interface PaymentService
{
    public int addPayment(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
