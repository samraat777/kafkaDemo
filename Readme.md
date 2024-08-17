**Implementation of Kafka in Spring boot** \
\
Prerequisite -  Install Kafka and up the server using zookeeper/kraft - https://kafka.apache.org/quickstart \
Rest Endpoint Exposed - http://localhost:8080/message/kafka

Curl Request to test--\
curl --location 'http://localhost:8080/message/kafka' \
--header 'Content-Type: application/json' \
--data '{
"message" : "triggered from API"
}
'