package com.wangan.spring.controller;

import com.wangan.spring.MyScanCondition.LinuxCondition;
import com.wangan.spring.MyScanCondition.WindowCondition;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;

/**
 * @author wangan on 2018/7/12
 * @description
 */
 @Controller
// @Conditional({LinuxCondition.class})
public class MyController {
}
