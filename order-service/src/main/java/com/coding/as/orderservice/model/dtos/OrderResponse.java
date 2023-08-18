package com.coding.as.orderservice.model.dtos;

import java.util.List;

public record OrderResponse(Long id, String orderNumber, List<OrderItemsResponse> orderOtem) {
}
