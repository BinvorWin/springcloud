package com.hbh.provider.service.impl;

import com.hbh.commom.entity.Payment;
import com.hbh.provider.dao.PaymentDao;
import com.hbh.provider.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Author:Binvor
 * Date:2020/6/17
 * Des:
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int addPayment(Payment payment) {
        return paymentDao.addPayment(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
