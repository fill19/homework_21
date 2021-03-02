FROM postgres
EXPOSE 5432
ENV POSTGRES_PASSWORD chiks
ENV POSTGRES_DB films
COPY schema.sql /docker-entrypoint-initdb.d/