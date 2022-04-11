package com.Consume.feingClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.Consume.feingClient.decoder.IpAPIFeignDecoder;

@FeignClient(value = "IpAPI", url = "${IpAPI.host}", configuration = IpAPIFeignDecoder.class)
public interface IpAPI {
	
	@PostMapping(value = "{ip}" + "${IpAPI.uri}")
	String cosumesIpAPI(@PathVariable String ip);
}
