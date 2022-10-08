package com.cam.modules.maindata.service.impl;

import com.cam.modules.maindata.entity.StudentBaseInfo;
import com.cam.modules.maindata.mapper.StudentBaseInfoMapper;
import com.cam.modules.maindata.service.IStudentBaseInfoService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @Description: 学生基本信息
 * @Author: CheungChingYin
 * @Date: 2022-10-08
 * @Version: V1.0
 */
@Service
public class StudentBaseInfoServiceImpl extends ServiceImpl<StudentBaseInfoMapper, StudentBaseInfo> implements IStudentBaseInfoService {

}
