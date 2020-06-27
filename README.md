# Java基础学习笔记(主要是看的马士兵的教程)
## Java概述
    Java是美国SUN(Stanford University Network)公司Green的项目，于1995年首次发布的一种跨平台语言，发明人是James Gosling。
### Java体系架构
    - J2EE （JavaEE) ：Java 2 Enterprise Edition；定位在服务器端的应用
    - J2SE (JavaSE) ：Java 2 Standard Edition；定位在个人计算机上的应用
    - J2ME (JavaME) ：Java 2 Micro Edition；定位在消费性电子产品的应用上
### JVM(Java VIRTUAL MACHINE)
    - JVM是一种规范。就是一个虚拟的用于执行bytecodes字节码的计算机。
    - Java虚拟机是Java最核心技术，也是跨平台的基础。
    - 可以使用软件来实现。IBM, SUN, BEA等。
    - 可以使用硬件来实现。比如sun/intel公司正在研发的Java芯片
    原理：
    - 通过“编译器”将Java源程序编译成Java 字节码文件（.class）(字节码文件采用结构中立的中间文件格式)
    - 通过“解释器”将Java字节码文件解释为对应机器语言并运行
### Java的特点
    - Java是跨平台的（一次编译，到处运行）
    - Java是简单的（无需关心内存管理等）
    - Java是安全的（取消了指针，提供了-字节码校验器 -类装载器 -运行时内存布局 -文件访问限制等安全性保障机制）
    - Java是完全面向对象的（即使是基础数据类型，比如int，也会自动拆装箱和自动拆箱，万物皆对象，不是闹着玩的）
    - Java是健壮的（静态语言，强制类型机制、异常处理、垃圾的自动收集，在运行前就检查类型的正确性）
    - Java可以使用多线程
    - Java有丰富的生态
### Java开发环境
    - JDK (Java Development Kit),Java工具包，包括了JRE、java工具、java核心类库（Java API）
    - JRE (Java Runtime Environment),Java运行环境
    - 安装（省略，百度吧，注意配置好环境变量，java -version一下）
## 第一章 Java初识 first包
    - 第一个java程序 HelloWorld(Mac IDEA 快捷键：psvm,快速打出main函数)
                                (Mac IDEA 快捷键：sout,快速System.out.println)
        1.注释分三类：单行注释、多行注释、文档注释。(Java编译器编译时会跳过注释语句。)            
        2.java文件：
            java文件的名称必须跟public class的名称保持一致；
            一个java文件中可以包含多个class,但是public class只能有1个；
            public static void main(String[] args)是所有java程序的入口，如果向
            		执行对应的java代码，则必须要添加如下方法，且格式是固定；
            main方法中参数列表可以支持多种写法：String[] args,String [] args,String args[]；
            main方法中参数的名称无所谓，但是一般写成args；
            java代码在编写的时候，每行结尾的时候需要使用;结束；
            java代码的代码块需要使用{}括起来，前后匹配；
        3.执行：
            编译:– 源代码----->class
            反编译:– class---->源代码
            反编译软件:– jd-gui.exe
    - Java标识符（标识符命名规范） IdentifiedDemo
        1.硬性规定：
            标识符必须以字母，下划线或者美元符号开头
            其他部分必须是字母，数字，下划线或者美元符号，但是不能出现特殊符号。(可以有中文，我试过)
            标识符大小写敏感
            不能是java的关键字或者保留字（留给系统使用的表示特殊含义的字符串）
        2.常规建议：
            驼峰标识（百度）
            见名知义（就是英文，别拼音中文的）
    - Java数据类型 DataTypeDemo
        1.Java是一种强类型的语言
            强类型表示，变量在定义的时候必须显式的声明类型是什么,例如Java，C
            弱类型表示，变量会根据值自己去推断，不需要指定类型是什么，例如我们的大PHP
        2.常量和变量
            变量就是可以变的，合法标识符
            常量就是不可变的，用final修饰，一般都大写
        3.Java数据类型
            基本数据类型（4类8种）：
                整数类型：byte short int long(不同类型表示不同的长度)
                    byte:1字节，8位，取值范围	-128-127（2^7-1）
                    short:2字节，16位，取值范围 -32768-32767（2^15 - 1）
                    int:4字节，32位，取值范围 正负21亿（默认类型）（2^31 - 1）
                    long:8字节，64位，取值范围 （数字的后面添加L）（2^63 -1）
                浮点类型：float double
                    float:	单精度，4字节32位，精度可以精确到小数点后7位 （数字后要添加f,超过7位,俩变量相等就是true）
                    double:	双精度，8字节64位，精度是float的双倍（默认类型）
                字符类型: char
                    char: 2字节，16位
                布尔类型: boolean
                    boolean:只有true和false两值,1位（具体是1字节8位还是1位，有很多说法，查阅资料，官方文档中的说法：只有1bit的信息是有意义的）
            引用数据类型:
                类
                接口
                数组
    - 运算符 OperatorDemo
        1.算术运算符:  +，-，*，/，%，++，--
        2.赋值运算符 =
        3.扩展赋值运算符:+=，-=，*=，/= 
        4.关系运算符:  >，<，>=，<=，==，!=
        5.逻辑运算符:  &&，||，!
        6.位运算符:  &，|，^，~ ， >>，<<，>>> 
        7.条件运算符 ？： 
## 第二章 流程控制 second包
###分支结构 IfDemo：
    (Mac IDEA 快捷键：Surround With Code，Command + Option + T 包围代码(使用if,else,try,catch的等))
    1.单分支结构：只做单一条件的判断，如果符合，做某些事情
    2.双分支结构：当做条件判断的时候，只有两种选择
    3.多分支结构：可以进行多个条件的判断，每个匹配项可以选择不同的执行结果
    4.嵌套分支结构：在分支结构中嵌套分支结构
    5.switch多分支结构：一般用作等值判断
###循环结构
    1.WhileDemo -- 练习while do-while循环
        (Mac IDEA 快捷键：iten,Enumeration while 循环 while (enumeration.hasMoreElements()) {
                                    Object nextElement =  enumeration.nextElement();
                                })
        (Mac IDEA 快捷键：itit,Iterator while 循环 while (iterator.hasNext()) {
                                         Object next =  iterator.next();
                                     })
    2.ForDemo -- 练习for循环
        (Mac IDEA 快捷键：fori,快速for循环)
        (Mac IDEA 快捷键：iter,增强型for循环, for (String arg : args) {
                            })
        (Mac IDEA 快捷键：itar,数组for循环 for (int i = 0; i < args.length; i++) {
                               String arg = args[i];
                            })
        (Mac IDEA 快捷键： itco :集合for迭代循环 for (Iterator iterator = collection.iterator(); iterator.hasNext(); ) {
                                        Object next =  iterator.next();
                           })
        (Mac IDEA 快捷键：itli : List 循环 for (int i = 0; i < list.size(); i++) {
                                        Object o =  list.get(i);
                                        })
        (Mac IDEA 快捷键：ittok : tokens 循环  for (StringTokenizer stringTokenizer = new StringTokenizer(); stringTokenizer.hasMoreTokens(); ) {
                                            String s = stringTokenizer.nextToken();
                                        })
        (Mac IDEA 快捷键：foreach :each 普通循环 for (:) {
                                         })
    3.AgeRate -- Scanner对象练习for循环，年龄比率(Mac IDEA 快捷键：先new Scanner,Command + Option + V,快速抽取变量)
    4.ContinueDemo -- continue:跳出本次循环
    5.BreakDemo -- break:跳出本层循环,当包含多层循环的时候，break只能跳出内层循环，无法跳出外层循环
    6.ReturnDemo -- return有两基本用途:1、返回方法的返回值;2、终止当前程序
## 第三章 数组 third包
    - ArrayDemo -- 数组介绍：数组表示存储相同数据类型数据的有序集合
        特点：
            1、数组中存放的数据必须是同一个数据类型，可以是基本数据类型也可以是引用数据类型
            2、数组在定义的时候必须要给定大小，且大小不可以改变
            3、可以通过下标值来获取数据，下标从0开始
            4、插入数组中的数据是有序集合，此时有序并不是指代大小排序，而是指插入的顺序
        使用：
            1、声明数组
            2、创建空间
            3、赋值
            4、数组操作
    - TwoArray -- 二维数组: 定义二维数组的时候一定需要注意，必须要给定数组的长度
        
    
                    
        
    
## 第四章 面向对象 oop包