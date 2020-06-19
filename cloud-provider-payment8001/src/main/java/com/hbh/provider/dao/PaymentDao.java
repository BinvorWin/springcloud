package com.hbh.provider.dao;
import com.hbh.commom.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Author:Binvor
 * Date:2020/6/17
 * Des:
 */
@Mapper
public interface PaymentDao
{
    public int addPayment(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
