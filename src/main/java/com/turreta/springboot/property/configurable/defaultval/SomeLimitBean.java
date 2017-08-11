package com.turreta.springboot.property.configurable.defaultval;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeLimitBean
{
	/*
	 * If mycomponent.user.property.limit is not defined,
	 * use mycomponent.system.property.limit.
	 *
	 * If mycomponent.system.property.limit is also not defined,
	 * use 200.
	 *
	 */
	@Value("${mycomponent.user.property.limit:${mycomponent.system.property.limit:200}}")
	private Integer someNumericLimit;

	public Integer getSomeNumericLimit()
	{
		return someNumericLimit;
	}
}
