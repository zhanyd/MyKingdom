# MyKingdom


## 一、My Kingdom 是什么
## 二、都有那些功能
## 三、积分制度
## 四、支付类型
## 五、共享资源和分配
## 六、数据库设计原则
## 七、数据处理原则


# 一、My Kingdom 是什么
**共享理念**：个人将自己的知识共享、时间共享是第一步，将来可以再丰富其他的

**共享时间**：问答形式

**共享资源**：可以共享自家的带宽，存储信息给平台使用

**有劳共享**：每个人可以根据自己的情况，不收费和进行象征性质的收费

**人人监督**：平台上的所有人都参与评分监督，针对作假的可以进行处罚

**各种咨询**：各种分类问题咨询。支持悬赏

# 都有那些功能
1、问题发布：个人可以把自己的问题发布上。也可以指定人回答。

2、问题认领：可以多人认领。

3、结论评分：提问者给与评分，其他人可以针对问题回复做辅助分值评分

4、擅长领域设定：个人设定自己的擅长领域。

5、共享时间设定：个人设定自己的共享时间范围（周一至周五零散时间段，周末时间范围）

6、消息中心：显示私信、订阅推送、应用消息三大消息提醒

# 积分制度

## 1、积分分为四种。

	提问者评分+监督积分+平台奖励积分+活动积分
  
## 2、积分用途

	可以用于问题的支付类型。
  
# 支付类型

范围：针对提问者和问题回复者

担保：平台方

1、干粮（等价RMB）

2、积分	（不支持）

3、虚拟货币。（如：比特币、玩客币）。（不支持）

4、 RMB 

# 共享资源

范围：数据存储，宽带资源

申请加入：平台上申请，填写个人资源情况

资源内容：

	1、地域
  
	2、资源大小
  
	3、宽带情况
  
	4、可共享的时间段：支持到小时级别？
  
共享资源内容：

	1、个人提供的硬件资源：硬盘、带宽
  
	2、物理删除的数据，如果有必要可以异步备份到共享的网点上
  
 # 共享资源分配

计算分配规则：

	1、按照访问者地域就近原则
  
	2、时间段符合
  
	3、根据带宽情况计算可并发量
  
# 数据库设计原则

一、尽可能的减少带宽原则 . (互联网成本高)

二、按需设计：字段要短（能用1个字节整数的就不要4个字节），能固定长度短字符串的，就不要长字符串

三、创建时间、创建人、修改时间、修改人字段不是必须每个表都有，安场景分析决定

四、数据物理删除：没必要的数据直接删除，不必做逻辑标记


# 数据处理原则

一、定期删除不用的数据，这个删除过程可能是直接删除，可能是删除后再备份






