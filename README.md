##### 1. 创建topic
```
./kafka-topics.sh --create --zookeeper zoo1:2181 --replication-factor 1 --partitions 1 --topic orders
./kafka-topics.sh --create --zookeeper zoo1:2181 --replication-factor 1 --partitions 1 --topic items
./kafka-topics.sh --create --zookeeper zoo1:2181 --replication-factor 1 --partitions 1 --topic users
./kafka-topics.sh --create --zookeeper zoo1:2181 --replication-factor 1 --partitions 1 --topic gender-amount
./kafka-topics.sh --create --zookeeper zoo1:2181 --replication-factor 1 --partitions 1 --topic orderuser-repartition-by-item

```