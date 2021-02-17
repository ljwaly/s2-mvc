package com.ljw.spring.mvc.s2;

import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;

import java.io.File;

/**
 * 此处嵌入tomcat进行mvc的启动
 *
 * 嵌入了一个内置tomcat
 */
public class SpringApplication {
    public static void main(String[] args)  {
        run(SpringApplication.class, args);
    }


    public static void run(Class<SpringApplication> springApplicationClass, String[] args)  {

        try {
            // 创建tomcat容器
            Tomcat tomcat = new Tomcat();
            tomcat.setPort(9999);

            // 读取项目路径，加载静态资源
            String basePath = System.getProperty("user.dir")
                    + File.separator;
            tomcat.getHost().setAppBase(basePath);

            // 改变文件读取路径，从resources目录下去读取资源文件
            StandardContext ctx = (StandardContext) tomcat.addWebapp(
                    "/",
                    basePath
                            + "src" + File.separator
                            + "main" + File.separator
                            + "resources"
                );

            // 禁止重新载入
            ctx.setReloadable(false);

            // class文件读取地址
            File additionWebInfClasses = new File("target/classes");

            // 创建WebRoot
            WebResourceRoot webResourceRoot = new StandardRoot(ctx);

            // tomcat内部读取class执行
            webResourceRoot.addPreResources(
                    new DirResourceSet(
                            webResourceRoot,
                            "/WEB-INF/classes",
                            additionWebInfClasses.getAbsolutePath(),
                            "/")
                );

            ctx.setResources(webResourceRoot);
            tomcat.start();


            // 异步等待请求执行(阻塞)
            tomcat.getServer().await();
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
