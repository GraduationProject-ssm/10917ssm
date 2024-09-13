# [首页查询更多项目](https://github.com/GraduationProject-ssm) 包安装运行


# 10917ssm超市管理系统

![picture](https://raw.githubusercontent.com/GraduationProject-springboot/.github/main/img/wx.png)

### 点击播放视频 ▼
[![Watch the video](https://i.sstatic.net/Vp2cE.png)](https://www.bilibili.com/video/BV1Sh44eDEx6?p=18)


# 系统概述
进过系统的分析后，就开始记性系统的设计，系统设计包含总体设计和详细设计。总体设计只是一个大体的设计，经过了总体设计，我们能够划分出系统的一些东西，例如文件、文档、数据等。而且我们通过总体设计，大致可以划分出了程序的模块，以及功能。但是只是一个初步的分类，并没有真正的实现。

整体设计，只是一个初步设计，而且，对于一个项目，我们可以进行多个整体设计，通过对比，包括性能的对比、成本的对比、效益的对比，来最终确定一个最优的设计方案，选择优秀的整体设计可以降低开发成本，增加公司效益，从这一点来讲，整体设计还是非常重要的。

超市管理系统工作原理图如图4-1所示：

![](/md/blog.012.png)

图4-1 系统工作原理图
## 4.2 系统结构设计
系统架构图属于系统设计阶段，系统架构图只是这个阶段一个产物，系统的总体架构决定了整个系统的模式，是系统的基础。超市管理系统的整体结构设计如图4-2所示。

![](/md/blog.013.png)

图4-2 系统结构图
## 4.3数据库设计
数据库是计算机信息系统的基础。目前，电脑系统的关键与核心部分就是数据库。数据库开发的优劣对整个系统的质量和速度有着直接影响。
### 4.3.1 数据库设计原则
数据库的概念结构设计采用实体—联系（E-R）模型设计方法。E-R模型法的组成元素有：实体、属性、联系，E-R模型用E-R图表示，是提示员工工作环境中所涉及的事物，属性则是对实体特性的描述。在系统设计当中数据库起着决定性的因素。下面设计出这几个关键实体的实体—关系图。
### 4.3.2 数据库实体
数据模型中的实体（Entity），也称为实例，对应现实世界中可区别于其他对象的“事件”或“事物”。例如，公司中的每个员工，家里中的每个家具。

本系统的E-R图如下图所示：

1、请假信息管理实体图如图4-3所示：

![](/md/blog.014.png)

图4-3请假信息管理实体图

2、员工管理实体图如图4-4所示：

![](/md/blog.015.png)

`  `图4-4员工管理实体图

3、商品库存管理实体图如图4-5所示：

![](/md/blog.016.png)

`  `图4-5商品库存管理实体图

#########

### 4.3.3 数据库表设计
数据库的表信息属于设计的一部分，下面介绍数据库中的各个表的详细信息。

表4-1 allusers表

|列名|数据类型|长度|约束|
| :-: | :-: | :-: | :-: |
|id|int|11|NOT NULL|
|username|varchar|50|` `default NULL|
|pwd|varchar|50|` `default NULL|
|cx|varchar|50|` `default NULL|


表4-2 gongyingshang表

|列名|数据类型|长度|约束|
| :-: | :-: | :-: | :-: |
|id|int|11|NOT NULL|
|addtime|varchar|50|default NULL|
|gongyingshangmingcheng|varchar|50|default NULL|
|gongyingshangleixing|varchar|50|default NULL|
|fuzeren|varchar|50|default NULL|
|lianxidianhua|varchar|50|default NULL|
|youxiang|varchar|50|default NULL|
|xiangxidizhi|varchar|50|default NULL|

表4-3：jiaoliuhuifu表

|列名|数据类型|长度|约束|
| :-: | :-: | :-: | :-: |
|id|` `int|11|NOT NULL |
|addtime|varchar|50|default NULL|
|biaoti|varchar|50|default NULL|
|gonghao|varchar|50|default NULL|
|xingming|varchar|50|default NULL|
|riqi|varchar|50|default NULL|
|jiaoliuhuifu|varchar|50|default NULL|


表4-4：jiaoliuxinxi表

|列名|数据类型|长度|约束|
| :-: | :-: | :-: | :-: |
|id|` `int|11|NOT NULL |
|addtime|varchar|50|default NULL|
|biaoti|varchar|50|default NULL|
|jiaoliuneirong|varchar|50|default NULL|
|jiaoliuriqi|varchar|50|default NULL|
|gonghao|varchar|50|default NULL|
|xingming|varchar|50|default NULL|

表4-5：qingjiaxinxi表

|列名|数据类型|长度|约束|
| :-: | :-: | :-: | :-: |
|id|` `int|11|NOT NULL |
|addtime|varchar|50|default NULL|
|biaoti|varchar|50|default NULL|
|qingjiariqi|varchar|50|default NULL|
|qingjiatianshu|varchar|50|default NULL|
|jieshuriqi|varchar|50|default NULL|
|qingjianeirong|varchar|50|default NULL|
|gonghao|varchar|50|default NULL|
|xingming|varchar|50|default NULL|
|sfsh|varchar|50|default NULL|
|shhf|varchar|50|default NULL|





# 5统详细设计
## 5.1管理员功能模块
管理员登录，通过填写用户名、密码进行登录，如图5-1所示。

![](/md/blog.017.png)

图5-1管理员登录界面图

管理员登录进入超市管理系统可以查看个人中心、员工管理、供应商管理、商品库存管理、商品类型管理、商品进货管理、商品销售管理、上班打卡管理、请假信息管理、交流信息管理、交流回复管理等信息。

员工管理，在员工管理页面中可以通过填写工号、姓名、性别、头像、部门、职位、电话等内容进行修改、删除，如图5-2所示。还可以根据需要对商品类型管理进行详情，修改等详细操作，如图5-3所示。

![](/md/blog.018.png)

图5-2员工管理界面图

![](/md/blog.019.png)

图5-3商品类型管理界面图

商品库存管理，在商品库存管理页面中可以查看商品名称、商品类型、图片、价格、数量、发布日期、商品详情、用户id等信息，并可根据需要对已有商品库存管理进行修改或删除等操作，如图5-4所示。

![](/md/blog.020.png)

图5-4商品库存管理界面图

商品进货管理，在商品进货管理页面中可以查看商品名称、商品类型、进货价格、数量、总价格、进货日期、进货公司、备注、工号、姓名等信息，并可根据需要对已有商品进货管理进行修改或删除等详细操作，如图5-5所示。

![](/md/blog.021.png)

图5-5商品进货管理界面图

上班打卡管理，在上班打卡管理页面中可以查看工号、姓名、打卡时间、打卡内容等内容，并且根据需要对已有上班打卡管理进行详情，修改或删除等详细操作，如图5-6所示。

![](/md/blog.022.png)

图5-6上班打卡管理界面图

请假信息管理，在请假信息管理页面中可以查看标题、请假日期、请假天数、结束日期、请假内容、工号、姓名、是否审核、审核回复等内容，并且根据需要对已有请假信息管理进行详情，修改或删除等详细操作，如图5-7所示。

![](/md/blog.023.png)

图5-7请假信息管理界面图

交流信息管理，在交流信息管理页面中可以查看标题、交流内容、交流日期、工号、姓名等内容，并且根据需要对已有交流信息管理进行修改或删除等详细操作，如图5-8所示。

![](/md/blog.024.png)

图5-8交流信息管理界面图


## 5.2员工功能模块
员工登录进入超市管理系统可以查看个人中心、供应商管理、商品库存管理、商品进货管理、商品销售管理、上班打卡管理、请假信息管理、交流信息管理、交流回复管理等内容。

商品库存管理，在商品库存管理页面中通过查看商品名称、商品类型、图片、价格、数量、发布日期、商品详情、用户id等信息，还可以根据需要对商品库存管理进行修改，如图5-9所示。

![](/md/blog.025.png)

图5-9商品库存管理界面图

上班打卡管理，在上班打卡管理页面中可以查看工号、姓名、打卡时间、打卡内容等信息，并且根据需要对已有上班打卡管理进行查看删除等其他详细操作，如图5-10所示。

![](/md/blog.026.png)

图5-10上班打卡管理界面图

请假信息管理，在请假信息管理页面中通过查看标题、请假日期、请假天数、结束日期、请假内容、工号、姓名、是否审核、审核回复等内容进行查看、修改、删除，如图5-11所示。

![](/md/blog.027.png)

图5-11请假信息管理界面图

交流信息管理，在交流信息管理页面中通过查看标题、交流内容、交流日期、工号、姓名等内容进行查看、删除，如图5-12所示。

![](/md/blog.028.png)

图5-12交流信息管理界面图














