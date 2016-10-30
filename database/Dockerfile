FROM mysql

COPY database/scripts/mysql-mb.sql /docker-entrypoint-initdb.d/
COPY database/scripts/mysql-reg.sql /docker-entrypoint-initdb.d/
COPY database/scripts/mysql-user.sql /docker-entrypoint-initdb.d/

EXPOSE 3306