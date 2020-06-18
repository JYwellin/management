基于Spring、SpringMVC、Mybatis框架整合的权限管理系统，主要技术是运用了SpringSecurity框架对用户访问页面的某些模块设置权限.

##开发环境和使用的技术：

IntelliJ Idea 、JDK 1.8
SVN 、Orcale、Maven
SpringSecurity、Spring
Mybatis、SpringMVC、AdminLTE

**1.产品模块**

基于SSM整合基础，对商品的增删改查.


**2.订单模块**

运用mybatis分页插件PageHelper插件，对订单分页查询，订单详情查询.


**3.用户模块**

用户管理中基于spring Security的用户登录、退出操作。以及用户查询、添加、详情有等操作.


**4.权限关联与控制**

运用了spring Security框架对用户设置角色，不同的角色可以访问不同的资源.

**5.AOP日志**

使用Spring AOP切面来完成系统级别的日志收集.