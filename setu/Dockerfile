# Use an Ubuntu base image
FROM ubuntu:latest

# Install required dependencies
RUN apt-get update && apt-get install -y openjdk-17-jdk wget unzip

# Set up environment variables
ENV CATALINA_HOME=/usr/local/tomcat
ENV PATH="${CATALINA_HOME}/bin:${PATH}"

# Download and install Apache Tomcat
RUN wget https://downloads.apache.org/tomcat/tomcat-9/v9.0.80/bin/apache-tomcat-9.0.80.tar.gz \
    && mkdir -p $CATALINA_HOME \
    && tar -xvzf apache-tomcat-9.0.80.tar.gz -C $CATALINA_HOME --strip-components=1 \
    && rm apache-tomcat-9.0.80.tar.gz

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