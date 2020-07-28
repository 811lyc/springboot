package com.test.test.task.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.test.test.task.entity.Address;
import com.test.test.task.mapper.TaddressMapper;
import com.test.test.task.service.TaddressService;
import org.springframework.stereotype.Service;

/**
 * @author LYC
 * @desc
 * @create 2020-07-28 17:12
 **/
@Service
public class TaddressServiceImpl extends ServiceImpl<TaddressMapper, Address> implements TaddressService {
}
