FROM openjdk:12

# Usuario para java, se evita root
RUN groupadd -r java && useradd --no-log-init -r -g java java
USER java

# Copia del ejecutable
VOLUME /tmp
COPY *.jar app.jar

# Puerto a exponer
EXPOSE 8080

# Ejecutamos la aplicación al iniciar el contenedor
ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "app.jar"]
