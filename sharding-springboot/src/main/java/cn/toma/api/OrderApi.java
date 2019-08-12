package cn.toma.api;

import cn.toma.dao.OrderMapper;
import cn.toma.model.Order;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: zqx
 * @Date: 2019-08-09 16:27
 * @Description:
 */
@RestController("api/order/")
public class OrderApi
{
	@Resource
	private OrderMapper orderMapper;


	@PostMapping
	public Object add(Order order)
	{
		int i = orderMapper.insertSelective(order);
		return i;
	}

	@PutMapping
	public Object update(Order order)
	{
		int i = orderMapper.updateByPrimaryKeySelective(order);
		return i;
	}

	@GetMapping
	public Object list()
	{
		List<Order> orderList = orderMapper.selectAll();
		return orderList;
	}

	@GetMapping("/{id}")
	public Object byId(@PathVariable(name = "id") Integer id)
	{
		Order order = orderMapper.selectByPrimaryKey(id);
		return order;
	}

	@DeleteMapping("/{id}")
	public Object delete(@PathVariable(name = "id") Integer id)
	{
		int i = orderMapper.deleteByPrimaryKey(id);
		return i;
	}

}
