package cn.toma.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @Author: zqx
 * @Date: 2019-08-09 15:40
 * @Description:
 */
@Data
@Table(name = "t_order")
public class Order
{

	@Id
	@Column(name = "order_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderId;
	@Column(name = "member_id")
	private String memberId;
	@Column(name = "order_code")
	private String orderCode;
	@Column(name = "order_amount")
	private String orderAmount;
	private Integer status;
	@Column(name = "create_time")
	private Date createTime;

}
