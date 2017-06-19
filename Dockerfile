FROM jboss/wildfly
RUN /opt/jboss/wildfly/bin/add-user.sh admin P@SSW0Rd --silent
CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]
ADD target/so44614679.war /opt/jboss/wildfly/standalone/deployments/
