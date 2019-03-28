# sc
a demo about springcloud
项目启动顺序：
1服务注册与发现eureka
2分布式配置中心config   connfig-client可以配置到feign或者ribben
3服务链路追踪zipkin
4分布式服务监控中心admin
5服务提供者service
6服务消费者feign ribben
7API网关 zuul