package io.cjf.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.cjf.jcartadministrationback.dto.out.OrderListOutDTO;
import io.cjf.jcartadministrationback.dto.out.OrderShowOutDTO;

public interface OrderService {

    Page<OrderListOutDTO> search(Integer pagNum);

    OrderShowOutDTO getById(Long orderId);

}
