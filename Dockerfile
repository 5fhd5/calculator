# 使用轻量级的 JRE 镜像
FROM eclipse-temurin:17-jre

# 设置工作目录
WORKDIR /app

# 直接把本地打好的 jar 包复制到容器里
COPY target/calculator-1.0-SNAPSHOT.jar app.jar

# 启动命令
ENTRYPOINT ["java", "-jar", "app.jar"]