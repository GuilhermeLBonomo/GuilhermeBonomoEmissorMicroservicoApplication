# Etapa 1: Use uma imagem base do Maven para compilar o código
FROM maven:latest AS build
LABEL authors="Guilherme Bonomo"
# Defina o diretório de trabalho dentro do contêiner
WORKDIR /app

# Copie os arquivos do projeto Maven para o contêiner
COPY pom.xml .
COPY src ./src

# Execute a compilação e geração do arquivo .jar
RUN mvn clean package -DskipTests

# Etapa 2: Use uma imagem base do OpenJDK para rodar o aplicativo
FROM openjdk:20-jdk-slim

# Defina o diretório de trabalho dentro do contêiner
WORKDIR /app

# Copie o arquivo .jar gerado na etapa anterior para o ambiente de execução
COPY --from=build /app/target/*.jar app.jar

# Exponha a porta que a aplicação Spring Boot está configurada para usar
EXPOSE 8081

# Comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
