# springboot + mybatis 集成seata
### 操作步骤
1. 启动seata-parents的server模块 或 直接启动github seata的release版本服务
2. 开发业务模块，每个模块都需要加入seata-spring-boot-starter的依赖
3. 建立该应用的负责转发的业务统一处理模块，加入seata-common的内容或者建立和seata-common之间的依赖(seata-common里面含有对请求和转发的httpFilter以及对undo_log写入的操作)

### 测试情景


### 注意事项
1. 若业务模块与业务模块之间有耦合，也需要加入seata-common，否则被耦合的服务将会失控，导致事务不统一
