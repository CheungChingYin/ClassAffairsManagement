package com.cam.modules.maindata.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import org.jeecgframework.poi.excel.annotation.Excel;

/**
 * @Description: 学生基本信息
 * @Author: CheungChingYin
 * @Date: 2022-10-08
 * @Version: V1.0
 */
@Data
@TableName("student_base_info")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value = "student_base_info对象", description = "学生基本信息")
public class StudentBaseInfo {

    /**
     * 主键ID
     */
    @TableId(type = IdType.ASSIGN_ID)
    @ApiModelProperty(value = "主键ID")
    private String id;
    /**
     * 登录用户ID
     */
    @Excel(name = "登录用户ID", width = 15)
    @ApiModelProperty(value = "登录用户ID")
    private String loginUserId;
    /**
     * 姓名
     */
    @Excel(name = "姓名", width = 15)
    @ApiModelProperty(value = "姓名")
    private String name;
    /**
     * 性别,0女1男
     */
    @Excel(name = "性别,0女1男", width = 15)
    @ApiModelProperty(value = "性别,0女1男")
    private Integer gender;
    /**
     * 出生日期
     */
    @Excel(name = "出生日期", width = 15, format = "yyyy-MM-dd")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "出生日期")
    private Date birthday;
    /**
     * 电话号码
     */
    @Excel(name = "电话号码", width = 15)
    @ApiModelProperty(value = "电话号码")
    private String phoneNumber;
    /**
     * 民族
     */
    @Excel(name = "民族", width = 15)
    @ApiModelProperty(value = "民族")
    private Integer ethnic;
    /**
     * 身份证号码
     */
    @Excel(name = "身份证号码", width = 15)
    @ApiModelProperty(value = "身份证号码")
    private String identityNumber;
    /**
     * 省份
     */
    @Excel(name = "省份", width = 15)
    @ApiModelProperty(value = "省份")
    private String province;
    /**
     * 城市
     */
    @Excel(name = "城市", width = 15)
    @ApiModelProperty(value = "城市")
    private String city;
    /**
     * 区、县
     */
    @Excel(name = "区、县", width = 15)
    @ApiModelProperty(value = "区、县")
    private String area;
    /**
     * 详细地址
     */
    @Excel(name = "详细地址", width = 15)
    @ApiModelProperty(value = "详细地址")
    private String address;
    /**
     * 身份证生效日期
     */
    @Excel(name = "身份证生效日期", width = 15, format = "yyyy-MM-dd")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "身份证生效日期")
    private Date effectiveDate;
    /**
     * 身份证失效日期
     */
    @Excel(name = "身份证失效日期", width = 15, format = "yyyy-MM-dd")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "身份证失效日期")
    private Date expireDate;
    /**
     * 班级ID
     */
    @Excel(name = "班级ID", width = 15)
    @ApiModelProperty(value = "班级ID")
    private String classId;
    /**
     * 宿舍ID
     */
    @Excel(name = "宿舍ID", width = 15)
    @ApiModelProperty(value = "宿舍ID")
    private String dormId;
    /**
     * 专业ID
     */
    @Excel(name = "专业ID", width = 15)
    @ApiModelProperty(value = "专业ID")
    private String majorId;
    /**
     * 学院ID
     */
    @Excel(name = "学院ID", width = 15)
    @ApiModelProperty(value = "学院ID")
    private String collegeId;
    /**
     * 创建人
     */
    @Excel(name = "创建人", width = 15)
    @ApiModelProperty(value = "创建人")
    private String createBy;
    /**
     * 创建时间
     */
    @Excel(name = "创建时间", width = 20, format = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "创建时间")
    private Date createTime;
    /**
     * 修改人
     */
    @Excel(name = "修改人", width = 15)
    @ApiModelProperty(value = "修改人")
    private String updateBy;
    /**
     * 修改时间
     */
    @Excel(name = "修改时间", width = 20, format = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "修改时间")
    private Date updateTime;
    /**
     * 0表示未删除,1表示删除
     */
    @Excel(name = "0表示未删除,1表示删除", width = 15)
    @ApiModelProperty(value = "0表示未删除,1表示删除")
    private Integer delFlag;
}
