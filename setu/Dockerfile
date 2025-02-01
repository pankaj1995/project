# Use an official Tomcat image with Java
FROM tomcat:9.0-jdk17
# Set working directory to Tomcat’s webapps folder
WORKDIR /usr/local/tomcat/webapps/

# Copy your WAR file to the Tomcat webapps directory as ROOT.war
COPY target/*.war ROOT.war

# Expose port 8080 (default for Tomcat)
EXPOSE 8080

# Start Tomcat when the container runs
CMD ["/usr/local
