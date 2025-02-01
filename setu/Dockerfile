# Use a base image with Java (not Tomcat)
FROM ubuntu:latest

# Install required dependencies
RUN apt-get update && apt-get install -y openjdk-17-jdk wget unzip

# Set environment variables
ENV CATALINA_HOME /usr/local/tomcat
ENV PATH $CATALINA_HOME/bin:$PATH

# Download and install Apache Tomcat
RUN wget https://downloads.apache.org/tomcat/tomcat-9/v9.0.80/bin/apache-tomcat-9.0.80.tar.gz \
    && mkdir -p $CATALINA_HOME \
    && tar xvf apache-tomcat-9.0.80.tar.gz -C $CATALINA_HOME --strip-components=1 \
    && rm apache-tomcat-9.0.80.tar.gz

# Set working directory to Tomcat webapps
WORKDIR $CATALINA_HOME/webapps/

# Copy your WAR file to Tomcat
COPY target/*.war ROOT.war

# Expose port 8080 for Tomcat
EXPOSE 8080

# Start Tomcat
CMD ["catalina.sh", "run"]
