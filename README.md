##### 1. 创建topic
```
./kafka-topics.sh --create --zookeeper zoo1:2181 --replication-factor 1 --partitions 1 --topic orders
./kafka-topics.sh --create --zookeeper zoo1:2181 --replication-factor 1 --partitions 1 --topic items
./kafka-topics.sh --create --zookeeper zoo1:2181 --replication-factor 1 --partitions 1 --topic users
./kafka-topics.sh --create --zookeeper zoo1:2181 --replication-factor 1 --partitions 1 --topic gender-amount
./kafka-topics.sh --create --zookeeper zoo1:2181 --replication-factor 1 --partitions 1 --topic orderuser-repartition-by-item

```

##### 2.启动DemoConsumerManualCommit
##### 3.启动PurchaseAnalysis
##### 4.启动UserProducer
##### 5.启动ItemProducer
##### 6.最后启动OrderProducer

##### 结果
```
client : consumer2 , topic: gender-amount2 , partition: 0 , offset = 0, key = male, value = 7.489721245848924E-67
client : consumer2 , topic: gender-amount2 , partition: 2 , offset = 0, key = female, value = 6.008913963681483E-67

```