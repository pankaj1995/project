# Use the official Tomcat image (you can change the version if needed)
FROM tomcat:9.0

# Set working directory to Tomcat’s webapps folder
WORKDIR /usr/local/tomcat/webapps/

# Copy your WAR file from the target directory into the Tomcat webapps folder
COPY target/*.war ROOT.war

# Expose port 8080 (default for Tomcat)
EXPOSE 8080

# Start Tomcat when the container runs
CMD ["catalina.sh", "run"]
