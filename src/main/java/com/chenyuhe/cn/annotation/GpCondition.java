package com.chenyuhe.cn.annotation;


import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class GpCondition implements Condition {
	@Override
	public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {

		System.out.println(conditionContext);
		System.out.println(annotatedTypeMetadata);
		// 这里可以写我们的业务逻辑
		return true;
	}
}