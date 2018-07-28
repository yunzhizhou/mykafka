package com.epms.kafka.stream.timeextractor;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.streams.processor.TimestampExtractor;

import com.fasterxml.jackson.databind.JsonNode;
import com.epms.kafka.stream.model.Item;
import com.epms.kafka.stream.model.Order;
import com.epms.kafka.stream.model.User;

public class OrderTimestampExtractor implements TimestampExtractor {

	@Override
	public long extract(ConsumerRecord<Object, Object> record) {
		Object value = record.value();
		if (record.value() instanceof Order) {
			Order order = (Order) value;
			return order.getTransactionDate();
		}
		if (value instanceof JsonNode) {
			return ((JsonNode) record.value()).get("transactionDate").longValue();
		}
		if (value instanceof Item) {
			return LocalDateTime.of(2015, 12,11,1,0,10).toEpochSecond(ZoneOffset.UTC) * 1000;
		}
		if (value instanceof User) {
			return LocalDateTime.of(2015, 12,11,0,0,10).toEpochSecond(ZoneOffset.UTC) * 1000;
		}
		return LocalDateTime.of(2015, 11,10,0,0,10).toEpochSecond(ZoneOffset.UTC) * 1000;
	}

}
