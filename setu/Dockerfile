# Use an Ubuntu base image with OpenJDK
FROM ubuntu:latest

# Install required dependencies
RUN apt-get update && apt-get install -y openjdk-17-jdk wget unzip

# Set environment variables
ENV CATALINA_HOME=/usr/local/tomcat
ENV PATH="${CATALINA_HOME}/bin:${PATH}"

# Download and install Apache Tomcat (use latest stable version)
RUN wget https://dlcdn.apache.org/tomcat/tomcat-9/v9.0.85/bin/apache-tomcat-9.0.85.tar.gz \
    && mkdir -p $CATALINA_HOME \
    && tar -xvzf apache-tomcat-9.0.85.tar.gz -C $CATALINA_HOME --strip-components=1 \
    && rm apache-tomcat-9.0.85.tar.gz

# Ensure the Tomcat scripts have execute permissions
RUN chmod +x $CATALINA_HOME/bin/*.sh

# Set working directory to Tomcat webapps
WORKDIR $CATALINA_HOME/webapps/

# Copy your WAR file to the Tomcat webapps directory
COPY target/*.war ROOT.war

# Expose port 8080 for Tomcat
EXPOSE 8080

# Start Tomcat
CMD ["/usr/local/tomcat/bin/catalina.sh", "run"]
