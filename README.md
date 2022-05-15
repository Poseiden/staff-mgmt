# 员工管理服务

此项目为员工管理服务

## 目录
* [环境准备](#环境准备)
* [启动命令](#启动命令)
* [词汇表](#词汇表)

## 环境准备
- Java8
- Docker

## 启动命令
```bash
//Step0 在启动该项目前，请预先安装好 Java8 以及 Docker，下载地址：
//Java8: https://www.java.com/en/download/manual.jsp
//Docker: https://docs.docker.com/get-docker/
//本项目正常运行需要占用两个端口，分别为 8082 与 13306, 请提前预留，或自行修改端口号

// Step1  创建该项目所需的数据库实例
sh ./env-build-scripts/create_database_instance.sh  //在项目根目录下执行

// Step2 创建数据库。 待上一步执行成功后，使用任一数据库连接工具连上此数据库实例（示例用户名密码在命令脚本中），在 sql console 中执行以下sql 脚本,创建数据库
// env-build-scripts/init_db.sql  

// Step3 启动项目，在首次运行时， 如果系统中没有对应版本的 gradle，那么会先自动下载，之后项目启动时，会自动运行db/migration下的所有sql 脚本，创建对应的表，数据库结构等等, 最后项目启动在 8082 端口下
./gradlew bootRun       

// 附：构建项目命令
./gradlew build      

```

## 词汇表

### [员工]词汇表
|  领域名词 |  英文   |  模型  |   表名  |  备注  |
|  :----:  | :----: | :----: | :----: | :----: |
|     员工   | employee |  Employee  | employee  |  / |

### [员工技能]词汇表
|  领域名词 |  英文   |  模型  |   表名  |  备注  |
|  :----:  | :----: | :----: | :----: | :----: |
|     员工技能   | employee skill |  EmployeeSkill  | employee_skill  |  / |
|     经验时长   | duration |  duration  | /  |  / |
|     经验级别   | level |  level  | /  |  / |

### [工作经历]词汇表
|  领域名词 |  英文   |  模型  |   表名  |  备注  |
|  :----:  | :----: | :----: | :----: | :----: |
|     工作经历   | work experience |  WorkExperience  | work_experience  |  / |
|     公司   | company |  company  | /  |  / |
|     时间段   | period |  period  | /  |  / |

### [组织]词汇表
|  领域名词 |  英文   |  模型  |   表名  |  备注  |
|  :----:  | :----: | :----: | :----: | :----: |
|     组织   | organization |  Organization  | organization  |  / |
|     上级   | superior |  superior  | /  |  / |
|     下级   | subordinate |  subordinate  | /  |  / |

### [技能类别]词汇表
|  领域名词 |  英文   |  模型  |   表名  |  备注  |
|  :----:  | :----: | :----: | :----: | :----: |
|     技能类别   | skill category |  SkillCategory  | skill_category  |  / |
|     技能名称   | name |  name  | /  |  / |

### [技能定义]词汇表
|  领域名词 |  英文   |  模型  |   表名  |  备注  |
|  :----:  | :----: | :----: | :----: | :----: |
|     技能定义   | skill definition |  SkillDefinition  | skill_definition  |  / |
|     技能描述   | description |  description  | /  |  / |
