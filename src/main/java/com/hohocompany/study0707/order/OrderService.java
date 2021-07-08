package com.hohocompany.study0707.order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
