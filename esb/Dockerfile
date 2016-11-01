FROM nuwanbando/javabase:v2

RUN mkdir wso2 

COPY packs/wso2esb-5.0.0.zip wso2/

RUN cd wso2/ && \
        unzip wso2esb-5.0.0.zip


COPY esb/artifacts/* /wso2/wso2esb-5.0.0/repository/components/lib/

COPY esb/config/jndi.properties /wso2/wso2esb-5.0.0/repository/conf/jndi.properties

COPY workspace/messgeing_sampleCompositeApplication_1.0.0.car /wso2/wso2esb-5.0.0/repository/deployment/server/carbonapps/

CMD ["sh", "/wso2/wso2esb-5.0.0/bin/wso2server.sh"]

EXPOSE 9763
EXPOSE 9443
EXPOSE 8280
EXPOSE 8243