package com.mfpe.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import com.mfpe.model.AuditBenchmark;

@FeignClient(value = "auditbenchmark", url = "${BENCHMARK_SERVICE:http://localhost:8200}")
public interface AuditBenchmarkFeign {
	
	@GetMapping("/api/benchmark/audit-benchmark")
	public List<AuditBenchmark> getAuditBenchmark(@RequestHeader("Authorization") String jwt); 
	
}
