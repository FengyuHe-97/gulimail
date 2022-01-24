package com.atguigu.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1.如何使用Nacos作为配置中心统一管理依赖
 *      1）引入依赖
 *         <dependency>
 *             <groupId>com.alibaba.cloud</groupId>
 *             <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
 *         </dependency>
 *      2）创建一个 bootstrap.properties
 *      配置：
 *      spring.application.name=gulimall-coupon
 *      spring.cloud.nacos.config.server-addr=127.0.0.1:8848
 *      3） 需要给配置中心默认添加一个 叫数据集（Data Id） gulimall-coupon.properties 默认规则 ： 应用名.properties
 *      4)给 应用名.properties 添加任何配置
 *      5）动态获取配置
 *         @RefreshScope 动态获取并刷新配置
 *         @Value(“${配置项的名}”) 获取到配置
 *
 *         配置中心优先 于 项目配置文件
 * 2.细节
 *      1）命名空间 配置隔离
 *       1.开发，测试 做环境隔离
 *      默认：public，bootstrap.properties下选择
 *      spring.cloud.nacos.config.namespace=c777c3ad-2ee9-4fc8-8622-298ebe6c3b8e
 *       2.微服务见隔离配置
 *      2）配置集：所有配置的集合
 *
 *      3）配置集ID： 类似文件名
 *          Data ID：类似文件名
 *      4）配置分组：
 *          默认所有都属于 DEFAULT_GROUP
 *
 *    微服务创建各种命名空间， 配置分组区分 dev，test，prod
 *
 * 3. 同时加载多个配置集
 *  1)
 */
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
