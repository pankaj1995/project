# Use the official Tomcat image with Java 17
FROM tomcat:9.0-jdk17

# Set working directory to Tomcat’s webapps folder
WORKDIR /usr/local/tomcat/webapps/

# Copy your WAR file to the Tomcat webapps directory as ROOT.war
COPY target/*.war ROOT.war

# Expose port 8080 for Tomcat
EXPOSE 8080

# Start Tomcat
CMD ["catalina.sh", "run"]
