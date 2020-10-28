  学习笔记
  
串行GC
  （Xms4g -Xmx4g）  
  java -XX:+UseSerialGC -Xms4g -Xmx4g -XX:+PrintGCDetails GCLogAnalysis

正在执行...
[GC (Allocation Failure) [DefNew: 1118528K->139776K(1258304K), 0.1037905 secs] 1118528K->245555K(4054528K), 0.1042378 secs] [Times: user=0.03 sys=0.06, real=0.10 secs]
[GC (Allocation Failure) [DefNew: 1258304K->139775K(1258304K), 0.1163924 secs] 1364083K->388957K(4054528K), 0.1167144 secs] [Times: user=0.03 sys=0.09, real=0.12 secs]
[GC (Allocation Failure) [DefNew: 1258303K->139775K(1258304K), 0.0820428 secs] 1507485K->544244K(4054528K), 0.0823827 secs] [Times: user=0.03 sys=0.05, real=0.08 secs]

执行结束!共生成对象次数:12944

Heap
 def new generation   total 1258304K, used 230785K [0x00000006c0000000, 0x0000000715550000, 0x0000000715550000)
  eden space 1118528K,   8% used [0x00000006c0000000, 0x00000006c58e0510, 0x0000000704450000)
  from space 139776K,  99% used [0x000000070ccd0000, 0x000000071554fff8, 0x0000000715550000)
  to   space 139776K,   0% used [0x0000000704450000, 0x0000000704450000, 0x000000070ccd0000)
 tenured generation   total 2796224K, used 404468K [0x0000000715550000, 0x00000007c0000000, 0x00000007c0000000)
   the space 2796224K,  14% used [0x0000000715550000, 0x000000072e04d3e8, 0x000000072e04d400, 0x00000007c0000000)
 Metaspace       used 2714K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 291K, capacity 386K, committed 512K, reserved 1048576K
  
   
   （-Xms512m -Xmx512m）
   
   java -XX:+UseSerialGC -Xms512m -Xmx512m -XX:+PrintGCDetails GCLogAnalysis
   
正在执行...

[GC (Allocation Failure) [DefNew: 139776K->17472K(157248K), 0.0207110 secs] 139776K->39873K(506816K), 0.0210075 secs] [Times: user=0.02 sys=0.02, real=0.02 secs]
[GC (Allocation Failure) [DefNew: 157248K->17469K(157248K), 0.0306917 secs] 179649K->85022K(506816K), 0.0310690 secs] [Times: user=0.03 sys=0.00, real=0.03 secs]
[GC (Allocation Failure) [DefNew: 157245K->17471K(157248K), 0.0233926 secs] 224798K->130840K(506816K), 0.0237868 secs] [Times: user=0.01 sys=0.01, real=0.02 secs]
[GC (Allocation Failure) [DefNew: 157247K->17471K(157248K), 0.0241186 secs] 270616K->175991K(506816K), 0.0243999 secs] [Times: user=0.00 sys=0.02, real=0.03 secs]
[GC (Allocation Failure) [DefNew: 157247K->17468K(157248K), 0.0255493 secs] 315767K->226116K(506816K), 0.0258049 secs] [Times: user=0.02 sys=0.01, real=0.03 secs]
[GC (Allocation Failure) [DefNew: 156588K->17470K(157248K), 0.0242954 secs] 365236K->268733K(506816K), 0.0246215 secs] [Times: user=0.00 sys=0.03, real=0.02 secs]
[GC (Allocation Failure) [DefNew: 157246K->17471K(157248K), 0.0256575 secs] 408509K->322613K(506816K), 0.0260074 secs] [Times: user=0.00 sys=0.02, real=0.03 secs]
[GC (Allocation Failure) [DefNew: 157247K->157247K(157248K), 0.0001211 secs][Tenured: 305141K->276759K(349568K), 0.0356174 secs] 462389K->276759K(506816K), [Metaspace: 2707K->2707K(1056768K)], 0.0361537 secs] [Times: user=0.05 sys=0.00, real=0.04 secs]
[GC (Allocation Failure) [DefNew: 139776K->17470K(157248K), 0.0084607 secs] 416535K->323971K(506816K), 0.0087959 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
[GC (Allocation Failure) [DefNew: 157246K->157246K(157248K), 0.0001203 secs][Tenured: 306501K->305296K(349568K), 0.0388910 secs] 463747K->305296K(506816K), [Metaspace: 2707K->2707K(1056768K)], 0.0395163 secs] [Times: user=0.05 sys=0.00, real=0.04 secs]
[GC (Allocation Failure) [DefNew: 139776K->139776K(157248K), 0.0003001 secs][Tenured: 305296K->314544K(349568K), 0.0436120 secs] 445072K->314544K(506816K), [Metaspace: 2707K->2707K(1056768K)], 0.0442995 secs] [Times: user=0.05 sys=0.00, real=0.05 secs]
[GC (Allocation Failure) [DefNew: 139585K->139585K(157248K), 0.0001864 secs][Tenured: 314544K->300709K(349568K), 0.0417862 secs] 454130K->300709K(506816K), [Metaspace: 2707K->2707K(1056768K)], 0.0426181 secs] [Times: user=0.05 sys=0.00, real=0.04 secs]
[GC (Allocation Failure) [DefNew: 139589K->17470K(157248K), 0.0099747 secs] 440298K->345651K(506816K), 0.0101892 secs] [Times: user=0.01 sys=0.00, real=0.01 secs]
[GC (Allocation Failure) [DefNew: 157246K->157246K(157248K), 0.0002351 secs][Tenured: 328181K->328213K(349568K), 0.0361336 secs] 485427K->328213K(506816K), [Metaspace: 2707K->2707K(1056768K)], 0.0369317 secs] [Times: user=0.03 sys=0.00, real=0.04 secs]
[GC (Allocation Failure) [DefNew: 139776K->139776K(157248K), 0.0001922 secs][Tenured: 328213K->332197K(349568K), 0.0394689 secs] 467989K->332197K(506816K), [Metaspace: 2707K->2707K(1056768K)], 0.0402950 secs] [Times: user=0.05 sys=0.00, real=0.04 secs]
[GC (Allocation Failure) [DefNew: 139776K->139776K(157248K), 0.0001291 secs][Tenured: 332197K->344071K(349568K), 0.0483723 secs] 471973K->344071K(506816K), [Metaspace: 2707K->2707K(1056768K)], 0.0489339 secs] [Times: user=0.05 sys=0.00, real=0.05 secs]
[GC (Allocation Failure) [DefNew: 139555K->139555K(157248K), 0.0001821 secs][Tenured: 344071K->335889K(349568K), 0.0472461 secs] 483627K->335889K(506816K), [Metaspace: 2707K->2707K(1056768K)], 0.0478692 secs] [Times: user=0.05 sys=0.00, real=0.05 secs]
[GC (Allocation Failure) [DefNew: 139776K->139776K(157248K), 0.0001142 secs][Tenured: 335889K->349497K(349568K), 0.0341472 secs] 475665K->353481K(506816K), [Metaspace: 2707K->2707K(1056768K)], 0.0346760 secs] [Times: user=0.03 sys=0.02, real=0.03 secs]
[Full GC (Allocation Failure) [Tenured: 349497K->349467K(349568K), 0.0431214 secs] 506714K->363237K(506816K), [Metaspace: 2707K->2707K(1056768K)], 0.0437749 secs] [Times: user=0.05 sys=0.00, real=0.04 secs]

执行结束!共生成对象次数:10231

Heap
 def new generation   total 157248K, used 19565K [0x00000000e0000000, 0x00000000eaaa0000, 0x00000000eaaa0000)
  eden space 139776K,  13% used [0x00000000e0000000, 0x00000000e131b400, 0x00000000e8880000)
  from space 17472K,   0% used [0x00000000e9990000, 0x00000000e9990000, 0x00000000eaaa0000)
  to   space 17472K,   0% used [0x00000000e8880000, 0x00000000e8880000, 0x00000000e9990000)
 tenured generation   total 349568K, used 349467K [0x00000000eaaa0000, 0x0000000100000000, 0x0000000100000000)
   the space 349568K,  99% used [0x00000000eaaa0000, 0x00000000fffe6c58, 0x00000000fffe6e00, 0x0000000100000000)
 Metaspace       used 2714K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 291K, capacity 386K, committed 512K, reserved 1048576K
  
  
  
  
  并行GC
      （Xms4g -Xmx4g） 
       
       java  -Xms4g -Xmx4g -XX:+PrintGCDetails GCLogAnalysis
    
正在执行...

[GC (Allocation Failure) [PSYoungGen: 1048576K->174576K(1223168K)] 1048576K->247430K(4019712K), 0.0354972 secs] [Times: user=0.14 sys=0.23, real=0.04 secs]
[GC (Allocation Failure) [PSYoungGen: 1223152K->174586K(1223168K)] 1296006K->382426K(4019712K), 0.0429129 secs] [Times: user=0.13 sys=0.25, real=0.04 secs]
[GC (Allocation Failure) [PSYoungGen: 1223162K->174577K(1223168K)] 1431002K->509672K(4019712K), 0.0417265 secs] [Times: user=0.16 sys=0.22, real=0.04 secs]
[GC (Allocation Failure) [PSYoungGen: 1223153K->174582K(1223168K)] 1558248K->637686K(4019712K), 0.0422313 secs] [Times: user=0.11 sys=0.09, real=0.04 secs]

 执行结束!共生成对象次数:18473
 
Heap
 PSYoungGen      total 1223168K, used 872042K [0x000000076ab00000, 0x00000007c0000000, 0x00000007c0000000)
  eden space 1048576K, 66% used [0x000000076ab00000,0x000000079541d028,0x00000007aab00000)
  from space 174592K, 99% used [0x00000007b5580000,0x00000007bfffd828,0x00000007c0000000)
  to   space 174592K, 0% used [0x00000007aab00000,0x00000007aab00000,0x00000007b5580000)
 ParOldGen       total 2796544K, used 463104K [0x00000006c0000000, 0x000000076ab00000, 0x000000076ab00000)
  object space 2796544K, 16% used [0x00000006c0000000,0x00000006dc4400b0,0x000000076ab00000)
 Metaspace       used 2714K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 291K, capacity 386K, committed 512K, reserved 1048576K
  
   
   
   (-Xms512m -Xmx512m)
   
   java  -Xms512m -Xmx512m -XX:+PrintGCDetails GCLogAnalysis
   
正在执行...
[GC (Allocation Failure) [PSYoungGen: 131584K->21498K(153088K)] 131584K->44110K(502784K), 0.0074888 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
[GC (Allocation Failure) [PSYoungGen: 152652K->21493K(153088K)] 175264K->87522K(502784K), 0.0119832 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
[GC (Allocation Failure) [PSYoungGen: 153077K->21489K(153088K)] 219106K->127590K(502784K), 0.0093606 secs] [Times: user=0.05 sys=0.08, real=0.01 secs]
[GC (Allocation Failure) [PSYoungGen: 153073K->21499K(153088K)] 259174K->164410K(502784K), 0.0081033 secs] [Times: user=0.03 sys=0.09, real=0.01 secs]
[GC (Allocation Failure) [PSYoungGen: 153007K->21491K(153088K)] 295918K->208141K(502784K), 0.0108276 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
[GC (Allocation Failure) [PSYoungGen: 152494K->21500K(80384K)] 339144K->250220K(430080K), 0.0090253 secs] [Times: user=0.05 sys=0.00, real=0.01 secs]
[GC (Allocation Failure) [PSYoungGen: 79826K->34764K(116736K)] 308546K->268774K(466432K), 0.0050310 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
[GC (Allocation Failure) [PSYoungGen: 93102K->45565K(116736K)] 327112K->284033K(466432K), 0.0056076 secs] [Times: user=0.13 sys=0.00, real=0.01 secs]
[GC (Allocation Failure) [PSYoungGen: 104445K->57466K(116736K)] 342913K->304544K(466432K), 0.0082007 secs] [Times: user=0.11 sys=0.02, real=0.01 secs]
[GC (Allocation Failure) [PSYoungGen: 116069K->42055K(116736K)] 363148K->322166K(466432K), 0.0084680 secs] [Times: user=0.09 sys=0.03, real=0.01 secs]
[GC (Allocation Failure) [PSYoungGen: 100935K->19796K(116736K)] 381046K->340718K(466432K), 0.0079741 secs] [Times: user=0.13 sys=0.00, real=0.01 secs]
[Full GC (Ergonomics) [PSYoungGen: 19796K->0K(116736K)] [ParOldGen: 320921K->244331K(349696K)] 340718K->244331K(466432K), [Metaspace: 2707K->2707K(1056768K)], 0.0370223 secs] [Times: user=0.20 sys=0.00, real=0.04 secs]
[GC (Allocation Failure) [PSYoungGen: 58880K->18840K(116736K)] 303211K->263172K(466432K), 0.0031834 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[GC (Allocation Failure) [PSYoungGen: 77720K->19714K(116736K)] 322052K->281085K(466432K), 0.0041189 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[GC (Allocation Failure) [PSYoungGen: 78594K->25692K(116736K)] 339965K->303954K(466432K), 0.0075945 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
[GC (Allocation Failure) [PSYoungGen: 84482K->22752K(116736K)] 362743K->323624K(466432K), 0.0075916 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
[Full GC (Ergonomics) [PSYoungGen: 22752K->0K(116736K)] [ParOldGen: 300871K->271360K(349696K)] 323624K->271360K(466432K), [Metaspace: 2707K->2707K(1056768K)], 0.0335336 secs] [Times: user=0.23 sys=0.00, real=0.03 secs]
[GC (Allocation Failure) [PSYoungGen: 58774K->21874K(116736K)] 330135K->293235K(466432K), 0.0046694 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[GC (Allocation Failure) [PSYoungGen: 80754K->19159K(116736K)] 352115K->311565K(466432K), 0.0048131 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[GC (Allocation Failure) [PSYoungGen: 77980K->22666K(116736K)] 370385K->332342K(466432K), 0.0045805 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[Full GC (Ergonomics) [PSYoungGen: 22666K->0K(116736K)] [ParOldGen: 309675K->290495K(349696K)] 332342K->290495K(466432K), [Metaspace: 2707K->2707K(1056768K)], 0.0397179 secs] [Times: user=0.23 sys=0.00, real=0.04 secs]
[GC (Allocation Failure) [PSYoungGen: 58694K->19500K(116736K)] 349189K->309995K(466432K), 0.0026997 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[GC (Allocation Failure) [PSYoungGen: 78207K->19453K(116736K)] 368703K->328982K(466432K), 0.0044966 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[Full GC (Ergonomics) [PSYoungGen: 19453K->0K(116736K)] [ParOldGen: 309528K->303242K(349696K)] 328982K->303242K(466432K), [Metaspace: 2707K->2707K(1056768K)], 0.0374633 secs] [Times: user=0.20 sys=0.00, real=0.04 secs]
[GC (Allocation Failure) [PSYoungGen: 58859K->20362K(116736K)] 362101K->323604K(466432K), 0.0025526 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[GC (Allocation Failure) [PSYoungGen: 79242K->21822K(116736K)] 382484K->343863K(466432K), 0.0048635 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
[Full GC (Ergonomics) [PSYoungGen: 21822K->0K(116736K)] [ParOldGen: 322040K->310306K(349696K)] 343863K->310306K(466432K), [Metaspace: 2707K->2707K(1056768K)], 0.0403676 secs] [Times: user=0.38 sys=0.00, real=0.04 secs]
[GC (Allocation Failure) [PSYoungGen: 58872K->22660K(116736K)] 369178K->332967K(466432K), 0.0030608 secs] [Times: user=0.13 sys=0.00, real=0.00 secs]
[GC (Allocation Failure) [PSYoungGen: 81416K->24347K(116736K)] 391722K->357095K(466432K), 0.0056716 secs] [Times: user=0.05 sys=0.08, real=0.01 secs]
[Full GC (Ergonomics) [PSYoungGen: 24347K->0K(116736K)] [ParOldGen: 332748K->324270K(349696K)] 357095K->324270K(466432K), [Metaspace: 2707K->2707K(1056768K)], 0.0418571 secs] [Times: user=0.25 sys=0.00, real=0.04 secs]
[Full GC (Ergonomics) [PSYoungGen: 58880K->0K(116736K)] [ParOldGen: 324270K->328736K(349696K)] 383150K->328736K(466432K), [Metaspace: 2707K->2707K(1056768K)], 0.0437383 secs] [Times: user=0.36 sys=0.00, real=0.04 secs]
[Full GC (Ergonomics) [PSYoungGen: 58860K->0K(116736K)] [ParOldGen: 328736K->326895K(349696K)] 387597K->326895K(466432K), [Metaspace: 2707K->2707K(1056768K)], 0.0401145 secs] [Times: user=0.36 sys=0.00, real=0.04 secs]
[Full GC (Ergonomics) [PSYoungGen: 58305K->0K(116736K)] [ParOldGen: 326895K->329517K(349696K)] 385201K->329517K(466432K), [Metaspace: 2707K->2707K(1056768K)], 0.0402495 secs] [Times: user=0.19 sys=0.00, real=0.04 secs]
[Full GC (Ergonomics) [PSYoungGen: 58880K->0K(116736K)] [ParOldGen: 329517K->329999K(349696K)] 388397K->329999K(466432K), [Metaspace: 2707K->2707K(1056768K)], 0.0413000 secs] [Times: user=0.25 sys=0.00, real=0.04 secs]
[Full GC (Ergonomics) [PSYoungGen: 58880K->0K(116736K)] [ParOldGen: 329999K->336676K(349696K)] 388879K->336676K(466432K), [Metaspace: 2707K->2707K(1056768K)], 0.0447774 secs] [Times: user=0.38 sys=0.00, real=0.04 secs]
[Full GC (Ergonomics) [PSYoungGen: 58880K->0K(116736K)] [ParOldGen: 336676K->341648K(349696K)] 395556K->341648K(466432K), [Metaspace: 2707K->2707K(1056768K)], 0.0412300 secs] [Times: user=0.23 sys=0.03, real=0.04 secs]
执行结束!共生成对象次数:8292
Heap
 PSYoungGen      total 116736K, used 2687K [0x00000000f5580000, 0x0000000100000000, 0x0000000100000000)
  eden space 58880K, 4% used [0x00000000f5580000,0x00000000f581fd48,0x00000000f8f00000)
  from space 57856K, 0% used [0x00000000fc780000,0x00000000fc780000,0x0000000100000000)
  to   space 57856K, 0% used [0x00000000f8f00000,0x00000000f8f00000,0x00000000fc780000)
 ParOldGen       total 349696K, used 341648K [0x00000000e0000000, 0x00000000f5580000, 0x00000000f5580000)
  object space 349696K, 97% used [0x00000000e0000000,0x00000000f4da42f0,0x00000000f5580000)
 Metaspace       used 2714K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 291K, capacity 386K, committed 512K, reserved 1048576K
  
 
  CMS GC
    （Xms4g -Xmx4g） 
    java -XX:+UseConcMarkSweepGC -Xms4g -Xmx4g -XX:+PrintGCDetails GCLogAnalysis

正在执行...

[GC (Allocation Failure) [ParNew: 545344K->68095K(613440K), 0.0261808 secs] 545344K->151517K(4126208K), 0.0265457 secs] [Times: user=0.14 sys=0.09, real=0.03 secs]
[GC (Allocation Failure) [ParNew: 613439K->68095K(613440K), 0.0301948 secs] 696861K->276809K(4126208K), 0.0306312 secs] [Times: user=0.09 sys=0.08, real=0.03 secs]
[GC (Allocation Failure) [ParNew: 613439K->68096K(613440K), 0.0683047 secs] 822153K->404699K(4126208K), 0.0685895 secs] [Times: user=0.42 sys=0.06, real=0.07 secs]
[GC (Allocation Failure) [ParNew: 613078K->68096K(613440K), 0.0717609 secs] 949682K->536655K(4126208K), 0.0721928 secs] [Times: user=0.41 sys=0.05, real=0.07 secs]
[GC (Allocation Failure) [ParNew: 613440K->68094K(613440K), 0.0713928 secs] 1081999K->646873K(4126208K), 0.0716431 secs] [Times: user=0.36 sys=0.03, real=0.07 secs]
[GC (Allocation Failure) [ParNew: 613438K->68095K(613440K), 0.0776029 secs] 1192217K->765474K(4126208K), 0.0777717 secs] [Times: user=0.38 sys=0.09, real=0.08 secs]
[GC (Allocation Failure) [ParNew: 613439K->68096K(613440K), 0.0833512 secs] 1310818K->889994K(4126208K), 0.0835438 secs] [Times: user=0.36 sys=0.09, real=0.08 secs]

执行结束!共生成对象次数:14566

Heap
 par new generation   total 613440K, used 90345K [0x00000006c0000000, 0x00000006e9990000, 0x00000006e9990000)
  eden space 545344K,   4% used [0x00000006c0000000, 0x00000006c15ba550, 0x00000006e1490000)
  from space 68096K, 100% used [0x00000006e5710000, 0x00000006e9990000, 0x00000006e9990000)
  to   space 68096K,   0% used [0x00000006e1490000, 0x00000006e1490000, 0x00000006e5710000)
 concurrent mark-sweep generation total 3512768K, used 821898K [0x00000006e9990000, 0x00000007c0000000, 0x00000007c0000000)
 Metaspace       used 2714K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 291K, capacity 386K, committed 512K, reserved 1048576K
  
  
  
(-Xms512m -Xmx512m)

 java -XX:+UseConcMarkSweepGC -Xms512m -Xmx512m -XX:+PrintGCDetails GCLogAnalysis
 
正在执行...
[GC (Allocation Failure) [ParNew: 139776K->17472K(157248K), 0.0090440 secs] 139776K->50389K(506816K), 0.0094684 secs] [Times: user=0.05 sys=0.08, real=0.01 secs]
[GC (Allocation Failure) [ParNew: 157248K->17472K(157248K), 0.0128663 secs] 190165K->90189K(506816K), 0.0132793 secs] [Times: user=0.08 sys=0.05, real=0.01 secs]
[GC (Allocation Failure) [ParNew: 157248K->17472K(157248K), 0.0261698 secs] 229965K->138376K(506816K), 0.0265551 secs] [Times: user=0.20 sys=0.05, real=0.03 secs]
[GC (Allocation Failure) [ParNew: 157248K->17472K(157248K), 0.0247586 secs] 278152K->184051K(506816K), 0.0251459 secs] [Times: user=0.11 sys=0.02, real=0.02 secs]
[GC (Allocation Failure) [ParNew: 157248K->17471K(157248K), 0.0242356 secs] 323827K->229036K(506816K), 0.0245555 secs] [Times: user=0.11 sys=0.02, real=0.03 secs]
[GC (CMS Initial Mark) [1 CMS-initial-mark: 211565K(349568K)] 232064K(506816K), 0.0004881 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-mark-start]
[CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-preclean-start]
[CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-abortable-preclean-start]
[GC (Allocation Failure) [ParNew: 157247K->17471K(157248K), 0.0226201 secs] 368812K->272925K(506816K), 0.0229023 secs] [Times: user=0.22 sys=0.03, real=0.02 secs]
[GC (Allocation Failure) [ParNew: 157247K->17471K(157248K), 0.0239110 secs] 412701K->317345K(506816K), 0.0241774 secs] [Times: user=0.11 sys=0.01, real=0.02 secs]
[GC (Allocation Failure) [ParNew: 157247K->17471K(157248K), 0.0239444 secs] 457121K->361943K(506816K), 0.0241325 secs] [Times: user=0.23 sys=0.02, real=0.03 secs]
[CMS-concurrent-abortable-preclean: 0.002/0.117 secs] [Times: user=0.63 sys=0.06, real=0.12 secs]
[GC (CMS Final Remark) [YG occupancy: 20591 K (157248 K)][Rescan (parallel) , 0.0002617 secs][weak refs processing, 0.0000259 secs][class unloading, 0.0001890 secs][scrub symbol table, 0.0002797 secs][scrub string table, 0.0000968 secs][1 CMS-remark: 344472K(349568K)] 365063K(506816K), 0.0011298 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-sweep-start]
[CMS-concurrent-sweep: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-reset-start]
[CMS-concurrent-reset: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[GC (Allocation Failure) [ParNew: 157247K->17471K(157248K), 0.0081930 secs] 456857K->362328K(506816K), 0.0083202 secs] [Times: user=0.08 sys=0.00, real=0.01 secs]
[GC (CMS Initial Mark) [1 CMS-initial-mark: 344857K(349568K)] 362712K(506816K), 0.0002521 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-mark-start]
[CMS-concurrent-mark: 0.002/0.002 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-preclean-start]
[CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-abortable-preclean-start]
[CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[GC (CMS Final Remark) [YG occupancy: 30429 K (157248 K)][Rescan (parallel) , 0.0003707 secs][weak refs processing, 0.0000308 secs][class unloading, 0.0002759 secs][scrub symbol table, 0.0003482 secs][scrub string table, 0.0001504 secs][1 CMS-remark: 344857K(349568K)] 375286K(506816K), 0.0015061 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-sweep-start]
[CMS-concurrent-sweep: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-reset-start]
[CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[GC (Allocation Failure) [ParNew: 157247K->17470K(157248K), 0.0075795 secs] 404705K->306658K(506816K), 0.0076976 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
[GC (CMS Initial Mark) [1 CMS-initial-mark: 289187K(349568K)] 306730K(506816K), 0.0001564 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-mark-start]
[CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-preclean-start]
[CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-abortable-preclean-start]
[GC (Allocation Failure) [ParNew: 157246K->17471K(157248K), 0.0091883 secs] 446434K->348454K(506816K), 0.0093119 secs] [Times: user=0.13 sys=0.00, real=0.01 secs]
[CMS-concurrent-abortable-preclean: 0.001/0.025 secs] [Times: user=0.14 sys=0.00, real=0.02 secs]
[GC (CMS Final Remark) [YG occupancy: 26858 K (157248 K)][Rescan (parallel) , 0.0002706 secs][weak refs processing, 0.0000327 secs][class unloading, 0.0002175 secs][scrub symbol table, 0.0002838 secs][scrub string table, 0.0000972 secs][1 CMS-remark: 330983K(349568K)] 357841K(506816K), 0.0011801 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-sweep-start]
[CMS-concurrent-sweep: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-reset-start]
[CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[GC (Allocation Failure) [ParNew: 157247K->17470K(157248K), 0.0085265 secs] 451836K->356810K(506816K), 0.0086439 secs] [Times: user=0.13 sys=0.00, real=0.01 secs]
[GC (CMS Initial Mark) [1 CMS-initial-mark: 339340K(349568K)] 357083K(506816K), 0.0002170 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-mark-start]
[CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-preclean-start]
[CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-abortable-preclean-start]
[CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[GC (CMS Final Remark) [YG occupancy: 44414 K (157248 K)][Rescan (parallel) , 0.0002795 secs][weak refs processing, 0.0000292 secs][class unloading, 0.0002711 secs][scrub symbol table, 0.0004094 secs][scrub string table, 0.0001015 secs][1 CMS-remark: 339340K(349568K)] 383754K(506816K), 0.0014110 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-sweep-start]
[CMS-concurrent-sweep: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-reset-start]
[CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[GC (Allocation Failure) [ParNew: 157229K->17471K(157248K), 0.0107498 secs] 427680K->333525K(506816K), 0.0108639 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
[GC (CMS Initial Mark) [1 CMS-initial-mark: 316053K(349568K)] 334009K(506816K), 0.0001764 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-mark-start]
[CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.05 sys=0.00, real=0.00 secs]
[CMS-concurrent-preclean-start]
[CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-abortable-preclean-start]
[CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[GC (CMS Final Remark) [YG occupancy: 37425 K (157248 K)][Rescan (parallel) , 0.0002639 secs][weak refs processing, 0.0000272 secs][class unloading, 0.0001895 secs][scrub symbol table, 0.0002754 secs][scrub string table, 0.0000978 secs][1 CMS-remark: 316053K(349568K)] 353478K(506816K), 0.0011316 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-sweep-start]
[CMS-concurrent-sweep: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-reset-start]
[CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[GC (Allocation Failure) [ParNew: 157247K->17471K(157248K), 0.0072996 secs] 443430K->345710K(506816K), 0.0074342 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
[GC (CMS Initial Mark) [1 CMS-initial-mark: 328239K(349568K)] 345998K(506816K), 0.0002389 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-mark-start]
[CMS-concurrent-mark: 0.002/0.002 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-preclean-start]
[CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-abortable-preclean-start]
[CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[GC (CMS Final Remark) [YG occupancy: 40525 K (157248 K)][Rescan (parallel) , 0.0003612 secs][weak refs processing, 0.0000318 secs][class unloading, 0.0003113 secs][scrub symbol table, 0.0003743 secs][scrub string table, 0.0002131 secs][1 CMS-remark: 328239K(349568K)] 368765K(506816K), 0.0016192 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-sweep-start]
[CMS-concurrent-sweep: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-reset-start]
[CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[GC (Allocation Failure) [ParNew: 157247K->17471K(157248K), 0.0083662 secs] 446913K->348647K(506816K), 0.0085279 secs] [Times: user=0.11 sys=0.01, real=0.01 secs]
[GC (CMS Initial Mark) [1 CMS-initial-mark: 331175K(349568K)] 349319K(506816K), 0.0001746 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-mark-start]
[CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-preclean-start]
[CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-abortable-preclean-start]
[CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[GC (CMS Final Remark) [YG occupancy: 44633 K (157248 K)][Rescan (parallel) , 0.0002617 secs][weak refs processing, 0.0000261 secs][class unloading, 0.0001793 secs][scrub symbol table, 0.0002726 secs][scrub string table, 0.0001198 secs][1 CMS-remark: 331175K(349568K)] 375809K(506816K), 0.0011353 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-sweep-start]
[CMS-concurrent-sweep: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-reset-start]
[CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[GC (Allocation Failure) [ParNew: 157152K->17471K(157248K), 0.0090284 secs] 449378K->354719K(506816K), 0.0091514 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
[GC (CMS Initial Mark) [1 CMS-initial-mark: 337247K(349568K)] 358403K(506816K), 0.0002179 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-mark-start]
[CMS-concurrent-mark: 0.002/0.002 secs] [Times: user=0.02 sys=0.00, real=0.00 secs]
[CMS-concurrent-preclean-start]
[CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-abortable-preclean-start]
[CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[GC (CMS Final Remark) [YG occupancy: 42723 K (157248 K)][Rescan (parallel) , 0.0003163 secs][weak refs processing, 0.0000263 secs][class unloading, 0.0001768 secs][scrub symbol table, 0.0002809 secs][scrub string table, 0.0000979 secs][1 CMS-remark: 337247K(349568K)] 379971K(506816K), 0.0011752 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-sweep-start]
[CMS-concurrent-sweep: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-reset-start]
[CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[GC (Allocation Failure) [ParNew: 157247K->157247K(157248K), 0.0000803 secs][CMS: 304174K->328594K(349568K), 0.0450045 secs] 461421K->328594K(506816K), [Metaspace: 2707K->2707K(1056768K)], 0.0455674 secs] [Times: user=0.05 sys=0.00, real=0.05 secs]
[GC (CMS Initial Mark) [1 CMS-initial-mark: 328594K(349568K)] 328941K(506816K), 0.0004972 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-mark-start]
[CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.05 sys=0.00, real=0.00 secs]
[CMS-concurrent-preclean-start]
[CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-abortable-preclean-start]
[CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[GC (CMS Final Remark) [YG occupancy: 21138 K (157248 K)][Rescan (parallel) , 0.0005460 secs][weak refs processing, 0.0000740 secs][class unloading, 0.0002148 secs][scrub symbol table, 0.0003135 secs][scrub string table, 0.0001178 secs][1 CMS-remark: 328594K(349568K)] 349732K(506816K), 0.0017578 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-sweep-start]
[CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-reset-start]
[CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[GC (Allocation Failure) [ParNew: 139776K->139776K(157248K), 0.0001959 secs][CMS: 327012K->339946K(349568K), 0.0452126 secs] 466788K->339946K(506816K), [Metaspace: 2707K->2707K(1056768K)], 0.0461533 secs] [Times: user=0.05 sys=0.00, real=0.05 secs]
[GC (CMS Initial Mark) [1 CMS-initial-mark: 339946K(349568K)] 340110K(506816K), 0.0007172 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-mark-start]
[CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-preclean-start]
[CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-abortable-preclean-start]
[CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[GC (CMS Final Remark) [YG occupancy: 22779 K (157248 K)][Rescan (parallel) , 0.0003197 secs][weak refs processing, 0.0000337 secs][class unloading, 0.0001945 secs][scrub symbol table, 0.0003253 secs][scrub string table, 0.0001180 secs][1 CMS-remark: 339946K(349568K)] 362725K(506816K), 0.0013552 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-sweep-start]
[CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-reset-start]
[CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[GC (Allocation Failure) [ParNew: 139776K->139776K(157248K), 0.0002356 secs][CMS: 339781K->349229K(349568K), 0.0491281 secs] 479557K->349885K(506816K), [Metaspace: 2707K->2707K(1056768K)], 0.0499903 secs] [Times: user=0.05 sys=0.00, real=0.05 secs]
[GC (CMS Initial Mark) [1 CMS-initial-mark: 349229K(349568K)] 353622K(506816K), 0.0009704 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-mark-start]
[CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-preclean-start]
[CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-abortable-preclean-start]
[CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[GC (CMS Final Remark) [YG occupancy: 33324 K (157248 K)][Rescan (parallel) , 0.0005805 secs][weak refs processing, 0.0000429 secs][class unloading, 0.0002423 secs][scrub symbol table, 0.0003624 secs][scrub string table, 0.0001733 secs][1 CMS-remark: 349229K(349568K)] 382553K(506816K), 0.0020540 secs] [Times: user=0.02 sys=0.00, real=0.00 secs]
[CMS-concurrent-sweep-start]
[CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-reset-start]
[CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[GC (Allocation Failure) [ParNew: 157233K->157233K(157248K), 0.0003014 secs][CMS: 348821K->349536K(349568K), 0.0503737 secs] 506054K->357961K(506816K), [Metaspace: 2707K->2707K(1056768K)], 0.0515226 secs] [Times: user=0.05 sys=0.00, real=0.05 secs]
[GC (CMS Initial Mark) [1 CMS-initial-mark: 349536K(349568K)] 360951K(506816K), 0.0008307 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-mark-start]
[CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-preclean-start]
[CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-abortable-preclean-start]
[CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[GC (CMS Final Remark) [YG occupancy: 40397 K (157248 K)][Rescan (parallel) , 0.0005095 secs][weak refs processing, 0.0000811 secs][class unloading, 0.0002052 secs][scrub symbol table, 0.0003905 secs][scrub string table, 0.0001584 secs][1 CMS-remark: 349536K(349568K)] 389934K(506816K), 0.0021494 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-sweep-start]
[CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-reset-start]
[CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[GC (Allocation Failure) [ParNew: 157231K->157231K(157248K), 0.0002825 secs][CMS: 349450K->349557K(349568K), 0.0497779 secs] 506682K->355678K(506816K), [Metaspace: 2707K->2707K(1056768K)], 0.0508360 secs] [Times: user=0.06 sys=0.00, real=0.05 secs]
[GC (CMS Initial Mark) [1 CMS-initial-mark: 349557K(349568K)] 358675K(506816K), 0.0005925 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-mark-start]
[CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-preclean-start]
[CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-abortable-preclean-start]
[CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[GC (CMS Final Remark) [YG occupancy: 39404 K (157248 K)][Rescan (parallel) , 0.0005653 secs][weak refs processing, 0.0000681 secs][class unloading, 0.0002778 secs][scrub symbol table, 0.0003590 secs][scrub string table, 0.0001471 secs][1 CMS-remark: 349557K(349568K)] 388961K(506816K), 0.0021067 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-sweep-start]
[CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-reset-start]
[CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[GC (Allocation Failure) [ParNew: 157152K->157152K(157248K), 0.0003129 secs][CMS: 348111K->349208K(349568K), 0.0479220 secs] 505264K->361822K(506816K), [Metaspace: 2707K->2707K(1056768K)], 0.0490699 secs] [Times: user=0.05 sys=0.00, real=0.05 secs]
[GC (CMS Initial Mark) [1 CMS-initial-mark: 349208K(349568K)] 364713K(506816K), 0.0008576 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-mark-start]
[CMS-concurrent-mark: 0.002/0.002 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-preclean-start]
[CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.03 sys=0.00, real=0.00 secs]
[CMS-concurrent-abortable-preclean-start]
[CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[GC (CMS Final Remark) [YG occupancy: 52273 K (157248 K)][Rescan (parallel) , 0.0005819 secs][weak refs processing, 0.0000596 secs][class unloading, 0.0001964 secs][scrub symbol table, 0.0003396 secs][scrub string table, 0.0001175 secs][1 CMS-remark: 349208K(349568K)] 401481K(506816K), 0.0018239 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-sweep-start]
[CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[CMS-concurrent-reset-start]
[CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
执行结束!共生成对象次数:12087
Heap
 par new generation   total 157248K, used 80665K [0x00000000e0000000, 0x00000000eaaa0000, 0x00000000eaaa0000)
  eden space 139776K,  57% used [0x00000000e0000000, 0x00000000e4ec6558, 0x00000000e8880000)
  from space 17472K,   0% used [0x00000000e8880000, 0x00000000e8880000, 0x00000000e9990000)
  to   space 17472K,   0% used [0x00000000e9990000, 0x00000000e9990000, 0x00000000eaaa0000)
 concurrent mark-sweep generation total 349568K, used 348299K [0x00000000eaaa0000, 0x0000000100000000, 0x0000000100000000)
 Metaspace       used 2714K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 291K, capacity 386K, committed 512K, reserved 1048576K
  
  
  
  

G1 GC
   （Xms4g -Xmx4g） 
   java -XX:+UseG1GC -Xms4g -Xmx4g -XX:+PrintGC GCLogAnalysis
正在执行...
[GC pause (G1 Evacuation Pause) (young) 204M->71M(4096M), 0.0121029 secs]
[GC pause (G1 Evacuation Pause) (young) 249M->128M(4096M), 0.0119889 secs]
[GC pause (G1 Evacuation Pause) (young) 306M->192M(4096M), 0.0129633 secs]
[GC pause (G1 Evacuation Pause) (young) 370M->242M(4096M), 0.0117079 secs]
[GC pause (G1 Evacuation Pause) (young) 420M->305M(4096M), 0.0120162 secs]
[GC pause (G1 Evacuation Pause) (young) 483M->366M(4096M), 0.0122289 secs]
[GC pause (G1 Evacuation Pause) (young) 544M->428M(4096M), 0.0117219 secs]
[GC pause (G1 Evacuation Pause) (young) 632M->487M(4096M), 0.0136928 secs]
[GC pause (G1 Evacuation Pause) (young) 763M->572M(4096M), 0.0152200 secs]
[GC pause (G1 Evacuation Pause) (young) 854M->667M(4096M), 0.0178736 secs]
[GC pause (G1 Evacuation Pause) (young) 985M->759M(4096M), 0.0181528 secs]
[GC pause (G1 Evacuation Pause) (young) 1461M->925M(4096M), 0.0300241 secs]
[GC pause (G1 Evacuation Pause) (young) 1439M->1034M(4096M), 0.0241655 secs]
[GC pause (G1 Evacuation Pause) (young) 1688M->1180M(4096M), 0.0268638 secs]
执行结束!共生成对象次数:18472


(-Xms512m -Xmx512m)
 java -XX:+UseG1GC -Xms512m -Xmx512m -XX:+PrintGC GCLogAnalysis
正在执行...
[GC pause (G1 Evacuation Pause) (young) 34M->14M(512M), 0.0038594 secs]
[GC pause (G1 Evacuation Pause) (young) 41M->25M(512M), 0.0045636 secs]
[GC pause (G1 Evacuation Pause) (young) 66M->38M(512M), 0.0054584 secs]
[GC pause (G1 Evacuation Pause) (young) 98M->55M(512M), 0.0050939 secs]
[GC pause (G1 Evacuation Pause) (young) 246M->112M(512M), 0.0084520 secs]
[GC pause (G1 Evacuation Pause) (young) 221M->144M(512M), 0.0094468 secs]
[GC pause (G1 Evacuation Pause) (young) 310M->188M(512M), 0.0083811 secs]
[GC pause (G1 Humongous Allocation) (young) (initial-mark) 321M->227M(512M), 0.0170516 secs]
[GC concurrent-root-region-scan-start]
[GC concurrent-root-region-scan-end, 0.0003596 secs]
[GC concurrent-mark-start]
[GC concurrent-mark-end, 0.0017441 secs]
[GC remark, 0.0017803 secs]
[GC cleanup 248M->248M(512M), 0.0011558 secs]
[GC pause (G1 Evacuation Pause) (young)-- 423M->370M(512M), 0.0068401 secs]
[GC pause (G1 Evacuation Pause) (mixed) 376M->353M(512M), 0.0044843 secs]
[GC pause (G1 Humongous Allocation) (young) (initial-mark) 354M->353M(512M), 0.0013433 secs]
[GC concurrent-root-region-scan-start]
[GC concurrent-root-region-scan-end, 0.0002428 secs]
[GC concurrent-mark-start]
[GC concurrent-mark-end, 0.0012726 secs]
[GC remark, 0.0015515 secs]
[GC cleanup 371M->370M(512M), 0.0007999 secs]
[GC concurrent-cleanup-start]
[GC concurrent-cleanup-end, 0.0000789 secs]
[GC pause (G1 Evacuation Pause) (young) 414M->365M(512M), 0.0042391 secs]
[GC pause (G1 Evacuation Pause) (mixed) 384M->323M(512M), 0.0038077 secs]
[GC pause (G1 Evacuation Pause) (mixed) 349M->292M(512M), 0.0062186 secs]
[GC pause (G1 Evacuation Pause) (mixed) 314M->275M(512M), 0.0043016 secs]
[GC pause (G1 Humongous Allocation) (young) (initial-mark) 278M->275M(512M), 0.0022193 secs]
[GC concurrent-root-region-scan-start]
[GC concurrent-root-region-scan-end, 0.0002630 secs]
[GC concurrent-mark-start]
[GC concurrent-mark-end, 0.0025271 secs]
[GC remark, 0.0017267 secs]
[GC cleanup 293M->293M(512M), 0.0008090 secs]
[GC pause (G1 Evacuation Pause) (young)-- 424M->329M(512M), 0.0055601 secs]
[GC pause (G1 Evacuation Pause) (mixed) 340M->313M(512M), 0.0051355 secs]
[GC pause (G1 Humongous Allocation) (young) (initial-mark) 323M->314M(512M), 0.0028182 secs]
[GC concurrent-root-region-scan-start]
[GC concurrent-root-region-scan-end, 0.0001555 secs]
[GC concurrent-mark-start]
[GC concurrent-mark-end, 0.0017082 secs]
[GC remark, 0.0014793 secs]
[GC cleanup 337M->336M(512M), 0.0006376 secs]
[GC concurrent-cleanup-start]
[GC concurrent-cleanup-end, 0.0000722 secs]
[GC pause (G1 Evacuation Pause) (young) 424M->347M(512M), 0.0066179 secs]
[GC pause (G1 Evacuation Pause) (mixed) 362M->319M(512M), 0.0048628 secs]
[GC pause (G1 Evacuation Pause) (mixed) 350M->325M(512M), 0.0035306 secs]
[GC pause (G1 Humongous Allocation) (young) (initial-mark) 334M->329M(512M), 0.0019380 secs]
[GC concurrent-root-region-scan-start]
[GC concurrent-root-region-scan-end, 0.0001941 secs]
[GC concurrent-mark-start]
[GC concurrent-mark-end, 0.0017143 secs]
[GC remark, 0.0013197 secs]
[GC cleanup 352M->351M(512M), 0.0005378 secs]
[GC concurrent-cleanup-start]
[GC concurrent-cleanup-end, 0.0000733 secs]
[GC pause (G1 Evacuation Pause) (young) 413M->356M(512M), 0.0039757 secs]
[GC pause (G1 Evacuation Pause) (mixed) 379M->333M(512M), 0.0051725 secs]
[GC pause (G1 Evacuation Pause) (mixed) 359M->334M(512M), 0.0034287 secs]
[GC pause (G1 Humongous Allocation) (young) (initial-mark) 335M->334M(512M), 0.0019647 secs]
[GC concurrent-root-region-scan-start]
[GC concurrent-root-region-scan-end, 0.0002129 secs]
[GC concurrent-mark-start]
[GC concurrent-mark-end, 0.0018766 secs]
[GC remark, 0.0015356 secs]
[GC cleanup 354M->354M(512M), 0.0009460 secs]
[GC pause (G1 Evacuation Pause) (young) 407M->355M(512M), 0.0033584 secs]
[GC pause (G1 Evacuation Pause) (mixed) 377M->338M(512M), 0.0057723 secs]
[GC pause (G1 Humongous Allocation) (young) (initial-mark) 340M->338M(512M), 0.0022584 secs]
[GC concurrent-root-region-scan-start]
[GC concurrent-root-region-scan-end, 0.0002412 secs]
[GC concurrent-mark-start]
[GC concurrent-mark-end, 0.0019881 secs]
[GC remark, 0.0016140 secs]
[GC cleanup 357M->357M(512M), 0.0006962 secs]
[GC pause (G1 Evacuation Pause) (young) 400M->351M(512M), 0.0040692 secs]
[GC pause (G1 Evacuation Pause) (mixed) 374M->340M(512M), 0.0051950 secs]
[GC pause (G1 Humongous Allocation) (young) (initial-mark) 341M->341M(512M), 0.0020288 secs]
[GC concurrent-root-region-scan-start]
[GC concurrent-root-region-scan-end, 0.0002927 secs]
[GC concurrent-mark-start]
[GC concurrent-mark-end, 0.0019658 secs]
[GC remark, 0.0017702 secs]
[GC cleanup 363M->363M(512M), 0.0016720 secs]
[GC pause (G1 Evacuation Pause) (young) 411M->360M(512M), 0.0028981 secs]
[GC pause (G1 Evacuation Pause) (mixed) 386M->351M(512M), 0.0073221 secs]
[GC pause (G1 Humongous Allocation) (young) (initial-mark) 356M->351M(512M), 0.0016283 secs]
[GC concurrent-root-region-scan-start]
[GC concurrent-root-region-scan-end, 0.0002873 secs]
[GC concurrent-mark-start]
[GC concurrent-mark-end, 0.0020150 secs]
[GC remark, 0.0015942 secs]
[GC cleanup 370M->370M(512M), 0.0008871 secs]
[GC pause (G1 Evacuation Pause) (young) 407M->371M(512M), 0.0056054 secs]
[GC pause (G1 Evacuation Pause) (mixed) 392M->357M(512M), 0.0050227 secs]
[GC pause (G1 Humongous Allocation) (young) (initial-mark) 360M->358M(512M), 0.0018779 secs]
[GC concurrent-root-region-scan-start]
[GC concurrent-root-region-scan-end, 0.0002687 secs]
[GC concurrent-mark-start]
[GC concurrent-mark-end, 0.0029358 secs]
[GC remark, 0.0019512 secs]
[GC cleanup 380M->380M(512M), 0.0013220 secs]
[GC pause (G1 Evacuation Pause) (young) 409M->375M(512M), 0.0035956 secs]
[GC pause (G1 Evacuation Pause) (mixed) 401M->366M(512M), 0.0083604 secs]
[GC pause (G1 Humongous Allocation) (young) (initial-mark) 376M->368M(512M), 0.0022573 secs]
[GC concurrent-root-region-scan-start]
[GC concurrent-root-region-scan-end, 0.0001887 secs]
[GC concurrent-mark-start]
[GC concurrent-mark-end, 0.0019400 secs]
[GC remark, 0.0020030 secs]
[GC cleanup 390M->389M(512M), 0.0011321 secs]
[GC concurrent-cleanup-start]
[GC concurrent-cleanup-end, 0.0000786 secs]
[GC pause (G1 Evacuation Pause) (young) 407M->376M(512M), 0.0032366 secs]
[GC pause (G1 Evacuation Pause) (mixed) 403M->365M(512M), 0.0051590 secs]
[GC pause (G1 Humongous Allocation) (young) (initial-mark) 372M->366M(512M), 0.0026834 secs]
[GC concurrent-root-region-scan-start]
[GC concurrent-root-region-scan-end, 0.0002732 secs]
[GC concurrent-mark-start]
[GC concurrent-mark-end, 0.0023078 secs]
[GC remark, 0.0020382 secs]
[GC cleanup 386M->386M(512M), 0.0010498 secs]
[GC pause (G1 Evacuation Pause) (young) 400M->371M(512M), 0.0024627 secs]
[GC pause (G1 Evacuation Pause) (mixed) 395M->362M(512M), 0.0065314 secs]
[GC pause (G1 Humongous Allocation) (young) (initial-mark) 365M->363M(512M), 0.0018209 secs]
[GC concurrent-root-region-scan-start]
[GC concurrent-root-region-scan-end, 0.0002551 secs]
[GC concurrent-mark-start]
[GC concurrent-mark-end, 0.0020803 secs]
[GC remark, 0.0019438 secs]
[GC cleanup 390M->390M(512M), 0.0011861 secs]
[GC pause (G1 Evacuation Pause) (young) 408M->377M(512M), 0.0036792 secs]
[GC pause (G1 Evacuation Pause) (mixed) 406M->373M(512M), 0.0049298 secs]
[GC pause (G1 Humongous Allocation) (young) (initial-mark) 374M->374M(512M), 0.0023630 secs]
[GC concurrent-root-region-scan-start]
[GC concurrent-root-region-scan-end, 0.0002406 secs]
[GC concurrent-mark-start]
[GC concurrent-mark-end, 0.0030581 secs]
[GC remark, 0.0017632 secs]
[GC cleanup 401M->401M(512M), 0.0012557 secs]
[GC pause (G1 Evacuation Pause) (young) 406M->384M(512M), 0.0019846 secs]
[GC pause (G1 Evacuation Pause) (mixed) 411M->375M(512M), 0.0043338 secs]
[GC pause (G1 Humongous Allocation) (young) (initial-mark) 378M->376M(512M), 0.0027457 secs]
[GC concurrent-root-region-scan-start]
[GC concurrent-root-region-scan-end, 0.0002584 secs]
[GC concurrent-mark-start]
[GC concurrent-mark-end, 0.0025107 secs]
[GC remark, 0.0019660 secs]
[GC cleanup 398M->398M(512M), 0.0014801 secs]
[GC pause (G1 Evacuation Pause) (young) 404M->383M(512M), 0.0021358 secs]
[GC pause (G1 Evacuation Pause) (mixed) 411M->374M(512M), 0.0050584 secs]
[GC pause (G1 Humongous Allocation) (young) (initial-mark) 375M->373M(512M), 0.0020966 secs]
[GC concurrent-root-region-scan-start]
[GC concurrent-root-region-scan-end, 0.0001209 secs]
[GC concurrent-mark-start]
[GC concurrent-mark-end, 0.0019638 secs]
[GC remark, 0.0015324 secs]
[GC cleanup 392M->392M(512M), 0.0006834 secs]
[GC pause (G1 Evacuation Pause) (young) 402M->379M(512M), 0.0030798 secs]
[GC pause (G1 Evacuation Pause) (mixed) 405M->375M(512M), 0.0039288 secs]
[GC pause (G1 Humongous Allocation) (young) (initial-mark) 376M->375M(512M), 0.0019192 secs]
[GC concurrent-root-region-scan-start]
[GC concurrent-root-region-scan-end, 0.0002073 secs]
[GC concurrent-mark-start]
[GC concurrent-mark-end, 0.0020758 secs]
[GC remark, 0.0017001 secs]
[GC cleanup 395M->395M(512M), 0.0012313 secs]
[GC pause (G1 Evacuation Pause) (young) 405M->380M(512M), 0.0019197 secs]
[GC pause (G1 Evacuation Pause) (mixed) 405M->371M(512M), 0.0046159 secs]
[GC pause (G1 Humongous Allocation) (young) (initial-mark) 373M->370M(512M), 0.0020739 secs]
[GC concurrent-root-region-scan-start]
[GC concurrent-root-region-scan-end, 0.0003551 secs]
[GC concurrent-mark-start]
[GC concurrent-mark-end, 0.0026256 secs]
[GC remark, 0.0018522 secs]
[GC cleanup 391M->391M(512M), 0.0011986 secs]
[GC pause (G1 Evacuation Pause) (young) 401M->378M(512M), 0.0025042 secs]
[GC pause (G1 Evacuation Pause) (mixed) 408M->370M(512M), 0.0049526 secs]
[GC pause (G1 Humongous Allocation) (young) (initial-mark) 374M->372M(512M), 0.0026960 secs]
[GC concurrent-root-region-scan-start]
[GC concurrent-root-region-scan-end, 0.0001988 secs]
[GC concurrent-mark-start]
[GC concurrent-mark-end, 0.0019160 secs]
[GC remark, 0.0018313 secs]
[GC cleanup 395M->395M(512M), 0.0006708 secs]
[GC pause (G1 Evacuation Pause) (young) 399M->379M(512M), 0.0017431 secs]
[GC pause (G1 Evacuation Pause) (mixed) 403M->373M(512M), 0.0081398 secs]
[GC pause (G1 Humongous Allocation) (young) (initial-mark) 375M->375M(512M), 0.0014829 secs]
[GC concurrent-root-region-scan-start]
[GC concurrent-root-region-scan-end, 0.0002285 secs]
[GC concurrent-mark-start]
[GC concurrent-mark-end, 0.0019605 secs]
[GC remark, 0.0017267 secs]
[GC cleanup 392M->392M(512M), 0.0009188 secs]
[GC pause (G1 Evacuation Pause) (young) 403M->380M(512M), 0.0029113 secs]
[GC pause (G1 Evacuation Pause) (mixed) 405M->372M(512M), 0.0051794 secs]
[GC pause (G1 Humongous Allocation) (young) (initial-mark) 379M->374M(512M), 0.0027875 secs]
[GC concurrent-root-region-scan-start]
[GC concurrent-root-region-scan-end, 0.0002526 secs]
[GC concurrent-mark-start]
[GC concurrent-mark-end, 0.0032574 secs]
[GC remark, 0.0021611 secs]
[GC cleanup 400M->400M(512M), 0.0010629 secs]
[GC pause (G1 Evacuation Pause) (young) 410M->385M(512M), 0.0030525 secs]
[GC pause (G1 Evacuation Pause) (mixed) 415M->382M(512M), 0.0050355 secs]
[GC pause (G1 Humongous Allocation) (young) (initial-mark) 384M->382M(512M), 0.0025101 secs]
[GC concurrent-root-region-scan-start]
[GC concurrent-root-region-scan-end, 0.0002567 secs]
[GC concurrent-mark-start]
[GC concurrent-mark-end, 0.0021424 secs]
[GC remark, 0.0018735 secs]
[GC cleanup 413M->413M(512M), 0.0008304 secs]
[GC pause (G1 Evacuation Pause) (young) 416M->392M(512M), 0.0025784 secs]
[GC pause (G1 Evacuation Pause) (mixed) 416M->384M(512M), 0.0056336 secs]
[GC pause (G1 Humongous Allocation) (young) (initial-mark) 397M->386M(512M), 0.0025563 secs]
[GC concurrent-root-region-scan-start]
[GC concurrent-root-region-scan-end, 0.0002173 secs]
[GC concurrent-mark-start]
[GC concurrent-mark-end, 0.0019805 secs]
[GC remark, 0.0018110 secs]
[GC cleanup 410M->410M(512M), 0.0013091 secs]
[GC pause (G1 Evacuation Pause) (young) 413M->393M(512M), 0.0024511 secs]
[GC pause (G1 Evacuation Pause) (mixed)-- 418M->387M(512M), 0.0053457 secs]
[GC pause (G1 Humongous Allocation) (young) (initial-mark) 389M->387M(512M), 0.0013222 secs]
[GC concurrent-root-region-scan-start]
[GC concurrent-root-region-scan-end, 0.0001580 secs]
[GC concurrent-mark-start]
[GC concurrent-mark-end, 0.0035060 secs]
[GC remark, 0.0018715 secs]
[GC cleanup 412M->412M(512M), 0.0010810 secs]
[GC pause (G1 Evacuation Pause) (young) 417M->395M(512M), 0.0020484 secs]
[GC pause (G1 Evacuation Pause) (mixed)-- 423M->408M(512M), 0.0045212 secs]
[GC pause (G1 Humongous Allocation) (young) (initial-mark) 409M->408M(512M), 0.0023689 secs]
[GC concurrent-root-region-scan-start]
[GC concurrent-root-region-scan-end, 0.0002005 secs]
[GC concurrent-mark-start]
[GC concurrent-mark-end, 0.0020435 secs]
[GC remark, 0.0019860 secs]
[GC cleanup 433M->433M(512M), 0.0006230 secs]
[GC pause (G1 Evacuation Pause) (young) 435M->416M(512M), 0.0017039 secs]
[GC pause (G1 Evacuation Pause) (mixed)-- 439M->419M(512M), 0.0029174 secs]
[GC pause (G1 Evacuation Pause) (mixed)-- 445M->445M(512M), 0.0031867 secs]
[GC pause (G1 Humongous Allocation) (young) (initial-mark) 445M->444M(512M), 0.0011545 secs]
[GC concurrent-root-region-scan-start]
[GC concurrent-root-region-scan-end, 0.0000755 secs]
[GC concurrent-mark-start]
[GC pause (G1 Humongous Allocation) (young)-- 456M->456M(512M), 0.0013711 secs]
[GC pause (G1 Evacuation Pause) (young) 456M->456M(512M), 0.0007375 secs]
[GC pause (G1 Evacuation Pause) (young) 456M->456M(512M), 0.0007702 secs]
[Full GC (Allocation Failure)  456M->331M(512M), 0.0354269 secs]
[GC concurrent-mark-abort]
[GC pause (G1 Humongous Allocation) (young) (initial-mark) 340M->333M(512M), 0.0023023 secs]
[GC concurrent-root-region-scan-start]
[GC concurrent-root-region-scan-end, 0.0002264 secs]
[GC concurrent-mark-start]
[GC concurrent-mark-end, 0.0021625 secs]
[GC remark, 0.0018524 secs]
[GC cleanup 360M->360M(512M), 0.0015583 secs]
[GC pause (G1 Evacuation Pause) (young) 368M->340M(512M), 0.0027955 secs]
[GC pause (G1 Humongous Allocation) (young) (initial-mark) 341M->341M(512M), 0.0013078 secs]
[GC concurrent-root-region-scan-start]
[GC concurrent-root-region-scan-end, 0.0001257 secs]
[GC concurrent-mark-start]
[GC concurrent-mark-end, 0.0023674 secs]
[GC remark, 0.0023883 secs]
[GC cleanup 356M->356M(512M), 0.0011206 secs]
[GC pause (G1 Evacuation Pause) (young) 370M->349M(512M), 0.0026752 secs]
[GC pause (G1 Evacuation Pause) (mixed) 374M->352M(512M), 0.0034260 secs]
[GC pause (G1 Humongous Allocation) (young) (initial-mark) 356M->353M(512M), 0.0028797 secs]
[GC concurrent-root-region-scan-start]
[GC concurrent-root-region-scan-end, 0.0002096 secs]
[GC concurrent-mark-start]
[GC concurrent-mark-end, 0.0027999 secs]
[GC pause (G1 Evacuation Pause) (young) 384M->359M(512M), 0.0027373 secs]
[GC remark, 0.0014584 secs]
[GC cleanup 360M->360M(512M), 0.0011461 secs]
[GC pause (G1 Evacuation Pause) (young) 387M->366M(512M), 0.0044479 secs]
执行结束!共生成对象次数:11390
  
  
  
新生代收集器还是老年代收集器：
    新生代收集器：Serial、ParNew、Parallel Scavenge
    老年代收集器：Serial Old、Parallel Old、CMS
    整堆收集器：G1
吞吐量优先、停顿时间优先
    吞吐量优先：Parallel Scavenge收集器、Parallel Old 收集器。
停顿时间优先：CMS（Concurrent Mark-Sweep）收集器。
吞吐量与停顿时间适用场景
    停顿时间优先：
        交互多，对响应速度要求高
    吞吐量优先：
        交互少，计算多，适合在后台运算的场景。
串行并行并发
    串行：
        Serial、Serial Old
    并行：
        ParNew、Parallel Scavenge、Parallel Old
    并发：CMS、G1
算法
    复制算法：
        Serial、ParNew、Parallel Scavenge、G1
    标记-清除：
        CMS
    标记-整理：
        Serial Old、Parallel Old、G1
        
  
  