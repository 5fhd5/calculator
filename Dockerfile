# 直接使用轻量级 JRE 镜像
FROM eclipse-temurin:17-jre

# 设置工作目录
WORKDIR /app

# 把外部已经打包好的 jar 复制进来（注意这里改成了通配符，防止版本号变化）
COPY target/*.jar app.jar

# 启动命令
ENTRYPOINT ["java", "-jar", "app.jar"]