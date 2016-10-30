FROM nuwanbando/javabase:v2

RUN mkdir wso2 

COPY packs/wso2mb-3.1.0.zip wso2/

RUN cd wso2/ && \
        unzip wso2mb-3.1.0.zip

COPY mb2/config/broker.xml /wso2/wso2mb-3.1.0/repository/conf/broker.xml

COPY mb2/config/axis2.xml /wso2/wso2mb-3.1.0/repository/conf/axis2/axis2.xml

COPY artifacts/mysql-connector-java-5.1.34-bin.jar /wso2/wso2mb-3.1.0/repository/components/lib

COPY mb2/config/master-datasources.xml /wso2/wso2mb-3.1.0/repository/conf/datasources/master-datasources.xml

COPY mb2/config/registry.xml /wso2/wso2mb-3.1.0/repository/conf/registry.xml

COPY mb2/config/user-mgt.xml /wso2/wso2mb-3.1.0/repository/conf/user-mgt.xml

CMD ["sh", "/wso2/wso2mb-3.1.0/bin/wso2server.sh"]

EXPOSE 9763
EXPOSE 9443
EXPOSE 7611
EXPOSE 4000
EXPOSE 5672
EXPOSE 8672
EXPOSE 1883
EXPOSE 8883