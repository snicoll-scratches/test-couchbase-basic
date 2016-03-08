package com.example;

import javax.annotation.PostConstruct;

import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.Cluster;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Service
	static class Startup {

		@Autowired(required = false)
		private Bucket bucket;

		@Autowired(required = false)
		private Cluster cluster;

		@PostConstruct
		public void doStuff() {
			System.out.println("Bucket --> " + bucket);
			System.out.println("Cluster --> " + cluster);
		}


	}
}
