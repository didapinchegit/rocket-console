## 嘀嗒拼车基于rocketmq-tools 3.5.8版本开发的一个RocketMQ console

#### 为了方便阅读，增加一些说明
* 0.采用的是spring + bootstrap + angularjs
* 1.MQAdminExtImpl是我们的实现类，里面使用threadLocal保存了一个DefaultMQAdminExt的实例，通过切面MQAdminAspect来进行的实例化和start、shutdown.
* 2.自定义了注解@JsonBody，实现了个JsonBodyExceptionResolver和JsonBodyReturnValueProcessor。分别处理了controller里的异常，以及对正常结果进行封装
* 3.Controller和Service一一对应，和基本实现了文章里说的东西（没有实现ConfigController）

#### 这个console目前存在的几个问题点
* 中英文混搭，没有国际化
* 没有使用springboot 使用的话会更精简些
* UI不够易用美观，前端功能完成度不高 
* 模块和代码需要进一步优化，功能需要完善

##### 例如
* 按时间消息主题查消息不准确漏查问题
* 删除主题后仍然能继续消费
* 生产者列表无法查询，只能topic和groupName进行查询，不够易用
* 重置消息offset 在线可以知道操作结果 离线的不能
* 新建topic和consumer时候把cluster的概念屏蔽了
* 新建了consumer的时候 没有消费过在消费者列表查不到
* Config相关的功能没有（namesvr/broker）

