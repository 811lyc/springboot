package com.test.test.task.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author LYC
 * @desc
 * @create 2020-07-28 17:19
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
	/**
	 *自增id
	 */
	@TableField("id")
	private Integer id;

	/**
	 * 区域
	 */
	@TableField("area")
	private String area;

	/**
	 * 详细地址
	 */
	@TableField("detail_address")
	private String detailAddress;

	/**
	 * 电话
	 */
	@TableField("tel")
	private String tel;

	/**
	 * 配送姓名
	 */
	@TableField("name")
	private String name;

	/**
	 * 创建时间
	 */
	@TableField("create_time")
	private Date createTime;

	/**
	 * 更改时间
	 */
	@TableField("update_time")
	private Date updateTime;

}
